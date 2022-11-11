package com.octopus.service;

import com.octopus.bean.PostBean;

import java.util.List;

public interface PostService{
    public List<PostBean> selectAll();
}