package kr.co.softsoldesk.beans;

public class TestBean3 {

	public TestBean3() {
		System.out.println("constructor");
	}
	
	public void default_init() {
		System.out.println("init");
	}
	
	public void default_destroy() {
		System.out.println("destroy");
	}
	
	public void bean3_default_init() {
		System.out.println("bean3'init");
	}
	public void bean3_default_destroy() {
			System.out.println("bean3'destroy");
	}
	
}
