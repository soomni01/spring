package com.example.spring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface Mapper10 {


    // dynamic sql
    // if
    @Select("""
            <script>
            SELECT *
            FROM Customers
            WHERE 
                Country = 'USA'
                <if test="name != null">
                AND CustomerName = #{name}
                </if>
            
                <if test="contact != null">
                AND ContactName = #{contact}
                </if>
            </script>
            """)
    Map<String, Object> select1(String name, String contact);

    @Select("""
            <script>
            SELECT *
            FROM Employees
            WHERE EmployeeId = 3
                <if test="lastName != null">
                    AND LastName = #{lastName}
                </if>
                <if test="firstName != null">
                    AND FirstName = #{firstName}
                </if>
            </script>
            """)
    Map<String, Object> select2(String lastName, String firstName);

    @Select("""
            <script>
                SELECT *
                FROM Customers
                <trim prefix="WHERE" prefixOverrides="AND">
                    <if test="name != null">
                            CustomerName = #{name}
                    </if>
                    <if test="contact != null">
                        AND ContactName = #{contact}
                    </if>
                </trim>
            </script>
            """)
    Object select3(String name, String contact);

    @Select("""
            <script>
            SELECT * 
            FROM Employees 
                <trim prefix="WHERE" prefixOverrides="OR">
                    <if test="lname != null">
                        LastName = "abc"
                    </if>
                    <if test="fname != null">
                        OR FirstName = "def"
                    </if>
                </trim>
            </script>
            """
    )
    Object select4(String lname, String fname);

    @Select("""
             <script>
                 SELECT * FROM Customers
                 <trim prefix="WHERE">
                     <foreach collection="countryList" item="country" separator=","
                                 open="Country IN (" close=")">
                         #{country}
                     </foreach>
                 </trim>
             </script>
            """)
    List<Object> select5(List<String> countryList);


    @Select("""
            <script>
                SELECT * FROM Suppliers
                <trim prefix="WHERE">
                    <foreach collection="cityList" item="city" 
                        separator=", " open="City IN (" close=")">
                        #{city}
                    </foreach>
                </trim>
            </script>
            """)
    List<Object> select6(List<String> cityList);

    @Select("""
            <script>
            SELECT *
            FROM Customers
            WHERE CustomerId &lt; 5
            </script>
            """)
    List<Object> select7();

    // cdata 태그 사용
    @Select("""
            <script>
            <![CDATA[
                SELECT *
                FROM Customers
                WHERE CustomerId < 5
            ]]>
                <trim>
                </trim>
            </script>
            """)
    List<Object> select8();
}