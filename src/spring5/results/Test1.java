package spring5.results;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.aop.User;
import spring5.config.AopConfig;

public class Test1 {
    @Test
    public void test1(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    //这个是完全注解开发，不用加载xml配置文件
    @Test
    public void test2(){
        ApplicationContext context
                = new AnnotationConfigApplicationContext(AopConfig.class);
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void test(){
        int x = 5;
        double y = 10.5;
        double z = y-=x/2.0;
        System.out.println("结果是："+z);
    }

}