package kr.co.softsoldesk.beans;

public class TestBeans {

	public TestBeans() {
	System.out.println("constructor");
	}
	
	//생성자가 호출된 후 자동으로 호출되는 메서드
	
	public void bean1_init() {
		System.out.println("TestBeans의 init 메서드");
	}
	
	public void bean1_destroy() {
		System.out.println("TestBeans의 destroy 메서드");
	}
	
	
}
