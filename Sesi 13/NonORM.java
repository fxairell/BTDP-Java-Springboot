import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class NonORM {
    String host = "localhost";
    String db = "hacktiv8";
    String user = "root";
    String pass = "";
    String driver = "com.mysql.jdbc.Driver";
    String koneksi = "";

    koneksi = "jdbc:mysql://" + host + ":3306/" + db + "?user=" + "&password=" + pass;

    Class.forName(driver).newInstance();
    Connection con = DriverManager.getConnection(koneksi);
    Statement stmt = con.createStatement();

    String ReqUser = request.getParameter("username");
    String ReqPass = request.getParameter("password");
    String QUERY_INSERT = "INSERT INTO Mahasiswa VALUES (" + ReqUser + "," + ReqPass + " )";
}