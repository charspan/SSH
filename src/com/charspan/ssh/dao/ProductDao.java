package com.charspan.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.charspan.ssh.domain.Product;

/**
 * 商品管理的DAO类
 */
public class ProductDao extends HibernateDaoSupport {

	public void save(Product product) {
		System.out.println("ProductDao中的save方法执行了。。。");
		this.getHibernateTemplate().save(product);
	}

}
