package kr.co.softsoldesk.beans;

public class SoldeskTv implements TV{

	public SoldeskTv() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void powerOn() {
		System.out.println("솔Tv전원on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("솔Tv전원off");
		
	}

	@Override
	public void powerUp() {
		System.out.println("솔Tv볼륨up");
		
	}

	@Override
	public void powerDown() {
		System.out.println("솔Tv볼륨down");
		
	}

}
