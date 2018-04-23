package com.atguigu.bookstore.dao;

import com.atguigu.bookstore.domain.Pic;

public interface PicDAO {
	/**
	 * 根据 id 获取指定 图片 对象
	 * 
	 * @param id
	 * @return
	 */
	public abstract Pic get(int id);

	/**
	 * 增加一条Pic对象
	 * 
	 * @param pic
	 */
	public abstract void insert(Pic pic);
	/**
	 * 根据 id 删除一条 图片记录
	 * 
	 * @param id
	 * @return
	 */
	public abstract void delete(int id);
	
	/**
	 * 更新一条图片记录
	 * 
	 * @param pic
	 * @return
	 */
	public abstract void update(Pic pic,int id);
}
