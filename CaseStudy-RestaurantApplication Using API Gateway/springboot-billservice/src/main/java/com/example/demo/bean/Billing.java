package com.example.demo.bean;

public class Billing {

	private int billId;
	private String billName;
	private String billDesc;

	public Billing(int billId, String billName, String billDesc) {
		super();
		this.billId = billId;
		this.billName = billName;
		this.billDesc = billDesc;
	}

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

	public Billing() {
		super();
	}

}
