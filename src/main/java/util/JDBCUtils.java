package util;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.sql.*;

public class JDBCUtils {
    private JDBCUtils() {}
    private static Connection con;

    static {
        try {
            //初始化MySQL的Driver类
            Class.forName("com.mysql.cj.jdbc.Driver");
            //通过dom4j得到xml文件中连接数据库的信息
            SAXReader reader = new SAXReader();
            Document doc = reader.read("src/jdbc.xml");
            Element root = doc.getRootElement();
            Element ele = root.element("account");
            String url = String.valueOf(ele.element("url"));
            String user = String.valueOf(ele.element("user"));
            String password = String.valueOf(ele.element("password"));
            //连接数据库
            con = DriverManager.getConnection(url, user, password);
        } catch(Exception e) {
            throw new RuntimeException(e + ",数据库连接失败！");
        }
    }

    public static Connection getConnection() {
        return con;
    }

    public static void close(Connection con, Statement state) {
        if(con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(state != null) {
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection con, Statement state, ResultSet rs) {
        if(con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(state != null) {
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

