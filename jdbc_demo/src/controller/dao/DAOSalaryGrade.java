package controller.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;
import model.SalaryGrade;

public class DAOSalaryGrade extends IDAO<SalaryGrade>  {
	
	 public DAOSalaryGrade(Connection conn) {
		this.conn = conn;
		try {
			this.statement = this.conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public SalaryGrade[] selectAll() {
		Vector<SalaryGrade> sa = new Vector<SalaryGrade>();
		SalaryGrade[] result;
		
		try {
			String sql = "Select * from salary_grade";
			rs = statement.executeQuery(sql);
			int i = 0;
			while(rs.next()){
				SalaryGrade s = new SalaryGrade(
						rs.getInt(1),
						rs.getFloat(2),
						rs.getFloat(3));
				sa.add(s);
				i++;
			}
			result = new SalaryGrade[i];
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return sa.toArray(result);
	}

	@Override
	public SalaryGrade[] selectByName(String name) {
		
		return null;
	}

	public SalaryGrade[] selectByHighSalary( float high_salary){
		Vector<SalaryGrade> sa = new Vector<SalaryGrade>();
		SalaryGrade[] result;
		
		try {
			String sql = "Select * from salary_grade where high_salary =' "+ high_salary+ "'";
			rs = statement.executeQuery(sql);
			int i = 0;
			while(rs.next()){
				SalaryGrade s = new SalaryGrade(rs.getInt(1), rs.getFloat(2), rs.getFloat(3));
				sa.add(s);
				i++;
			}
			result = new SalaryGrade[i];
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return sa.toArray(result);
	}
	@Override
	public int insert(SalaryGrade s) {
		String sql = "insert into salary_grade (grade, high_salary, low_salary) values = (?,?,?)";
		
		try {
			this.preStatement= this.conn.prepareStatement(sql);
			this.preStatement.setInt(1, s.getGrade());
			this.preStatement.setFloat(2, s.getHighSalary());
			this.preStatement.setFloat(3, s.getLowSalary());
			int rowCount = this.preStatement.executeUpdate();
			return rowCount;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update(SalaryGrade s) {
		String sql = "UPDATE salary_grade SET HIGH_SALARY=? LOW_SALARY=? WHERE GRADE=?";
		try {
			this.preStatement = this.conn.prepareStatement(sql);
			this.preStatement.setFloat(1, s.getHighSalary());
			this.preStatement.setFloat(2, s.getLowSalary());
			this.preStatement.setInt(3, s.getGrade());
			
			int rowCount = this.preStatement.executeUpdate();
			return rowCount;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public void closeConnection() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
