package model;

import java.io.Serializable;
import java.util.Date;

public class Hiring implements Serializable{
	private static final long serialVersionUID = 1L;

	private int id;
	private Date startDate;
	private Date endDate;
	private int tblCustomer_id;
	private int tblCar_id;
	
	public Hiring() {
	}
	
	public Hiring(int id, Date startDate, Date endDate, int tblCustomer_id, int tblCar_id) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.tblCustomer_id = tblCustomer_id;
		this.tblCar_id = tblCar_id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getTblCustomer_id() {
		return tblCustomer_id;
	}
	public void setTblCustomer_id(int tblCustomer_id) {
		this.tblCustomer_id = tblCustomer_id;
	}
	public int getTblCar_id() {
		return tblCar_id;
	}
	public void setTblCar_id(int tblCar_id) {
		this.tblCar_id = tblCar_id;
	}
	@Override
	public String toString() {
		return "Hiring [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", tblCustomer_id="
				+ tblCustomer_id + ", tblCar_id=" + tblCar_id + "]";
	}
	
	

} 
