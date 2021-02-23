package kr.co.softsoldesk.advisor;

import javax.annotation.PostConstruct;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdvisorClass {

	@Before("execution(* method1())")
	public void beforeMethod() {
		System.out.println("advisor.before method");
	}
	
	@After("execution(* method1())")
	public void afterMethod() {
		System.out.println("advisor.afer method");
	}
	
	@Around("execution(* method1())")
	public Object arroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Around method");
		Object result=pjp.proceed(); //method1()의 pointcut을 다시 로딩
		System.out.println("AroundMethod 호출2");
		return result;
	}
	
	@AfterReturning("execution(* method1())")
	public void afterReturningMethod() {
		System.out.println("afterReturning method");
	}
	
	@AfterThrowing("execution(* method1())")
	public void afterThrowingMethod() {
		System.out.println("afterThrowing 호출");
	}
}
