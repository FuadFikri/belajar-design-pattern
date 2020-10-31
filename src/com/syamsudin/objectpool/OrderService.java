package com.syamsudin.objectpool;

public class OrderService {

    public void save(String data) {
        Connection connection = DatabasePool.getConnection();
        connection.sql("insert inro " + data);
        DatabasePool.close(connection);
    }
}
