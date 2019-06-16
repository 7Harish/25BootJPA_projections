package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="p")
public class Product {
	@Id
	@Column(name="id")
	@GeneratedValue
	private Integer prodId;
	@Column(name="name")
	private String prodName;
	@Column(name="ver")
	private String prodVer;
	@Column(name="codt")
	private Double prodCost;
	@Column(name="code")
	private String prodCode;
	public Product(Integer prodId, String prodName, String prodVer, Double prodCost, String prodCode) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodVer = prodVer;
		this.prodCost = prodCost;
		this.prodCode = prodCode;
	}
	public Product(String prodName, String prodVer, Double prodCost, String prodCode) {
		super();
		this.prodName = prodName;
		this.prodVer = prodVer;
		this.prodCost = prodCost;
		this.prodCode = prodCode;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodVer=" + prodVer + ", prodCost="
				+ prodCost + ", prodCode=" + prodCode + "]";
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdVer() {
		return prodVer;
	}
	public void setProdVer(String prodVer) {
		this.prodVer = prodVer;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
