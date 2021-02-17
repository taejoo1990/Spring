package kr.co.softsoldesk.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
	
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
	
	TestBean t1=ctx.getBean("t1", TestBean.class);
	
	List<String> l1=t1.getList1();
	List<Integer> l12=t1.getList2();
	List<DataBean> l13=t1.getList3();
	
	for(String temp : l1) {
		System.out.printf("list1 : %s\n", temp);
	}
	for(Integer temp : l12) {
		System.out.printf("list2 : %d\n", temp);
	}
	for(DataBean temp : l13) {
		System.out.printf("list2 : %s\n", temp);
	}
	Set<String> set=t1.getSet1();
	Set<Integer> set2=t1.getSet2();
	Set<DataBean> set3=t1.getSet3();
	
	for(String temp : set) {
		System.out.printf("set1 : %s\n", temp);
	}
	for(Integer temp : set2) {	
		System.out.printf("set2 : %d\n", temp);
	}
	for(DataBean temp : set3) {
		System.out.printf("set3 : %s\n", temp);
	}
	

	Map<String, Object> map1=t1.getMap1();
	
	String a1=(String)map1.get("a1");;
	int a2=(int)map1.get("a2");;
	boolean a3=(boolean)map1.get("a3");;
	double a4=(double)map1.get("a4");;
	List<String> a5=(List<String>)map1.get("a5");
	List<DataBean> a6=(List<DataBean>)map1.get("a6");
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	for(String tmp : a5) {
		System.out.println(tmp);
	}
	for(DataBean tmp : a6) {
		System.out.println(a6);
	}
	
	Properties prop=t1.getProp1();
	
	String p1 = prop.getProperty("p1");
	String p2 = prop.getProperty("p2");
	String p3 = prop.getProperty("p3");
	

	System.out.printf("prop1: %s\n", p1);
	System.out.printf("prop1: %s\n", p2);
	System.out.printf("prop1: %s\n", p3);
	
	
	
	

	
	ctx.close();

	}

}
