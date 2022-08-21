package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DbManagerTestSuite {
    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
                    counter++;
        }

        int expected = count + 5;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

//    @Test
//    void testSelectUsersAndPosts() throws SQLException {
//
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//        String countQuery = "SELECT U.FIRSTNAME, U.LASTNAME, USER_ID, COUNT(*) AS POSTS_NUMBER\n" +
//                "FROM USERS U\n" +
//                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
//                "GROUP BY USER_ID\n" +
//                "HAVING COUNT(*) >= 2;";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(countQuery);
//        int count = 0;
//        while (rs.next()) {
//            count = rs.getInt("POSTS_NUMBER");
//        }
//        String sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (3, 'Hi!')";
//        statement.executeUpdate(sql);
//        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (3, 'Hey!')";
//        statement.executeUpdate(sql);
//        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (3, 'Hello!')";
//        statement.executeUpdate(sql);
//
//
//        //When
//        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, USER_ID, COUNT(*) AS POSTS_NUMBER\n" +
//                "FROM USERS U\n" +
//                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
//                "GROUP BY USER_ID\n" +
//                "HAVING COUNT(*) >= 2;";
//        statement = dbManager.getConnection().createStatement();
//        rs = statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = 0;
//        while(rs.next()) {
//            System.out.println(rs.getString("FIRSTNAME") + ", " +
//                    rs.getString("LASTNAME"));
//            counter++;
//        }
//
//        int expected = count + 1;
//        Assertions.assertEquals(expected, counter);
//
//        rs.close();
//        statement.close();
//    }
}