package main;

import java.util.Scanner;

import controller.BillControl;
import controller.CustomerControl;
import controller.StoreControl;
import view.BillView;
import view.CustomerView;
import view.StoreView;

public class Main {
	public static void main(String[] args){
//		CustomerView v = new CustomerView();
//		CustomerControl c = new CustomerControl(v);
//		c.run();
//		c.exit();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====MENU==========");
		System.out.println("1.Customer");
		System.out.println("2.Car");
		System.out.println("3.Bill");
		System.out.println("4.Hiring");
		System.out.println("5.Store");
		int choice =-1;
		System.out.println("Ban chon: ");
		choice = sc.nextInt();
		while(true){
			switch (choice) {
			case 0:
				break;
			case 1:
				CustomerView v = new CustomerView();
				CustomerControl c = new CustomerControl(v);
				c.run();
				c.exit();
				break;
			case 3:
				BillView vb = new BillView();
				BillControl cb = new BillControl(vb);
				cb.run();
				cb.exit();
				break;
			case 5:
				StoreView vS = new StoreView();
				StoreControl cS = new StoreControl(vS); 
				cS.run();
				cS.exit();
				break;
			default:
				break;
			}
			if(choice==0) break;
		}
	}
}
