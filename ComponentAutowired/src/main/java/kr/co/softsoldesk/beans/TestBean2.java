package kr.co.softsoldesk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean2 {

	private int data1;
	private String data2;
	private double data3;
	private DataBean4 data4;
	private DataBean5 data5;
	

	public TestBean2() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public TestBean2(@Value("100") int data1, @Value("문자열") String data2, @Value("3.5") double data3, DataBean4 data4, DataBean5 data5) {
		this.data1=data1;
		this.data2=data2;
		this.data3=data3;
		this.data4=data4;
		this.data5=data5;
	}
	
	public int getData1() {
		return data1;
	}
	public String getData2() {
		return data2;
	}
	public double getData3() {
		return data3;
	}
	public DataBean4 getData4() {
		return data4;
	}
	public DataBean5 getData5() {
		return data5;
	}
	
	
	
}
