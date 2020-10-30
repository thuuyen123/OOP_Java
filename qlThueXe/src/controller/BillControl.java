package controller;

import java.sql.SQLException;

import controller.dao.DAOBill;
import controller.utils.DBConnector;
import model.Bill;
import view.BillView;

public class BillControl {
	DAOBill dao;
	BillView view;
	Bill[] bill;
	public BillControl(BillView view ){
		try {
			dao = new DAOBill(DBConnector.dbconnector());
			this.view = view;

		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			this.dao.closeConnection();
			System.exit(0);
		}
	}
	public void run(){
		int choice = -1;
		do{
			 choice = view.menu();
			 switch (choice) {
			case 1:		
				bill = this.dao.selectAll();
				if(!bill.equals(null)){
					for (int i = 0; i < bill.length; i++) {
						System.out.println(bill[i].toString());
					}
				}
				break;
			case 2:
				Bill b = this.view.input(2);
				bill = this.dao.searchByAmount(b.getAmount());
				if(!bill.equals(null)){
					for (int i = 0; i < bill.length; i++) {
						System.out.println(bill[i].toString());
					}
				}
				break;
			case 3:
				Bill b2 = this.view.input(3);
				int rowCount = this.dao.insert(b2);
				this.view.showMess(rowCount + "row has been inserted!");
				break;
			case 4:
				Bill b3 = this.view.input(4);
				int rowCount2 = this.dao.update(b3);
				this.view.showMess(rowCount2 + "row has been updated!");
				break;
			default:
				break;
			}
		}while(choice!=0);
	}
	public void exit(){
		this.dao.closeConnection();
		this.view.exit();
	}
}
