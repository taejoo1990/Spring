package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;
@Component
public class TestBean1 {

	
	public void method1() {
		System.out.println("TestBean1의 Method1 호출");
		int a=10/0;
	}
	
}
