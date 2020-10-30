package model;

import java.io.Serializable;

public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private float amount;
	private int tblHiring_id;
	public Bill(int id, float amount, int tblHiring_id) {
		super();
		this.id = id;
		this.amount = amount;
		this.tblHiring_id = tblHiring_id;
	}
	public Bill() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public int getTblHiring_id() {
		return tblHiring_id;
	}
	public void setTblHiring_id(int tblHiring_id) {
		this.tblHiring_id = tblHiring_id;
	}
	@Override
	public String toString() {
		return "Bill [id=" + id + ", amount=" + amount + ", tblHiring_id=" + tblHiring_id + "]";
	}

	
}
