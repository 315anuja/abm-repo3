package com.abm.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="tbl_flight")
@Entity
public class Flights {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int fId;
	private String filghtname;
	private String toDestination;
	private String fromDestination;

	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getFilghtname() {
		return filghtname;
	}
	public void setFilghtname(String filghtname) {
		this.filghtname = filghtname;
	}
	public String getToDestination() {
		return toDestination;
	}
	public void setToDestination(String toDestination) {
		this.toDestination = toDestination;
	}
	public String getFromDestination() {
		return fromDestination;
	}
	public void setFromDestination(String fromDestination) {
		this.fromDestination = fromDestination;
	}
	
	
	
	

}
