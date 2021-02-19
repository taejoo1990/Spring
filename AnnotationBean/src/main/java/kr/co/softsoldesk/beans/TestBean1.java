package kr.co.softsoldesk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {

	private int data1;
	
	private DataBean1 data2;
	
	@Autowired
	private DataBean1 data3;
	
	
	@Qualifier("obj4")
	private DataBean2 data4;
	
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;
	
	@Autowired(required = false)
	@Qualifier("obj6")
	private DataBean2 data6;
	
	
	public TestBean1() {
		// TODO Auto-generated constructor stub
	}


	public int getData1() {
		return data1;
	}


	public void setData1(int data1) {
		this.data1 = data1;
	}


	public DataBean1 getData2() {
		return data2;
	}


	public DataBean1 getData3() {
		return data3;
	}


	public DataBean2 getData4() {
		return data4;
	}


	public DataBean2 getData5() {
		return data5;
	}


	public DataBean2 getData6() {
		return data6;
	}

	@Autowired
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	
}
