package controller;

import java.sql.SQLException;

import controller.dao.DAODepartment;
import controller.utils.ConnectionUtils;
import model.Department;
import view.DepartmentView;

public class DepartmentControl {
	DepartmentView view;
	DAODepartment dao;
	Department[] departments;
	public DepartmentControl(DepartmentView view) {
			try {
				dao = new DAODepartment(ConnectionUtils.getMyConnection());
				this.view = view;
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				this.dao.closeConnection();
				System.exit(0);
			}
	}
	public Department[] displayAll(){
		return this.dao.selectAll();
	}
	public Department[] displayByName( String name){
		return this.dao.selectByName(name);
	}
	public void exit(){
		this.dao.closeConnection();
		this.view.exit();
	}
	public void run(){
		int choice = -1;
		do{
			choice = view.menu();
			switch (choice) {
			case 1:
				departments = this.displayAll();
				if(!departments.equals(null)){
					for (int i = 0; i < departments.length; i++) {
						this.view.showMessage(departments[i].toString());
					}
				}
				break;
			case 2:
				Department de = this.view.input(2);
				departments = this.displayByName(de.getDeptName());
				if(!departments.equals(null)){
					for (int i = 0; i < departments.length; i++) {
						this.view.showMessage(departments[i].toString());
					}
				}
				break;
			case 3:
				Department insertD = this.view.input(3);
				int rowCout = this.dao.insert(insertD);
				this.view.showMessage(rowCout + "row has been inserted");
				break;
			case 4:
				Department upD = this.view.input(4);
				int updaterow = this.dao.update(upD);
				this.view.showMessage(updaterow + " row has been inserted");
				break;
			default:
				break;
			}
		}while(choice!=0);
	}
	
	
	
}
