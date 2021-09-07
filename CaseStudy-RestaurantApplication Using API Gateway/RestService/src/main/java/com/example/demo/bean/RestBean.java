package com.example.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RestBean {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="restName")
	private String restName;
	
	@Column(name="restDesc")
	private String restDesc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
	}

	public String getRestDesc() {
		return restDesc;
	}

	public void setRestDesc(String restDesc) {
		this.restDesc = restDesc;
	}

	public RestBean() {
		super();
	}

}
