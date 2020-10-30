package demo;


import controller.DepartmentControl;
import controller.EmployeeControl;
import controller.SalaryGradeControl;
import oracle.net.aso.d;
import view.DepartmentView;
import view.EmployeeView;
import view.SalaryGradeView;

public class TestMVC {
	public static void main(String[] args) {	
//		EmployeeView v = new EmployeeView();
//		EmployeeControl control = new EmployeeControl(v);
//		control.run();
//		control.exit();
		
		// department
//		DepartmentView dv = new DepartmentView();
//		DepartmentControl dcontrol = new DepartmentControl(dv);
//		dcontrol.run();
//		dcontrol.exit();
		
		//salary
		SalaryGradeView v = new SalaryGradeView();
		SalaryGradeControl c = new SalaryGradeControl(v);
		c.run();
		c.exit();
	}
}
