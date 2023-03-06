package com.example.demo.bean;

public class Bill {
	
	private int billId;
	private String billName;
	private String billDesc;
	
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public String getBillDesc() {
		return billDesc;
	}
	public void setBillDesc(String billDesc) {
		this.billDesc = billDesc;
	}
	public Bill(int billId, String billName, String billDesc) {
		super();
		this.billId = billId;
		this.billName = billName;
		this.billDesc = billDesc;
	}
	public Bill() {
		super();
	}
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", billName=" + billName + ", billDesc=" + billDesc + "]";
	}
	
	

}
