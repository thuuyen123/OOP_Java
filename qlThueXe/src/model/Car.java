package model;

import java.io.Serializable;

public class Car implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private int seatNum;
	private int regYear;
	private int exaYear;
	private float price;
	private int tblStore_id;
	
	public Car(int id, String name, int seatNum, int regYear, int exaYear, float price, int tblStore_id) {
		super();
		this.id = id;
		this.name = name;
		this.seatNum = seatNum;
		this.regYear = regYear;
		this.exaYear = exaYear;
		this.price = price;
		this.tblStore_id = tblStore_id;
	}
	
	public Car() {
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
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	public int getRegYear() {
		return regYear;
	}
	public void setRegYear(int regYear) {
		this.regYear = regYear;
	}
	public int getExaYear() {
		return exaYear;
	}
	public void setExaYear(int exaYear) {
		this.exaYear = exaYear;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getTblStore_id() {
		return tblStore_id;
	}
	public void setTblStore_id(int tblStore_id) {
		this.tblStore_id = tblStore_id;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", seatNum=" + seatNum + ", regYear=" + regYear + ", exaYear="
				+ exaYear + ", price=" + price + ", tblStore_id=" + tblStore_id + "]";
	}
	
}
