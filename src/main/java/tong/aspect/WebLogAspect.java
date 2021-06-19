package tong.aspect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;


/**
 * @author ：Tong
 * @date ：Created in 2020/1/20 12:53
 * @description：
 * @version: $
 */
@Aspect
@Component
@Slf4j
public class WebLogAspect {

    @Pointcut("execution( * tong.controller.*.*(..))")
    public void controllerLog() {
    }

    @Pointcut("execution( * tong.service.*.*(..))")
    public void serviceLog() {
    }

    @Before("controllerLog()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        log.info("========================================== Start ==========================================");
        // 打印请求 url
        log.info("URL                 : {}", request.getRequestURL().toString());
        // 打印 Http method
        log.info("HTTP Method         : {}", request.getMethod());
        // 打印调用 controller 的全路径以及执行方法
        log.info("Class Method        : {}.{}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName());
        // 打印请求的 IP
        log.info("IP                  : {}", request.getRemoteAddr());
        // 打印请求入参
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String[] parameterNames = methodSignature.getParameterNames();
        int count = -1;
        for (Object object : joinPoint.getArgs()) {
            count++;
            if (
                    object instanceof MultipartFile
                            || object instanceof HttpServletRequest
                            || object instanceof HttpServletResponse
            ) {
                continue;
            }
            try {
                log.info("请求的参数" + parameterNames[count] + "为: " + new ObjectMapper().writeValueAsString(object));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @AfterReturning(returning = "response", pointcut = "controllerLog()")
    public void doAfterReturning(JoinPoint joinPoint, Object response) throws JsonProcessingException {

        if (response != null) {
            log.info("返回的参数为 : " + new ObjectMapper().writeValueAsString(response));
        }
        log.info("=========================================== End ===========================================\n");
        // 每个请求之间空一行
    }
}
