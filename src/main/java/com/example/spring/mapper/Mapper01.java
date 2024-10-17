package com.example.spring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Mapper01 {

    @Select("""
            SELECT CustomerName
            FROM Customers
            WHERE CustomerId = 1
            """)
    public String selectName();

    @Select("""
            SELECT ProductName
            FROM Products
            WHERE ProductId = 1
            """)
    public String selectProductName();

    @Select("""
            SELECT FirstName
            FROM Employees
            WHERE EmployeeId = 3
            """)
    public String selectEmployeeName();
}
