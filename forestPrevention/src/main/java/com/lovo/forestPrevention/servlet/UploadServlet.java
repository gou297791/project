package com.lovo.forestPrevention.servlet;

import com.lovo.forestPrevention.bean.dataBean1.SysMouse;
import com.lovo.forestPrevention.file.UploadUtil;
import com.lovo.forestPrevention.service.ISysMouseService;
import com.lovo.forestPrevention.service.impl.SysMouseServiceImpl;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import util.StringInfo;
import util.Verify;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

public class UploadServlet extends HttpServlet {
    ISysMouseService iSysMouseService=new SysMouseServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得页面的文件和表单文本map
        UploadUtil uploadUtil=new UploadUtil();
        SysMouse sysMouse=new SysMouse();
        boolean bl=false;
        try {
            Map<String, List<FileItem>> map= uploadUtil.getFileItem(request);
            //获得表单集合
            List<FileItem> listForm=   map.get("listForm");
            //获得文件集合
            List<FileItem> listFile=   map.get("listFile");
            String  afterPathDir= StringInfo.filePath; //文件放入的文件夹名
            for (FileItem file:listFile){
                String fileName=   file.getName();//上传图片的名字
                //做验证
                bl=   Verify.verifyFile(fileName,new String[]{"jpg","doc"});
                if(!bl){
                    break; //如果验证不成功就结束循环
                }
                //验证成功
                //重新生产新的文件名
                fileName=StringInfo.getNewFileName(fileName);
                sysMouse.setMouseImgPath(fileName);
                OutputStream out=new FileOutputStream(afterPathDir+ fileName );
                InputStream in= file.getInputStream();
                byte[]bytes=new byte[1024];
                int len=0;
                while ((len=in.read(bytes))>0){
                    //写
                    out.write(bytes,0,len);
                }
                out.close();
                in.close();
                if (bl){
                    //成功
                    //把表单数据持久化
                    iSysMouseService.addSysMouse(sysMouse);
//                    response.sendRedirect("");
                }else{
                    //失败
                    request.setAttribute("errorImg", StringInfo.ERRORFILE);
                    request.getRequestDispatcher("upload.jsp").forward(request,response);
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
