package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.pojo.Itims;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 查询所有
     * @return
     */
    public List<Itims> sava() {
        List<Itims> sava = userDao.sava();
        return sava;
    }

    /**
     * 添加信息
     * @param itims
     * @return
     */
    public Integer inst(Itims itims) {
        Integer inst = userDao.inst(itims);
        return inst;
    }
}
