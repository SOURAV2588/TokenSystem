package com.tokensystem.domain;

import java.time.Instant;

public class Customer {

	private String customerName;
	private boolean isPrivilaged;
	private Instant entryTime;
	private int assignedTokenNumber;
	
	
	public Customer(String customerName, boolean isPrivilaged, Instant entryTime) {
		this.customerName = customerName;
		this.isPrivilaged = isPrivilaged;
		this.entryTime = entryTime;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int getAssignedTokenNumber() {
		return assignedTokenNumber;
	}

	public void setAssignedTokenNumber(int assignedTokenNumber) {
		this.assignedTokenNumber = assignedTokenNumber;
	}

	public boolean isPrivilaged() {
		return isPrivilaged;
	}

	public void setPrivilaged(boolean isPrivilaged) {
		this.isPrivilaged = isPrivilaged;
	}

	public Instant getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Instant entryTime) {
		this.entryTime = entryTime;
	}
	
	public String toString() {
		return this.customerName + " is assigned Token Number : " + this.getAssignedTokenNumber();
	}
}
