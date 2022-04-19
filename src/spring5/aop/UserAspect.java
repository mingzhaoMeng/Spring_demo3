package spring5.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class UserAspect {
    @Before(value = "execution(* spring5.aop.User.add())")
    public void addStrong(){
        System.out.println("用切面增强了一个方法----------");
    }

}
