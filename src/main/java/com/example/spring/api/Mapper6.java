package com.example.spring.api;

import com.example.spring.dto.a6.Customer;
import com.example.spring.dto.a6.Supplier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Mapper6 {
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

    @Select("""
            SELECT SupplierId id,
                   SupplierName name,
                   ContactName contact,
                   Address,
                   City,
                   PostalCode,
                   Country,
                   Phone
            FROM Suppliers
            WHERE SupplierID=#{supplierID}
            """)
    Supplier selectSupplierById(Integer supplierId);
}