package kr.co.softsoldesk.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//SingleTon + type + IOC 컨테이너 작동시 객체생성
@Component
@Lazy
public class TestBean3 {
	
	public TestBean3() {
		System.out.println("TestBean3의 생성자");
	}

}
