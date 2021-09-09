package com.example.demo.Connections;


import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class ConnectionToDB {

    public static void main(String args[]){
        Cluster cluster;
        Session session;
        cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        session = cluster.connect("sample");
        String query="SELECT * from emp_table";
        System.out.println("*********");
        System.out.println(session.execute(query));
        System.out.println("*********");
        session.close();
    }
}
