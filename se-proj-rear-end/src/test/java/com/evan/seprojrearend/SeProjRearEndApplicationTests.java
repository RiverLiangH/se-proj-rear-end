package com.evan.seprojrearend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class SeProjRearEndApplicationTests {
	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() throws SQLException {
		System.out.println("获取的数据库连接为:"+dataSource.getConnection());
	}

}
