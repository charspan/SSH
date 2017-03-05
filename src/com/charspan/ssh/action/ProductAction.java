package com.charspan.ssh.action;

import com.charspan.ssh.domain.Product;
import com.charspan.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品管理的Action类
 */
public class ProductAction extends ActionSupport implements
		ModelDriven<Product> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6693787865324743541L;
	// 模型驱动需要使用的类
	private Product product = new Product();

	// Description Resource Path Location Type
	// Java compiler level does not match the version of the installed Java
	// project facet. ssh
	// Unknown Faceted Project Problem (Java Version Mismatch)

	 @Override
	public Product getModel() {
		return product;
	}

	/**
	 * struts和spring整合过程中按名称自动注入的业务层的类
	 */
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	/**
	 * 保存商品的执行方法：save
	 * 
	 * @return
	 */
	public String save() {
		System.out.println("ProductAction中的save方法执行了。。。");
		productService.save(product);
		return NONE;
	}
}
