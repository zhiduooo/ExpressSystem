package com.cz.express.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cz.express.entity.admin;
import com.cz.express.mapper.adminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class adminService {
    @Autowired
    private adminMapper adminmapper;

    public boolean selectadmin(String username,String password) {
        QueryWrapper<admin> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        wrapper.eq("password",password);
        admin user1 = adminmapper.selectOne(wrapper);
        if(user1!=null){
            return  true;
        }
        return  false;
    }
}
