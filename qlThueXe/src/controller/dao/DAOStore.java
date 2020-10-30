package controller.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;
import model.Store;

public class DAOStore extends IDAO<Store>{
	public DAOStore(Connection conn){
		this.conn = conn;
		try {
			this.statement = this.conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Store[] selectAll() {
		Vector<Store> st = new Vector<Store>();
		Store[] result;
		try {
			String sql = "SELECT * FROM tblStore";
			rs = statement.executeQuery(sql);
			int i =0;
			while(rs.next()){
				Store s = new Store(rs.getInt(1),
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4));
				st.add(s);
				i++;
			}
			result = new Store[i];
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return st.toArray(result);
	}

	@Override
	public Store[] selectByName(String name) {
		Vector<Store> st = new Vector<Store>();
		Store[] result;
		
		try {
			String sql = "SELECT * FROM tblStore WHERE name='" + name + "'";
			rs = statement.executeQuery(sql);
			int i =0;
			while(rs.next()){
				Store s = new Store(rs.getInt(1),
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4));
				st.add(s);
				i++;
			}
			result = new Store[i];
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return st.toArray(result);
	}

	@Override
	public int insert(Store s) {
		String sql = "INSERT INTO tblStore(name, address, description) VALUES (?,?,?) ";
		try {
			this.preStatement = this.conn.prepareStatement(sql);
			this.preStatement.setString(1, s.getName());
			this.preStatement.setString(2, s.getAddress());
			this.preStatement.setString(3, s.getDescription());
			int rowCount = this.preStatement.executeUpdate();
			return rowCount;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int update(Store s) {
		String sql = "UPDATE tblStore SET name=?, address=?, description=? WHERE id=?";
		try {
			this.preStatement = this.conn.prepareStatement(sql);
			this.preStatement.setString(1, s.getName());
			this.preStatement.setString(2, s.getAddress());
			this.preStatement.setString(3, s.getDescription());
			this.preStatement.setInt(4, s.getId());
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
