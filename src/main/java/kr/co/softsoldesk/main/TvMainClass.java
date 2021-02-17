package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.beans.SamsungTv;
import kr.co.softsoldesk.beans.SoldeskTv;
import kr.co.softsoldesk.beans.TV;

public class TvMainClass {

	public static void main(String[] args) {
		
	
	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
	TV samsung=ctx.getBean("samsung", SamsungTv.class);
	
	CallPowerOn(samsung);
	CallPowerOff(samsung);
	CallPowerUp(samsung);
	CallPowerDown(samsung);
	
	ctx.close();
	
	//1. 컨테이너구동
	AbstractApplicationContext ctx2=new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
	
	//2. 객체생성 : XML에 ID=samsung으로 저장된 객체생성 , 객체타입선언 (캐스팅효과)
	ctx2.getBean("samsung", SamsungTv.class);
	
	//3. 객체의 인스턴스 실행
	
	CallPowerOn(samsung);
	CallPowerOff(samsung);
	CallPowerUp(samsung);
	CallPowerDown(samsung);
	
	System.out.println("---------------------------------------------");
	
	//2. 또 다른 객체생성 : XML에 ID=soldesk로 저장된 객체선언, 객체의 타입선언(캐스팅효과)
	TV soldesk=ctx2.getBean("soldesk", SoldeskTv.class);
	
	//3. 객체의 인스턴스 실행
	CallPowerOn(soldesk);
	CallPowerOff(soldesk);
	CallPowerUp(soldesk);
	CallPowerDown(soldesk);
	ctx2.close();
	
	}
	public static void CallPowerOn(TV tv) {
		tv.powerOn();
	}
	public static void CallPowerOff(TV tv) {
		tv.powerOff();
	}
	public static void CallPowerUp(TV tv) {
		tv.powerUp();
	}
	public static void CallPowerDown(TV tv) {
		tv.powerDown();
	}

}
