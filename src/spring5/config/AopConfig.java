package spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//开启注解扫描
@ComponentScan(basePackages = {"spring5.aop"})
//开启切面
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {


}
