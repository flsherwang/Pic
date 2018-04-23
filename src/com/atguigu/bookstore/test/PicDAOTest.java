package com.atguigu.bookstore.test;

import java.sql.SQLException;

import org.junit.Test;

import com.atguigu.bookstore.dao.impl.PicDAOImpl;
import com.atguigu.bookstore.db.JDBCUtils;
import com.atguigu.bookstore.domain.Pic;
import com.atguigu.bookstore.web.ConnectionContext;

public class PicDAOTest {
PicDAOImpl picDAOImpl=new PicDAOImpl();
	@Test
	public void testGetInt() {
		try {
			ConnectionContext.getInstance().bind(JDBCUtils.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	Pic pic=picDAOImpl.get(1);
	System.out.println(pic.toString());
	}

	@Test
	public void testInsertPic() {
	
	}

	@Test
	public void testDeleteInt() {
		
	}

	@Test
	public void testUpdatePicInt() {
		
	}

}
