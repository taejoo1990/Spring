package kr.co.softsoldesk.beans;

public class AppleSpeaker implements TV {

	public AppleSpeaker() {
	System.out.println("애플스피커 생성자");
	}
	@Override
	public void powerOn() {}

	@Override
	public void powerOff() {}

	@Override
	public void volumeUp() {
		System.out.println("애플스피커의 볼륨을 올립니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("애플스피커의 볼륨을 낮춥니다.");
	}

}
