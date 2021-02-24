package kr.co.softsoldesk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.co.softsoldesk.beans.JdbcBean;

public interface MapperInterface {

	//컬럼의 이름과 빈의 변수의 이름이 동일하면 생략가능.
	@Results({
			@Result(column = "int_data" , property = "int_data"),
			@Result(column = "str_data" , property = "str_data")	
	})
	@Select("select int_data, str_data from jdbc_table")
	List<JdbcBean> select_data();
	
	@Insert("insert into jdbc_table values(#{int_data},#{str_data})")
	void insert_data(JdbcBean bean); //jdbcBean필드명으로 자동매핑
	
	@Update("update jdbc_table set int_data=#{int_data}, str_data=#{str_data} where int_data=#{int_data};")
	void updata_data(JdbcBean bean);
	
	@Delete("delete from jdbc_table where int_data=#{int_data}")
	void delete_data(int data);
}
