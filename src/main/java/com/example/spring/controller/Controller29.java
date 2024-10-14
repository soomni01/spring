package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
@RequestMapping("main29")
public class Controller29 {
    @Autowired
    DataSource dataSource;

    @RequestMapping("sub1")
    public void sub1() throws SQLException {
        String sql = """
                INSERT INTO db1.my_table15
                (col1, col2, col3, col4, col5)
                VALUES
                (?,?, ?, ?, ?)
                """;

        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        try (conn; ps) {
            ps.setString(1, "some date");
            ps.setInt(2, 5678);
            ps.setDouble(3, 12345.67);
            ps.setDate(4, Date.valueOf("2024-10-14"));
            ps.setTimestamp(5, Timestamp.valueOf("2024-10-15 11:13:50"));
            ps.executeUpdate();
        }
    }

    @RequestMapping("sub2")
    public void sub2() throws SQLException {
        String sql = """
                SELECT *
                FROM db1.my_table15
                LIMIT 1
                """;
        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        try (conn; ps) {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String col1 = rs.getString("col1");
                int col2 = rs.getInt("col2");
                double col3 = rs.getDouble("col3");
                Date col4 = rs.getDate("col4");
                LocalDate col41 = rs.getDate("col4").toLocalDate();
                Timestamp col5 = rs.getTimestamp("col5");
                LocalDateTime col51 = rs.getTimestamp("col51").toLocalDateTime();

                System.out.println("col1 = " + col1);
                System.out.println("col2 = " + col2);
                System.out.println("col3 = " + col3);
                System.out.println("col4 = " + col4);
                System.out.println("col5 = " + col5);

                System.out.println("col41 = " + col41);
                System.out.println("col51 = " + col51);
            }
        }
    }

    @GetMapping("sub3")
    public void sub3() throws SQLException {

    }

    @PostMapping("sub4")
    public void sub4(String val1,
                     Integer val2,
                     Double val3,
                     LocalDate val4,
                     LocalDateTime val5) throws SQLException {
        String sql = """
                INSERT INTO db1.my_table15
                (col1, col2, col3, col4, col5)
                VALUES
                (?,?,?,?,?)
                """;
        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        try (conn; ps) {
            ps.setString(1, val1);
            ps.setInt(2, val2);
            ps.setDouble(3, val3);
            ps.setDate(4, Date.valueOf(val4));
            ps.setTimestamp(5, Timestamp.valueOf(val5));
            ps.executeUpdate();
        }
    }

    @GetMapping("sub5")
    public void sub5() throws SQLException {

    }

    @PostMapping("sub6")
    public void sub6(String title,
                     Integer price,
                     Double score,
                     LocalDate published,
                     LocalDateTime inserted) throws SQLException {

        String sql = """
                INSERT INTO db1.my_table16
                (title, price, score, published, inserted)
                VALUES
                (?,?,?,?,?)
                """;
        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        try (conn; ps) {
            ps.setString(1, title);
            ps.setInt(2, price);
            ps.setDouble(3, score);
            ps.setDate(4, Date.valueOf(published));
            ps.setTimestamp(5, Timestamp.valueOf(inserted));
            ps.executeUpdate();
        }
    }

    @GetMapping("sub7")
    public void sub7() throws SQLException {
    }

    @PostMapping("sub8")
    public String sub8(Integer isbn,
                       String title,
                       String author,
                       Integer price,
                       LocalDate published, RedirectAttributes rttr) throws SQLException {
        String sql = """
                INSERT INTO db1.book
                (isbn, title, author, price, date)
                VALUES
                (?,?,?,?,?)
                """;
        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        try (conn; ps) {
            ps.setInt(1, isbn);
            ps.setString(2, title);
            ps.setString(3, author);
            ps.setInt(4, price);
            ps.setDate(5, Date.valueOf(published));
            int count = ps.executeUpdate();
            if (count == 1) {
                rttr.addFlashAttribute("message", "새 책이 등록되었습니다.");
            }
        }
        return "redirect:/main29/sub7";
    }
}
