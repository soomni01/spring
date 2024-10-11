package com.example.spring.controller;

import com.example.spring.dto.C28.Employee;
import com.example.spring.dto.c26.Customer;
import com.example.spring.dto.c26.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Controller
@RequestMapping("main28")
public class Controller28 {
    @Autowired
    DataSource dataSource;

    //main28/sub1?name=흥민&contact=득점왕
    @PostMapping("sub1")
    public void sub1(String name, String contact) {
        String sql = """
                INSERT INTO Customers
                (CustomerName, ContactName)
                VALUES
                (?, ?)
                """;
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            try (conn; pstmt) {
                pstmt.setString(1, name);
                pstmt.setString(2, contact);
                //  pstmt.executeQuery(); // SELECT
                pstmt.executeUpdate(); // INSERT, UPDATE, DELETE

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("sub2")
    public void sub2() {
    }

    // sub3
    @GetMapping("sub3")
    public void sub3() {
    }

    @PostMapping("sub4")
    public String sub4(String name, String unit, String price, RedirectAttributes rttr) {
        String sql = """
                INSERT INTO Products
                (ProductName, Unit, Price)
                VALUES
                (?, ?, ?)
                """;
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            try (conn; pstmt) {
                pstmt.setString(1, name);
                pstmt.setString(2, unit);
                pstmt.setString(3, price);
                int count = pstmt.executeUpdate();
                if (count == 1) {
                    rttr.addFlashAttribute("message", "새 상품이 등록되었습니다.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "redirect:/main28/sub3";
    }

    @GetMapping("sub5")
    public void sub5(String id, Model model) {
        String sql = """
                SELECT * FROM Customers
                WHERE CustomerId = ?
                """;
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getString("CustomerId"));
                customer.setName(rs.getString("CustomerName"));
                customer.setContact(rs.getString("ContactName"));
                customer.setAddress(rs.getString("Address"));
                customer.setCity(rs.getString("City"));
                customer.setCountry(rs.getString("Country"));
                customer.setPostalCode(rs.getString("PostalCode"));
                model.addAttribute("customer", customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PostMapping("sub6")
    public String sub6(String id, RedirectAttributes rttr) {
        String sql = """
                DELETE FROM Customers
                WHERE CustomerId = ?
                """;

        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            try (con; pstmt) {
                pstmt.setString(1, id);
                int count = pstmt.executeUpdate();
                if (count == 1) {
                    rttr.addFlashAttribute("message", id + "번 고객이 삭제되었습니다.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // addAttribute : 쿼리에 붙임
        // addFlashAttribute : 모델에 붙임
        rttr.addAttribute("id", id);
        return "redirect:/main28/sub5";
    }

    // 상품을 상품번호로 조회하고
    // 해당 상품을 삭제하는 로직 작성
    @GetMapping("sub7")
    public void sub7(String id, Model model) {
        String sql = """
                SELECT *
                FROM Products
                WHERE ProductId = ?
                """;
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            try (con; pstmt; rs) {
                if (rs.next()) {
                    Product product = new Product();
                    product.setId(rs.getString("ProductId"));
                    product.setName(rs.getString("ProductName"));
                    product.setUnit(rs.getString("Unit"));
                    product.setPrice(rs.getString("Price"));
                    product.setCategoryId(rs.getString("CategoryId"));
                    product.setSupplierId(rs.getString("SupplierId"));
                    model.addAttribute("product", product);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("sub8")
    public String sub7(String id, RedirectAttributes rttr) {
        String sql = """
                DELETE
                FROM Products
                WHERE ProductId = ?
                """;

        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            try (con; pstmt) {
                pstmt.setString(1, id);
                int count = pstmt.executeUpdate();
                if (count == 1) {
                    rttr.addFlashAttribute("message", id + "번 상품이 삭제되었습니다.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        rttr.addAttribute("name", id);
        return "redirect:/main28/sub7";
    }

    @PostMapping("sub9")
    public String sub9(Customer customer, RedirectAttributes rttr) {
        String sql = """
                UPDATE Customers
                SET CustomerName = ?,
                    ContactName = ?,
                    Address = ?,
                    City = ?,
                    Country = ?,
                    PostalCode = ?
                WHERE CustomerId = ?
                """;

        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            try (con; pstmt) {
                pstmt.setString(1, customer.getName());
                pstmt.setString(2, customer.getContact());
                pstmt.setString(3, customer.getAddress());
                pstmt.setString(4, customer.getCity());
                pstmt.setString(5, customer.getCountry());
                pstmt.setString(6, customer.getPostalCode());
                pstmt.setString(7, customer.getId());
                pstmt.executeUpdate();
                rttr.addFlashAttribute("message", customer.getId() + "번 고객 정보가 수정되었습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        rttr.addAttribute("id", customer.getId());
        return "redirect:/main28/sub10";
    }

    @GetMapping("sub10")
    public void sub10(String id, Model model) {
        String sql = """
                SELECT *
                FROM Customers
                WHERE CustomerId = ?
                """;

        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            try (con; pstmt) {
                pstmt.setString(1, id);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    Customer customer = new Customer();
                    customer.setId(rs.getString("CustomerId"));
                    customer.setName(rs.getString("CustomerName"));
                    customer.setContact(rs.getString("ContactName"));
                    customer.setAddress(rs.getString("Address"));
                    customer.setCity(rs.getString("City"));
                    customer.setCountry(rs.getString("Country"));
                    customer.setPostalCode(rs.getString("PostalCode"));
                    model.addAttribute("customer", customer);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 직원 정보 조회 후 수정하는 2개의 메소드와 jsp, dto 만둘가
    @PostMapping("sub11")
    public String sub11(Employee employee, RedirectAttributes rttr) {
        String sql = """
                UPDATE Employees
                SET LastName = ?,
                    FirstName = ?,
                    BirthDate = ?,
                    Photo = ?,
                    Notes = ?
                WHERE EmployeeId = ?
                """;
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            try (con; pstmt) {
                pstmt.setString(1, employee.getLastName());
                pstmt.setString(2, employee.getFirstName());
                pstmt.setString(3, employee.getBirthDate());
                pstmt.setString(4, employee.getPhoto());
                pstmt.setString(5, employee.getNotes());
                pstmt.setString(6, employee.getId());
                pstmt.executeUpdate();
                rttr.addFlashAttribute("message", employee.getId() + "번 직원의 정보가 수정되었습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        rttr.addAttribute("id", employee.getId());
        return "redirect:/main28/sub12";
    }

    @GetMapping("sub12")
    public void sub12(String id, Model model) {
        String sql = """
                SELECT *
                FROM Employees
                WHERE EmployeeId = ?
                """;
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            try (con; pstmt; rs) {
                if (rs.next()) {
                    Employee employee = new Employee();
                    employee.setLastName(rs.getString("LastName"));
                    employee.setFirstName(rs.getString("FirstName"));
                    employee.setBirthDate(rs.getString("BirthDate"));
                    employee.setPhoto(rs.getString("Photo"));
                    employee.setNotes(rs.getString("Notes"));
                    employee.setId(rs.getString("EmployeeId"));
                    model.addAttribute("employee", employee);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
