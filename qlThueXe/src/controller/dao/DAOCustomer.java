package controller.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import model.Customer;

public class DAOCustomer extends IDAO<Customer>{
	public DAOCustomer(Connection conn) {
		this.conn = conn;
		try {
			this.statement = this.conn.createStatement();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Customer[] selectAll() {
		Vector<Customer> vtcus = new Vector<Customer>();
		Customer[] result;
		try {
			String sql = "Select * from tblcustomer";
			rs = statement.executeQuery(sql);
			int i = 0;
			while(rs.next()){
				Customer c = new Customer(rs.getInt(1),
						rs.getString(2), 
						rs.getString(3),
						rs.getString(4),
						rs.getString(5));
				vtcus.add(c);
				
				i++;
			}
			result = new Customer[i];
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		};
		return vtcus.toArray(result);
	}

	@Override
	public Customer[] selectByName(String name) {
		Vector<Customer>  vtCus = new Vector<Customer>();
		Customer[] result;
		
		try {
			String sql = "Select * from tblCustomer where name ='"+ name+ "'";
			rs = statement.executeQuery(sql);
			int i = 0;
			while(rs.next()){
				Customer c = new Customer(rs.getInt(1),
						rs.getString(2), 
						rs.getString(3),
						rs.getString(4),
						rs.getString(5));
				vtCus.add(c);
				
				i++;
			}
			result = new Customer[i];
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		};
		return vtCus.toArray(result);
	}

	@Override
	public int insert(Customer cus) {
		String sql = "INSERT INTO tblcustomer(name, yearofbirth, address, idCard) VALUES (?,?,?,?)";
		try{
			this.preStatement = this.conn.prepareStatement(sql);
			this.preStatement.setString(1, cus.getName());
			this.preStatement.setString(2, cus.getYearofbirth());
			this.preStatement.setString(3, cus.getAddress());
			this.preStatement.setString(4, cus.getIdCard());
			int rowcount = this.preStatement.executeUpdate();
			return rowcount;
		}catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update(Customer cus) {
		try {
			String sql = "UPDATE tblcustomer SET name =?, yearofbirth=?, address = ?, idCard =? WHERE id = ?;";
			this.preStatement = this.conn.prepareStatement(sql);
			this.preStatement.setString(1, cus.getName());
			this.preStatement.setString(2, cus.getYearofbirth());
			this.preStatement.setString(3, cus.getAddress());
			this.preStatement.setString(4, cus.getIdCard());
			this.preStatement.setInt(5, cus.getId());
			
			int rowcount = this.preStatement.executeUpdate();
			return rowcount;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public void closeConnection() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
