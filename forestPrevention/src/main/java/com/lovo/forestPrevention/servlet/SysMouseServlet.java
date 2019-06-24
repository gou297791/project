package com.lovo.forestPrevention.servlet;

import com.lovo.forestPrevention.bean.dataBean1.SysMouse;
import com.lovo.forestPrevention.service.ISysMouseService;
import com.lovo.forestPrevention.service.impl.SysMouseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SysMouseServlet extends HttpServlet {
    ISysMouseService iSysMouseService=new SysMouseServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        boolean b1=false;
       String mouName= request.getParameter("mouName");
        String mouFood= request.getParameter("mouFood");
        String mouBreed= request.getParameter("mouBreed");
        String mouEnemy= request.getParameter("mouEnemy");
        String mouMethod= request.getParameter("mouMethod");
        String mouHarm= request.getParameter("mouHarm");
        //判断用户是否存在，如果不存在返回到注册页面，如果存在把用户对象放入到录入信息对象
//      SysMouse mouse=iSysMouseService.addSysMouse(mouName);

        SysMouse sysMouse=null;
        if (sysMouse!=null){
            sysMouse=new SysMouse();

        sysMouse.setMouseName(mouName);
        sysMouse.setMouseFood(mouFood);
        sysMouse.setMouseBreed(mouBreed);
        sysMouse.setMouseEnemy(mouEnemy);
        sysMouse.setMouseMethod(mouMethod);
        sysMouse.setMouseHarm(mouHarm);
        iSysMouseService.addSysMouse(sysMouse);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
