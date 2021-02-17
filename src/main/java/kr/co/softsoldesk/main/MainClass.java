package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//getbean은 object타입이기 때문에 다운캐스팅을 해준다.
		HelloWorld en=(HelloWorld)ctx.getBean("hello");

		//위와 같이 클래스를 명시하는 과정인데 ,가독성측면에서 보면 아래의 방법이 더 적절하다.
		HelloWorld ko=ctx.getBean("hello2", HelloWorld.class);
		
		
		
		
	
		
		callsayHello(en);
		callsayHello(ko);
		
		ctx.close();
		
		
	}
	
	public static void callsayHello(HelloWorld hello) {
		hello.sayHello();
	}

}
