package controller.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import model.Car;

public class DAOCar extends IDAO<Car>{
	
	public DAOCar(Connection conn){
		this.conn = conn;
		try {
			this.statement = this.conn.createStatement();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public Car[] selectAll() {
		Vector<Car> vCar = new Vector<Car>();
		Car[] result;
		
		try {
			String sql = "SELECT * FROM tblCar";
			rs = statement.executeQuery(sql);
			int i =0;
			while(rs.next()){
				Car c = new Car(rs.getInt(1), 
						rs.getString(2),
						rs.getInt(3), 
						rs.getInt(4),
						rs.getInt(5),
						rs.getFloat(6),
						rs.getInt(7));
				vCar.add(c);
				i++;
			}
			result = new Car[i];	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return vCar.toArray(result);
	}

	@Override
	public Car[] selectByName(String name) {
		Vector<Car> vCar = new Vector<Car>();
		Car[] result;
		
		try {
			String sql = "SELECT * FROM tblCar WHERE name='"+name+"'";
			rs = statement.executeQuery(sql);
			int i =0;
			while(rs.next()){
				Car c = new Car(rs.getInt(1), 
						rs.getString(2),
						rs.getInt(3), 
						rs.getInt(4),
						rs.getInt(5),
						rs.getFloat(6),
						rs.getInt(7));
				vCar.add(c);
				i++;
			}
			result = new Car[i];	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return vCar.toArray(result);
		
	}

	@Override
	public int insert(Car c) {
		String sql ="INSERT INTO tblCar( name, seatNum, regYear, exaYear, price, tblStore_id) VALUES (?,?,?,?,?,?)";
		try {
			this.preStatement = this.conn.prepareStatement(sql);
			this.preStatement.setString(1, c.getName());
			this.preStatement.setInt(2, c.getSeatNum());
			this.preStatement.setInt(3, c.getRegYear());
			this.preStatement.setInt(4,c.getExaYear());
			this.preStatement.setFloat(5, c.getPrice());
			this.preStatement.setInt(6, c.getTblStore_id());
			int rowCount = this.preStatement.executeUpdate();
			return rowCount;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
		// TODO Auto-generated method stub
	}

	@Override
	public int update(Car c) {
		
		String sql ="UPDATE  tblCar SET name=?, seatNum=?, regYear=?, exaYear=?, price=?, tblStore_id=?) WHERE id=? ";
		try {
			this.preStatement = this.conn.prepareStatement(sql);
			this.preStatement.setString(1, c.getName());
			this.preStatement.setInt(2, c.getSeatNum());
			this.preStatement.setInt(3, c.getRegYear());
			this.preStatement.setInt(4,c.getExaYear());
			this.preStatement.setFloat(5, c.getPrice());
			this.preStatement.setInt(6, c.getTblStore_id());
			this.preStatement.setInt(7, c.getId());
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
