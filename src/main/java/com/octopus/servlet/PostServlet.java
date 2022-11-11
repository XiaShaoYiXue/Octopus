package com.octopus.servlet;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import com.google.gson.Gson;
import com.octopus.bean.PostBean;
import com.octopus.service.PostService;
import com.octopus.service.impl.PostServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class PostServlet extends HttpServlet{

    private PostService postService = new PostServiceImpl();

    private Gson gson = new Gson();

    private void listAll(ServletRequest request, ServletResponse response){
        response.setCharacterEncoding("utf-8");
        PrintWriter printWriter = null;
        try {
            printWriter = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<PostBean> posts = postService.selectAll();

        //将记录转换成json字符串
        String postJson = gson.toJson(posts);
        String json = "{\"total\":" + posts.size() + ",\"rows\":" + postJson + "}";

        printWriter.write(json);
    }
}
