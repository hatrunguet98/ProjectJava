package javajdbctutorial;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
import javajdbctutorial.ConnectionUtils;

public class QueryDataExample {
 
  public static void main(String[] args) throws ClassNotFoundException,
          SQLException {
 
      // Lấy ra đối tượng Connection kết nối vào DB.
      Connection connection = ConnectionUtils.getMyConnection();
 
      // Tạo đối tượng Statement.
      Statement statement = connection.createStatement();
      Statement statement1 = connection.createStatement();
      
 
      String sql = "Select id, name_user, age from user";
      String sql1 = "CREATE TABLE phuongtien(TenPt VARCHAR(255),MaPt INT(11)),userid INT(100)";
      String sql2="insert into phuongtien VALUES(?,?)";
      String sql3="ALTER TABLE phuongtien ADD FOREIGN KEY(userid) REFERENCES user(userid);";
      String sql4="Select p.TenPt,u.name_user from phuongtien as p JOIN user as u ON p.userid=u.userid";
      PreparedStatement pstm = connection.prepareStatement(sql);
//      pstm.setString(1,"xe may");
//      pstm.setInt(2,10);
//      pstm.execute();
      int addkey=statement1.executeUpdate(sql3);
      // Thực thi câu lệnh SQL trả về đối tượng ResultSet.
//      ResultSet rs = statement.executeQuery(sql);
//      int creTbpt=statement1.executeUpdate(sql1);
//      int creTbpt1=pstm.executeUpdate(sql2);
        ResultSet rs = statement.executeQuery(sql4);
//       
////       Duyệt trên kết quả trả về.
//      while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
//          int id = rs.getInt(1);
//          String name_user = rs.getString(2);
//          String age = rs.getString("age");
//          System.out.println("--------------------");
//          System.out.println("Id:" + id);
//          System.out.println("Name user:" + name_user);
//          System.out.println("Age user:" + age);
//      }
        while (rs.next()) {// Di chuyển con trỏ xuống bản ghi kế tiếp.
          String tenxe = rs.getString(1);
          String tenuser = rs.getString(2);
          System.out.println("--------------------");
          System.out.println("Tên xe:" + tenxe);
          System.out.println("Name user:" + tenuser);
      }
//       Đóng kết nối
      connection.close();
  }
 
}