package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBCUtils {
    public static void main(String[] args) throws SQLException {
        Connection con = JDBCUtils.getConnection();
        String sql = "SELECT * FROM sort";
        //创建PreparedStatement对象，并将sql语句发送到数据库
        PreparedStatement pst = con.prepareStatement(sql);
        //取得执行后的结果集
        ResultSet rs = pst.executeQuery();
        //输出sort表中第二列的所有数据
        while(rs.next()) {
            System.out.println(rs.getString(2));
        }
        JDBCUtils.close(con, pst, rs);
    }
}
