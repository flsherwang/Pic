package com.atguigu.bookstore.dao;

import java.util.List;

/**
 * Dao 接口, 定义 Dao 的基本操作, 由 BaseDao 提供实现. 
 * @param <T>: Dao 实际操作的泛型类型
 */
public interface Dao<T> {
	
	/**
	 * 执行 INSERT 操作, 返回插入后的记录的 ID
	 * @param sql: 待执行的 SQL 语句
	 * @param args: 填充占位符的可变参数
	 * @return: 插入新记录的 id
	 */
	long insert(String sql, Object ... args);
	
	/**
	 * 执行 UPDATE 操作, 包括 INSERT(但没有返回值), UPDATE, DELETE
	 * @param sql: 待执行的 SQL 语句
	 * @param args: 填充占位符的可变参数
	 */
	void update(String sql, Object ... args);
	
	/**
	 * 执行单条记录的查询操作, 返回与记录对应的类的一个对象
	 * @param sql: 待执行的 SQL 语句
	 * @param args: 填充占位符的可变参数
	 * @return: 与记录对应的类的一个对象
	 */
	T get(String sql, Object ... args);
	
	/**
	 * 删除一条记录
	 * @param sql: 待执行的 SQL 语句
	 * @param args: 填充占位符的可变参数
	 */
	void delete(String sql,Object ... args);
}
