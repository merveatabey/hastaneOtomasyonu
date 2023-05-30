package Helper;
import java.sql.*;
public class DBConnection {
    Connection c = null;

    public DBConnection() {
    }

    public Connection connDB() {    //database'e bağlan adında bir fonksiyon
        try {
            this.c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hastane_otomasyonu?user=root&password=merive123");       //veritabanı bilgileri
            return c;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;
    }
}
