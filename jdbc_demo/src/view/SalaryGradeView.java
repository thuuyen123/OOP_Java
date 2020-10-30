package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import model.SalaryGrade;

public class SalaryGradeView {
	Scanner sc;

	public SalaryGradeView() {
		sc = new Scanner(System.in);
	}
	public void showMessage( String mess){
		System.out.println("-----------");
		System.out.println(mess);
		System.out.println("------------");
	}
	public int menu(){
		System.out.println("1.Hien thi tat ca cac Salary_Grade");
		System.out.println("2. Hien thi Salary_Grade theo High_salary");
		System.out.println("3.Them Salary_grade");
		System.out.println("4. Sua Salary_grade");
		int choice =0;
		choice = sc.nextInt();
		return choice;
	}
	public SalaryGrade input(int choice){
		switch (choice) {
		case 2:
			BufferedReader sc2 = new BufferedReader(new InputStreamReader(System.in));
			SalaryGrade s = new SalaryGrade();
			System.out.println("Nhap muc luong can tim: ");
			float high ;
			try {
				high = Float.parseFloat(sc2.readLine());
				s.setHighSalary(high);
				return s;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		case 3:
			
			try {
				BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
				SalaryGrade insertS = new SalaryGrade();
				System.out.println("Them moi salaryGrade");
				
				System.out.println("Grade: ");
				insertS.setGrade(Integer.parseInt(sc.readLine()));
				 
				System.out.println("High_salary: ");
				insertS.setHighSalary(Float.parseFloat(sc.readLine()));
				
				System.out.println("Low_salary: ");
				insertS.setLowSalary(Float.parseFloat(sc.readLine()));
				
				
				return insertS;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} 
		case 4: 
			try {
				BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
				SalaryGrade updateS = new SalaryGrade();
				
				System.out.println("Sua salary");
				
				System.out.println("Grade: ");
				updateS.setGrade(Integer.parseInt(sc.readLine()));
				
				System.out.println("High_salary:" );
				updateS.setHighSalary(Float.parseFloat(sc.readLine()));
				
				System.out.println("Low_salary: ");
				updateS.setLowSalary(Float.parseFloat(sc.readLine()));
				
				
				return updateS;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}

		default:
			break;
		}
		return null;
	}
	
	public void exit(){
		this.sc.close();
	}
}
