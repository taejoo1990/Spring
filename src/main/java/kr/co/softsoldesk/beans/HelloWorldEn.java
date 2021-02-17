package kr.co.softsoldesk.beans;

public class HelloWorldEn implements HelloWorld {

	public HelloWorldEn() {
		System.out.println("En의 생성자");
	}
	@Override
	public void sayHello() {
		System.out.println("Hello");
	}

}
