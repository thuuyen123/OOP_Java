package controller.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import model.Bill;

public class DAOBill extends IDAO<Bill> {
	public DAOBill(Connection conn){
		this.conn = conn;
		try {
			this.statement = this.conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Bill[] selectAll() {
		Vector<Bill> vbill = new Vector<Bill>();
		Bill[] result;
		
		try {
			String sql = "SELECT * FROM tblBill";
			rs = statement.executeQuery(sql);
			int i = 0;
			while(rs.next()){
				Bill b = new Bill(rs.getInt(1),
						rs.getFloat(2), 
						rs.getInt(3));
				vbill.add(b);
				i++;
			}
			result = new Bill[i];
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return vbill.toArray(result);
	}

	@Override
	public Bill[] selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Bill[] searchByAmount(float amount){
		Vector<Bill> vbill = new Vector<Bill>();
		Bill[] result;
		
		try {
			String sql = "SELECT * FROM tblBill WHERE amount='"+amount+"'";
			rs = statement.executeQuery(sql);
			int i = 0;
			while(rs.next()){
				Bill b = new Bill(rs.getInt(1),
						rs.getFloat(2), 
						rs.getInt(3));
				vbill.add(b);
				i++;
			}
			result = new Bill[i];
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return vbill.toArray(result);
	}
	@Override
	public int insert(Bill b) {
		String sql = "INSERT INTO tblBill(amount, tblHiring_id) VALUES (?,?)"; 	
		try {
			this.preStatement = this.conn.prepareStatement(sql);
			this.preStatement.setFloat(1, b.getAmount());
			this.preStatement.setInt(2, b.getTblHiring_id());
			int rowCount = this.preStatement.executeUpdate();
			return rowCount;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int update(Bill b) {
		String sql ="UPDATE tblBill SET amount=?, tblHiring_id=? WHERE id=?";
		try {
			this.preStatement = this.conn.prepareStatement(sql);
			this.preStatement.setFloat(1, b.getAmount());
			this.preStatement.setInt(2, b.getTblHiring_id());
			this.preStatement.setInt(3, b.getId());
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
