package model;

import java.io.Serializable;

public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String yearofbirth;
	private String address;
	private String idCard;
	public Customer(int id, String name, String yearofbirth, String address, String idCard) {
		super();
		this.id = id;
		this.name = name;
		this.yearofbirth = yearofbirth;
		this.address = address;
		this.idCard = idCard;
	}
	public Customer(){
		
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
	public String getYearofbirth() {
		return yearofbirth;
	}
	public void setYearofbirth(String yearofbirth) {
		this.yearofbirth = yearofbirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", yearofbirth=" + yearofbirth + ", address=" + address
				+ ", idCard=" + idCard + "]";
	}
	
	
	
}
