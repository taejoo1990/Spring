package kr.co.softsoldesk.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;

@Configuration
public class BeanConfigClass {
	
	@Bean(name="java1")
	public TestBean java1() {
		return new TestBean(200, "문자열", new DataBean1());
	}
	@Bean(name="java2")
	public TestBean java2() {
		TestBean t1=new TestBean();
		t1.setData1(700);
		t1.setData2("문자욤");
		t1.setData3(new DataBean1());
		return t1;
	}
	
	@Bean(name="java3", autowire=Autowire.BY_NAME)
	public TestBean2 java3() {
		return new TestBean2();
	}
	@Bean
	public DataBean2 data1() {
		return new DataBean2();
	}

	@Bean
	public DataBean2 data2() {
		return new DataBean2();
	}
	@Bean(name="java4", autowire=Autowire.BY_TYPE)
	public TestBean3 java4() {
		return new TestBean3();
	}
	@Bean
	public DataBean3 data3() {
		return new DataBean3();
	}


	

}
