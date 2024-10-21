package com.example.spring.mapper;

import com.example.spring.dto.c35.Dto59;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Mapper05 {
    @Select("""
            SELECT student_id studentId,
                   model_number modelNumber,
                   product_name productName,
                   birth_date birthDate,
                   inserted inserted,
                   score score
            FROM db1.my_table59
            """)
    List<Dto59> select1();

    @Select("""
            SELECT *
            FROM db1.my_table59
            """)
    List<Dto59> select2();
}