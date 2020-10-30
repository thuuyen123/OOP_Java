package controller;

import java.sql.SQLException;

import controller.dao.DAOSalaryGrade;
import controller.utils.ConnectionUtils;
import model.SalaryGrade;
import view.SalaryGradeView;

public class SalaryGradeControl {
	SalaryGradeView view;
	DAOSalaryGrade dao;
	SalaryGrade[] salarys;
	
	public SalaryGradeControl(SalaryGradeView view){
		try {
			dao = new DAOSalaryGrade(ConnectionUtils.getMyConnection());
			this.view = view;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			this.dao.closeConnection();
			System.exit(0);
		}
	}
	private SalaryGrade[] displayAll(){
		return this.dao.selectAll();
	}
	private SalaryGrade[] displayByHighGrade(float high){
		return this.dao.selectByHighSalary(high);
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
				salarys = this.displayAll();
				if(!salarys.equals(null)){
					for (int i = 0; i < salarys.length; i++) {
						this.view.showMessage(salarys[i].toString());
					}
				}
				break;
			case 2:
				SalaryGrade s = this.view.input(2);
				salarys = this.displayByHighGrade(s.getHighSalary());
				if(!salarys.equals(null)){
					for (int i = 0; i < salarys.length; i++) {
						this.view.showMessage(salarys[i].toString());
					}
				}
				break;
			case 3:
				SalaryGrade insertS = this.view.input(3);
				int rowCount = this.dao.insert(insertS);
				this.view.showMessage(rowCount+ "row has been inserted");
				break;
			case 4: 
				SalaryGrade updateS = this.view.input(4);
				int rowUp = this.dao.update(updateS);
				this.view.showMessage(rowUp + " row has been inserted");
				break;
			default:
				break;
			}
			
		}while(choice!=0);
	}
}
