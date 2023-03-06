package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {
	
	@Id
	private int restId;
	private String restName;
	private String restType;
	
	public int getRestId() {
		return restId;
	}
	public void setRestId(int restId) {
		this.restId = restId;
	}
	public String getRestName() {
		return restName;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public String getRestType() {
		return restType;
	}
	public void setRestType(String restType) {
		this.restType = restType;
	}
	public Restaurant(int restId, String restName, String restType) {
		super();
		this.restId = restId;
		this.restName = restName;
		this.restType = restType;
	}
	@Override
	public String toString() {
		return "Restaurant [restId=" + restId + ", restName=" + restName + ", restType=" + restType + "]";
	}
	public Restaurant() {
		super();
	}
	
	
	
	

}
