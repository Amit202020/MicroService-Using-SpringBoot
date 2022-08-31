package com.example.demo.entity;

public class Table {
	
	private int id;
	private String name;
	private int capacity;
	
	
	public Table(int id, String name, int capacity) {
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
	}
	
	
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
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	@Override
	public String toString() {
		return "Table [id=" + id + ", name=" + name + ", capacity=" + capacity + "]";
	}
}
