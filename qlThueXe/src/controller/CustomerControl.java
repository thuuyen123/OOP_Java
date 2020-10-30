package controller;

import java.sql.SQLException;

import controller.dao.DAOCustomer;
import controller.utils.ConnectionUtils;
import model.Customer;
import view.CustomerView;


public class CustomerControl {

	CustomerView view;
	DAOCustomer dao;
	Customer[] customer;
	public CustomerControl(CustomerView view) {
		try {
			dao = new DAOCustomer(ConnectionUtils.getMyConnection());
			this.view = view;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			this.dao.closeConnection();
			System.exit(0);
		}
	}

	public void run(){
		int choice = -1;
		do {
			choice = view.menu();
			switch (choice) {
			case 1:
				customer =this.displayAll();
				if(!customer.equals(null)){
					for (int i = 0; i < customer.length; i++) {
						this.view.showMessage(customer[i].toString());
					}
				}
				break;

			case 2:
				Customer e = this.view.input(2);
				customer=this.displayByName(e.getName());
				if(!customer.equals(null)){
					for (int i = 0; i < customer.length; i++) {
						this.view.showMessage(customer[i].toString());
					}
				}
				break;
			case 3: 
				Customer insertE = this.view.input(3);
				int rowCout = this.dao.insert(insertE);
				this.view.showMessage(rowCout+ " row has been inserted");
				break;
			case 4:
				Customer upE = this.view.input(4);
				int updateCount = this.dao.update(upE);
				this.view.showMessage(updateCount+ " row has been inserted");
				break;
			default:
				break;
			}
		} while (choice!=0);
	}
	
	private Customer[] displayAll(){
		return this.dao.selectAll();
	}
	private Customer[] displayByName(String name){
		return this.dao.selectByName(name);
	}
	public void exit(){
		this.dao.closeConnection();
		this.view.exit();
	}
}
