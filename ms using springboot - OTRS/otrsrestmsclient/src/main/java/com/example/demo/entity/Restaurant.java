package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	
	private int id;
	private String name;
	
	private List<Table> tables = new ArrayList<Table>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Restaurant(int id, String name, List<Table> tables) {
		super();
		this.id = id;
		this.name = name;
		this.tables = tables;
	}

	public List<Table> getTables() {
		return tables;
	}

	public void setTables(List<Table> tables) {
		this.tables = tables;
	}

	@Override
	public String toString() {
		return " id= "+id+" name= "+name+" availability= "+tables;
	}

}

