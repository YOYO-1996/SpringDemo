package tong.cglibtest;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;


/**
 * @description:
 * @author: Tong
 * @date: 2020-05-14 20:40
 */
public class ProxyFactory implements MethodInterceptor {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib proxy start..........");
        return method.invoke(target);
    }

    public static void main(String[] args) {
        Target target = new Target();
        ProxyFactory factory = new ProxyFactory(target);
        Target proxyTarget = (Target) factory.getProxyInstance();
        System.out.println(proxyTarget.getClass());
        proxyTarget.sayHello();
    }
}
