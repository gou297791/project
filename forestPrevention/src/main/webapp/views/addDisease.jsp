<%--
  Created by IntelliJ IDEA.
  User: gou
  Date: 2019/6/17
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
//http://ip+port+projectName
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>森林病虫害防治系统</title>
    <link rel="stylesheet" href="layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all">
    <link rel="stylesheet" href="layuiadmin/mycss.css" media="all">
    <script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>
<div class="layadmin-user-login-main">
    <div class="layadmin-user-login-box layadmin-user-login-header">
        <br><br>
        <h1 align="center">添加病害</h1>
    </div>
</div>
<div class="layui-card-header"></div>
<div class="layui-card-body">
    <span style=" position:relative;left:50px">名称</span>
    <input type="text" style=" position:relative;left:120px"/>
    <span style=" position:relative;left:280px">病原</span>
    <input type="text" style=" position:relative;left:350px"/>
    <br>
    <span style=" position:relative;left:50px;top: 50px">发病症状</span>
    <input type="text" style=" position:relative;left:120px;top: 50px"/>
    <span style=" position:relative;left:280px;top: 50px">发病规律</span>
    <input type="text" style=" position:relative;left:350px;top: 50px"/>
    <br>
    <span style=" position:relative;left:50px;top: 100px">图片</span>
    <input type="text" style=" position:relative;left:90px;top: 100px"/>
    <button class="layui-btn layui-btn-primary layui-btn-sm" style=" position:relative;top:100px;left:100px">浏览</button>
    <br>
    <span style=" position:relative;left:200px;top: 100px">防治措施</span>
    <textarea rows="5" cols="23"style=" position:relative;left:240px;top: 100px"></textarea>
    <span style=" position:relative;left:50px;top: 50px">主要危害</span>
    <textarea rows="5" cols="23"style=" position:relative;left:120px;top: 50px"></textarea>
    <br>
</div>
<button class="layui-btn layui-btn-primary layui-btn-sm" style=" position:relative;top:200px;left:450px">添加</button>
</body>
</html>
