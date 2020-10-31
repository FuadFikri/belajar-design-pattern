package com.syamsudin.objectpool;



import java.util.ArrayList;
import java.util.List;

public class DatabasePool {
    private static List<Connection> pool = new ArrayList<>();

    static {
        for (int i = 0; i < 100; i++) {
            Connection connection = new Connection("db", "localhost", "root,", "root");
            pool.add(connection);
        }
    }

    public static Connection getConnection() {
        if (pool.isEmpty()) {
            throw new RuntimeException("koneksi abis");
        } else {
            Connection connection = pool.remove(0);
            return connection;
        }
    }

    public static void close(Connection connection) {
        pool.add(connection);
    }
}
