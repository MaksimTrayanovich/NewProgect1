package by.tut.Lesson20;

import java.sql.*;

public class MySQLExample {
    public static void main(String[] args) throws ClassNotFoundException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "root")) {
            connection.setAutoCommit(false);
            connection.prepareStatement("\n" + "insert  into DEVELOPERS(NAME,WORK_POSITION,AGE)" +
                            "values('Nick','BA',30);")
                    .execute();
            PreparedStatement ps = connection.prepareStatement("select * from DEVELOPERS where ID = ?");
                    ps.setInt(1,1);
                ResultSet rs =ps.executeQuery();

//                connection.commit();
//                connection.rollback();
            while (rs.next()) {
                System.out.println(rs.getInt("ID") + " " + rs.getString("NAME") +
                        " " + rs.getInt("AGE"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
