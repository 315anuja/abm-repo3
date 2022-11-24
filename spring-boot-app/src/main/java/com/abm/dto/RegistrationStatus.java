package com.abm.dto;

public class RegistrationStatus {

	private String statusMessage;
	private boolean status;
	private int registerdCustomerID;
	
	
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getRegisterdCustomerID() {
		return registerdCustomerID;
	}
	public void setRegisterdCustomerID(int registerdCustomerID) {
		this.registerdCustomerID = registerdCustomerID;
	}
	
	
	
}
