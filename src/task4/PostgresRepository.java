package task4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TTN on 05.04.2017.
 */
public class PostgresRepository implements Repository {

    //driver name and db url
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5433/postgres";

    //credentials
    static final String USER = "admin";
    static final String PASS = "admin";

    @Override
    public List<Vegetable> getVegetables() {
        Connection conn = null;
        Statement stmt = null;

        List<Vegetable> vegetables = new ArrayList<>();
        try {
            //register driver
            Class.forName(JDBC_DRIVER);

            //open a connection
            System.out.println("Commecting to DB...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected Db successfully...");

            //execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String sql = "SELECT * FROM vegetables";
            ResultSet rs = stmt.executeQuery(sql);

            //extract data fron result set
            while (rs.next()) {
                //retrive by column name
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int calories = rs.getInt("calories");
                int weight = rs.getInt("weight");

                vegetables.add(new Vegetable(id, name, calories, weight));
            }
            rs.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
        return vegetables;
    }

}
