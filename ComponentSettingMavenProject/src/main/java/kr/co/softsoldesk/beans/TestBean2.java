package kr.co.softsoldesk.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//이름을 사용해도, 싱글톤으로 활용되기 때문에 타입으로 하는 것과 별반 차이가 없다.
//다수의 ID로 Bean객체를 이용하고자 한다면 ConfigClass에서 다수의 bean을 생성
@Component("t2")
//혹은 같은 ID라도 다른 주소를 사용하고 한다면, Scope를 주어진행.
@Scope("prototype")
public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TestBean2의 생성자 ");
		}
	
	@Bean(name="t2_2")
	public TestBean2 t3() {
		return new TestBean2();
	}

}
