package T27_9_2019;

public class IntPhoneNumber extends PhoneNumber {
	private String countrycode;
	
	public IntPhoneNumber(String countrycode) {
		this.countrycode = countrycode;
	}
	//De y thu tu countrycode theo co so du lieu yeu cau
	public IntPhoneNumber(String countrycode,int area, String number) {
		super(area,number);
		this.countrycode = countrycode;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public void display() {
		System.out.println(countrycode+" - "+super.getArea()+" - "+super.getNumber());
	}
	
	
}
