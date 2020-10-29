package com.syamsudin.singleton.unsafe_thread_1;

public class DatabaseHelper {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            return new Connection("corporate","localhost","root","hah123");
        }
        return connection;
    }
}
