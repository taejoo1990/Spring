package kr.co.softsoldesk.beans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class SamsungTv implements TV {

	public SamsungTv() {
		System.out.println("생성자");
	}
	
	@Override
	public void powerOn() {
		System.out.println("전원켜짐");
		
	}

	@Override
	public void powerOff() {
		System.out.println("전원꺼짐");
		
	}

	@Override
	public void powerUp() {
		System.out.println("볼륨증가");
		
	}

	@Override
	public void powerDown() {
		System.out.println("볼륨감소");
		
	}

	
	
}
