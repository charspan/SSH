package com.charspan.ssh.domain;

public class Product {

	/**
	 * 商品编号
	 */
	private Integer pid;
	/**
	 * 商品名称
	 */
	private String pname;
	/**
	 * 商品价格
	 */
	private Double price;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
