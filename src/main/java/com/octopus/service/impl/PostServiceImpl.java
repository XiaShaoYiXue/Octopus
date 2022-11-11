package com.octopus.service.impl;

import com.octopus.bean.PostBean;
import com.octopus.dao.Dao;
import com.octopus.service.PostService;

import java.text.SimpleDateFormat;
import java.util.*;

public class PostServiceImpl implements PostService{

    private SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Dao dao = new Dao();

    @Override
    public List<PostBean> selectAll(){
        String sql = "select post_id, post_title, user_id, img_url, likes " +
                "from post";
        List<PostBean> postList = (List<PostBean>) dao.query(sql, PostBean.class);
        return postList;
    }
}
