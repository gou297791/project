package com.lovo.forestPrevention.servlet;

import com.lovo.forestPrevention.service.ISysMouseService;
import com.lovo.forestPrevention.service.impl.SysMouseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FindMouseServlet extends HttpServlet {
    ISysMouseService iSysMouseService=new SysMouseServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取当前页
     String mouName= request.getParameter("mouName");
     
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
