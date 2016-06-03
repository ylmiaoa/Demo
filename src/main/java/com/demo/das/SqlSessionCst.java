package com.demo.das;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.binding.MapperRegistry;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.mapping.ResultMapping;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;

public class SqlSessionCst extends SqlSessionTemplate {

    public SqlSessionCst(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    public void init() {
        SqlSessionFactory sqlSessionFactory = super.getSqlSessionFactory();
        Collection<ResultMap> maps = sqlSessionFactory.getConfiguration().getResultMaps();

        Iterator<ResultMap> itor = maps.iterator();
        ResultMap map = null;
        List<ResultMapping> mapping = null;
        while (itor.hasNext()) {
            map = itor.next();
            mapping = map.getResultMappings();

            for (ResultMapping mp : mapping) {
                System.out.println(mp.getColumn() + "-->" + mp.getProperty() + "-->" + mp.getJavaType());
            }

            System.out.println("end");
        }

        MapperRegistry mr = sqlSessionFactory.getConfiguration().getMapperRegistry();
        System.out.println(mr.getMappers());
    }
}
