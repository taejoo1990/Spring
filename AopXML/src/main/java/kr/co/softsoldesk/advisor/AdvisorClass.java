package kr.co.softsoldesk.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {

	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	//==around 실습 ------------
	
	/*
	 * public Object arroundMethod(ProceedingJoinPoint pjp)throws Throwable {
	 * 
	 * System.out.println("arroundMethod 호출"); Object obj=pjp.proceed(); return obj;
	 * }
	 */	
	
	
		public int arroundMethod(ProceedingJoinPoint pjp)throws Throwable {
		
		System.out.println("arroundMethod 호출");
		int a1=(Integer)pjp.proceed();
		return a1;
	}

}
