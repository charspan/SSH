package com.charspan.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.charspan.ssh.dao.ProductDao;
import com.charspan.ssh.domain.Product;

/**
 * 商品管理的业务层类
 */
@Transactional
public class ProductService {

	/**
	 * 业务层按名称自动注入DAO的类
	 */
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void save(Product product) {
		System.out.println("ProductService中的save方法执行了。。。");
		productDao.save(product);
	}

}
