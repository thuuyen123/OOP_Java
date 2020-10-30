package view;

import java.util.Scanner;

public class CarView {
	Scanner sc ;
	public CarView(){
		sc = new Scanner(System.in);
	}
	public void showMess(String mess){
		System.out.println("---------------");
		System.out.println(mess);
		System.out.println("-----------------");

	}
	public int menu(){
		int choice = 0;
		System.out.println("1. Hien thi tat ca Car");
		System.out.println("2. Hien thi CAR theo ten");
		System.out.println("3. Them car");
		System.out.println("4. Sua Car");
		choice = sc.nextInt();
		return choice;
	}
	
}
