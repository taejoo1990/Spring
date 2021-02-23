package kr.co.softsoldesk.beans;

public class TestBean1 {

	public void method1() {
		System.out.println("beans.TestBean1.method1, 기본()");
	
	}
	public void method1(int a1) {
		System.out.println("beans.TestBean1.method1(), int 1개");
	}
	public int methodInt(int a10) {
		System.out.println("인트형 메서드");
		return 100;
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
