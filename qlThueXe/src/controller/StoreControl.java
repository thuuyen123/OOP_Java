package controller;

import java.sql.SQLException;

import controller.dao.DAOStore;
//import controller.utils.ConnectionUtils;
import controller.utils.DBConnector;
import model.Store;
import view.StoreView;

public class StoreControl {
	DAOStore dao;
	StoreView view;
	Store[] store;
	
	public StoreControl(StoreView view){
		try {
			dao = new DAOStore(DBConnector.dbconnector());
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
				store = this.dao.selectAll();
				if(!store.equals(null)){
					for (int i = 0; i < store.length; i++) {
						this.view.showmessage(store[i].toString());
					}
				}
				break;
			case 2:
				Store s = this.view.input(2);
				store = this.dao.selectByName(s.getName());
				if(!store.equals(null)){
					for (int i = 0; i < store.length; i++) {
						this.view.showmessage(store[i].toString());
					}
				}
				break;
			case 3:
				Store insertS = this.view.input(3);
				int rowCount = this.dao.insert(insertS);
				this.view.showmessage(rowCount + " row has been inserted!");
				break;
			case 4:
				Store updateS = this.view.input(4);
				int rowC = this.dao.update(updateS);
				this.view.showmessage(rowC +" row has been updated!");
			default:
				break;
			}
		} while (choice!=0);

	}
	public void exit(){
		this.dao.closeConnection();
		this.view.exit();
	}
}
