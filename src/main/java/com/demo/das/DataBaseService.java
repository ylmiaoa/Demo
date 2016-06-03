package com.demo.das;

import com.github.abel533.sql.SqlMapper;

public class DataBaseService {

    private SqlMapper sqlMapper;

    public void setSqlMapper(SqlMapper sqlMapper) {
        this.sqlMapper = sqlMapper;
    }

    public void selectOne() {
        String sql = "SELECT 1 FROM DUAL";

        String rst = sqlMapper.selectOne(sql, String.class);

        System.out.println(rst);
    }
}
