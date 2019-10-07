package T27_9_2019;

public class PhoneNumber {
	protected int area;
	protected String number;
	public PhoneNumber(int area, String number) {
		super();
		this.area = area;
		this.number = number;
	}
	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void display() {
		System.out.println(area+" + "+number);
	}
	
	
}
