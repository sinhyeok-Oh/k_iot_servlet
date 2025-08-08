package org.example.k4_iot_servlet.dao;

// JDBC에서 쓰일 SQL문 작성 (SQL 쿼리 집접 작성)

// "JDBC", MyBatis - SQL 쿼리 집접 작성
// "JPA": SQL 쿼리 제공 (+ JPQL, QueryDSL 사용)
public class UserSql {
    public static final String INSERT = "INSERT INTO users (name, email, country) VALUES (?, ?, ?)";
    public static final String SELECT_BY_ID = "SELECT * FROM users WHERE id = ?";
    public static final String SELECT_All = "SELECT * FROM users";
    public static final String UPDATE ="UPDATE users SET name = ?, email = ?, country = ? WHERE id = ?";
    public static final String DELETE = "DELETE FROM users WHERE id = ?";

}
