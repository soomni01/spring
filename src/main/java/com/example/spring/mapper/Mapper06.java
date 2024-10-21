package com.example.spring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface Mapper06 {

    @Select("""
            SELECT CustomerName
            FROM Customers
            WHERE CustomerID = #{id}
            """)
    String select01(Integer id);

    @Select("""
            SELECT ProductName
            FROM Products
            WHERE ProductID = #{i}
            """)
    String select02(int i);

    @Select("""
            SELECT CustomerName
            FROM Customers
            WHERE Country IN (#{c1}, #{c2})
            ORDER BY CustomerName
            """)
    List<String> select03(String c1, String c2);

    @Select("""
            SELECT ProductName
            FROM Products
            WHERE Price >= #{price1} AND Price <= #{price2}
            ORDER BY ProductName
            """)
    List<String> select04(int price1, int price2);

    @Select("""
            SELECT LastName
            FROM Employees
            WHERE BirthDate BETWEEN #{from} AND #{to}
            ORDER BY LastName
            """)
    List<String> select05(LocalDate from, LocalDate to);

    @Select("""
            SELECT CustomerName
            FROM Customers
            WHERE City = #{city1} OR City = #{city2}
            ORDER BY CustomerName
            """)
    List<String> select06(String city1, String city2);
}