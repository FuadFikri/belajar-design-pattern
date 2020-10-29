package com.syamsudin.singleton.unsafe_thread_1;

public class Connection {
    private String dbName;
    private String hostName;
    private String user;
    private String password;

    public Connection(String dbName, String hostName, String user, String password) {
        this.dbName = dbName;
        this.hostName = hostName;
        this.user = user;
        this.password = password;
    }

    public void sql(String sql) {
        System.out.println(sql);
    }


}
