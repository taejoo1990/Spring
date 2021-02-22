package kr.co.softsoldesk.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean1 {

	public TestBean1() {
		System.out.println("TestBean1의 생성자");
	}
}
