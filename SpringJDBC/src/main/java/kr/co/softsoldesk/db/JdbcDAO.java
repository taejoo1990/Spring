package kr.co.softsoldesk.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.co.softsoldesk.beans.JdbcBean;

@Component
public class JdbcDAO {

	
	//DB에 접근하기 위한 기능 (쿼리를 오라클로 전달)
	@Autowired
	private JdbcTemplate db;
	@Autowired
	private MapperClass mapper; // MapperClass mapper=new MapperClass(); 객체선언을 Autowired가 대신 함
	
	
	//Insert 쿼리
	public void insert_data(JdbcBean bean) {
		String sql="insert into jdbc_table(int_data, str_data) values(?,?)";
		db.update(sql, bean.getInt_data(), bean.getStr_data());
	}
	
	//select
	public List<JdbcBean> select_data() {
		String sql="select * from jdbc_table";
		List<JdbcBean> list=db.query(sql, mapper);
		return list;
	}
	
	public void update_data(JdbcBean bean, int key) {
		String sql = "update jdbc_table set int_data=?, str_data=? where int_data=?";
		db.update(sql, bean.getInt_data(), bean.getStr_data(), key);
	}
}
