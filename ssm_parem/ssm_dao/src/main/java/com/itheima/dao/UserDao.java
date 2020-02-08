package com.itheima.dao;

import com.itheima.pojo.Itims;

import java.util.List;

public interface UserDao {
    /*查询所有*/
    List<Itims> sava();


    Integer inst(Itims itims);
}
