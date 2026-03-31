package com.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.ProductVO;
//dao는 메서드 바구니
public class ProductDAO {
	
	public SqlSession sqlSession;
	
	public ProductDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert() {
		ProductVO productVO = new ProductVO();
		sqlSession.insert("product.insert", productVO);
	}
	
}
