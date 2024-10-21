package com.example.spring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface Mapper09 {

    @Update("""
            UPDATE db1.my_table58
            SET money = money - #{money}
            WHERE name = 'kim'
            """)
    int updateMoney1(Integer money);

    @Update("""
            UPDATE db1.my_table58
            SET money = money + #{money}
            WHERE name = 'lee'
            """
    )
    int updateMoney2(Integer money);
}
