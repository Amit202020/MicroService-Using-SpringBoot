package com.example.restservice.model;

public class Restaurant {

	private String id;
	private String name;
	private String desc;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}

	public Restaurant(String id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public Restaurant() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
