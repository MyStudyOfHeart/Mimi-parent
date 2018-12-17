package com.mihao.domain;

public class Phon {

	private String brand;
	private Integer size;
	public Phon(String brand, Integer size) {
		super();
		this.brand = brand;
		this.size = size;
	}
	public Phon() {
		super();
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	
}
