package com.octopus.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.octopus.bean.PostBean;
import com.octopus.service.*;
import com.octopus.service.impl.PostServiceImpl;
import  com.octopus.util.*;
import com.google.gson.Gson;
import java.util.*;

public class PostUtilServlet extends HttpServlet {

    private PostService postService = new PostServiceImpl();

    private void queryPosts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setCharacterEncoding("utf-8");
        List<PostBean> postDisplayBeans = postService.selectAll();
        Integer size = postDisplayBeans.size();
        request.setAttribute("postDisplayBeans",postDisplayBeans);
        request.getRequestDispatcher("/jsp/discovery.jsp").forward(request,response);
    }
}
