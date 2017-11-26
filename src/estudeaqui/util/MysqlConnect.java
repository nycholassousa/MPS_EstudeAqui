package estudeaqui.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class MysqlConnect {

    private Connection conn;
    private Statement statement;
    public static MysqlConnect db;

    public MysqlConnect() {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "estudeAqui";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "3gLqv6WtwVPWx279";
        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection) DriverManager.getConnection(url + dbName, userName, password);
        } catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }

    /**
     *
     * @return MysqlConnect Database connection object
     */
    public static synchronized MysqlConnect getDbCon() {
        if (db == null) {
            db = new MysqlConnect();
        }
        return db;
    }

    /**
     *
     * @param query String The query to be executed
     * @return a ResultSet object containing the results or null if not
     * available
     * @throws SQLException
     */
    public ResultSet query(String query) throws SQLException {
        statement = db.getConn().createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }

    /**
     * @desc Method to insert data to a table
     * @param insertQuery String The Insert query
     * @return boolean
     * @throws SQLException
     */
    public int insert(String insertQuery) throws SQLException {
        statement = db.getConn().createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
    }

    public Connection getConn() {
        return conn;
    }

}
