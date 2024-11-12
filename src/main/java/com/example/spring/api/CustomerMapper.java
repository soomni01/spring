package com.example.spring.api;

import com.example.spring.dto.a6.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CustomerMapper {
    @Select("""
            SELECT CustomerID id,
                   CustomerName name,
                   ContactName contact,
                   Address,
                   City,
                   PostalCode,
                   Country
            FROM Customers
            WHERE CustomerID=#{customerID}
            """)
    Customer selectById(Integer customerId);
}