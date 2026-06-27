package com.vikram.designpatterns.dao;

public class App {
    public static void main(String[] args) {
        UserDao dao = new InMemoryUserDao();
        dao.save(new User(1, "vikram"));
        System.out.println(dao.findById(1).orElseThrow().name());
    }
}
