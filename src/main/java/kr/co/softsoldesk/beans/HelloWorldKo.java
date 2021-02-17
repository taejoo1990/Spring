package kr.co.softsoldesk.beans;

public class HelloWorldKo implements HelloWorld {

	
	public HelloWorldKo() {
		System.out.println("Kr의 생성자");
	}
	@Override
	public void sayHello() {
		System.out.println("안녕하세요");
		
	}

}
