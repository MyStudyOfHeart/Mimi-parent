package com.mihao.domain;

import java.util.List;

public class People {

	private String name;
	private Phon phon;
	private List<Cat> cats;
	private Cat[] cats2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Phon getPhon() {
		return phon;
	}
	public void setPhon(Phon phon) {
		this.phon = phon;
	}
	public List<Cat> getCats() {
		return cats;
	}
	public void setCats(List<Cat> cats) {
		this.cats = cats;
	}
	public Cat[] getCats2() {
		return cats2;
	}
	public void setCats2(Cat[] cats2) {
		this.cats2 = cats2;
	}
	
}
