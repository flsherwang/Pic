package com.atguigu.bookstore.dao.impl;

import com.atguigu.bookstore.dao.PicDAO;
import com.atguigu.bookstore.domain.Pic;

public class PicDAOImpl extends BaseDAO<Pic> implements PicDAO {

	@Override
	public Pic get(int id) {
		String sql = "SELECT title FROM Pic where id=?";
		return get(sql, id);
	}

	@Override
	public void insert(Pic pic) {
		String sql = "INSERT INTO Pic(title,content,picture,album,type1,type2,createname,createtime) values (?, ?,?,?,?,?,?,?)";
		insert(sql,  pic.getTitle(), pic.getContent(),pic.getPicture(),pic.getAlbum(),pic.getType1(),pic.getType2(),pic.getCreatename(),pic.getCreatetime());
	}

	@Override
	public void delete(int id) {
		String sql="DELETE FROM Pic WHERE id=?";
		delete(sql, id);
		
	}

	@Override
	public void update(Pic pic,int id) {
		String sql="UPDATE Pic SET title =?, content =?, picture=?,album=?,type1=?,type2=?,createname=?,createtime=? WHERE id=?";
		update(sql,pic.getTitle(),pic.getContent(),pic.getPicture(),pic.getAlbum(),pic.getType1(),pic.getType2(),pic.getCreatename(),pic.getCreatetime(),pic.getId());
		
	}

	

}
