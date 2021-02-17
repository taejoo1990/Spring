package kr.co.softsoldesk.beans;

public class SamsungTv implements TV{

	private AppleSpeaker speaker;
	private int price;
	
	public SamsungTv() {
		System.out.println("삼성티비 생성자");
	}
	public SamsungTv(AppleSpeaker speaker, int price) {
		speaker=this.speaker;
		price=this.price;
	}
	@Override
	public void powerOn() {
		System.out.println("삼성TV의 전원을 킵니다");
		
	}
	@Override
	public void powerOff() {
		System.out.println("삼성TV의 전원을 끕니다");
		
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
		
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
		
	}
	
	
	
	
	
	public AppleSpeaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
}

