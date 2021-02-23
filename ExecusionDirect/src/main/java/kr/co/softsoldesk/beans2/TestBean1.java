package kr.co.softsoldesk.beans2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


public class TestBean1 {

	public void method1() {
		System.out.println("또 다른 패키지 beans2.TestBean1.method1, 기본()");

	}
	public void method1(String a2) {
		System.out.println("beans.TestBean1.method1(), String 1개");
	}
	public void method1(int a3, int a4) {
		System.out.println("beans.TestBean1.method1() int 2개");
	}
	public void method1(int a5, String a6) {
		System.out.println("beans.TestBean1.method1() int1개, String1개");
	}
	
	public void method2() {
		System.out.println("beans.TestBean2.method2() 기본");
		
	}
	
	
	
	
}
