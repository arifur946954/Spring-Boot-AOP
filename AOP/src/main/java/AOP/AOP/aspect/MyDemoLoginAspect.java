package AOP.AOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class MyDemoLoginAspect {
    //@Before("execution (public void addAccount())")
    //any type of method where add is exist
    @Before("execution (public void add*())")
    public void beforeAddAccountAdvice(){
        System.out.println("Excutiction before advice on Aspect");

    }
}
