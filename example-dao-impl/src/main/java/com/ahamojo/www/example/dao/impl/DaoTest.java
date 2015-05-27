package com.ahamojo.www.example.dao.impl;

import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;


public class DaoTest {
	public static void main(String[] args) throws Exception{
        String url = "jdbc:postgresql://localhost:5433/library";
        Driver driver = (Driver) (Class.forName("org.postgresql.Driver").newInstance());
        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally

        Properties info = new Properties();
        info.put("userName","fengzhenxing");
        info.put("password","123456");
        Connection conn = driver.connect(url,info);
        System.out.println("==========="+conn);

        DSLContext create = DSL.using(conn, SQLDialect.POSTGRES_9_4);

        //int flag = create.execute("select * from author;");

        //create.execute("INSERT INTO author(id, first_name, last_name) VALUES (1,'feng','zhenxing')");
        //create.execute("INSERT INTO author(id, first_name, last_name) VALUES (2,'James','feng')");
        Result<Record> records = create.select().from("author").fetch();

        for(Record record : records){
        	System.out.println(record);
        }

	}
}
