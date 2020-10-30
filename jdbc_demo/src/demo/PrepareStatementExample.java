package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.utils.ConnectionUtils;
 
 
public class PrepareStatementExample {
 
  public static void main(String[] args) throws ClassNotFoundException,
          SQLException {
            Connection connection = ConnectionUtils.getMyConnection();
 
            String sql = "Select emp.Emp_Id, emp.Emp_No, emp.Emp_Name, emp.Dept_Id from Employee emp "
              + " where emp.Emp_Name like ? and emp.Dept_Id = ? ";
 
            	PreparedStatement pstm = connection.prepareStatement(sql);
 
      pstm.setString(1, "%S");
      pstm.setInt(2, 20);
 
      ResultSet rs = pstm.executeQuery();
 
      while (rs.next()) {
          System.out.println(" ---- ");
          System.out.println("EmpId : " + rs.getInt("Emp_Id"));
          System.out.println("EmpNo : " + rs.getString(2));
          System.out.println("EmpName : " + rs.getString("Emp_Name"));
      }
      
      System.out.println();
      System.out.println("Set other parameters ..");
      
      // Tái sử dụng PreparedStatement.
      // Sét đặt các tham số khác.
      pstm.setString(1, "KI%");
      pstm.setInt(2,10);
      
      // Thực thi câu lệnh truy vấn.
      rs = pstm.executeQuery();
      
      while (rs.next()) {
          System.out.println(" ---- ");
          System.out.println("EmpId : " + rs.getInt("Emp_Id"));
          System.out.println("EmpNo : " + rs.getString(2));
          System.out.println("EmpName : " + rs.getString("Emp_Name"));
      }
  }
}
