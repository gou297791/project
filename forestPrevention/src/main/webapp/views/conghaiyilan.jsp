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
        <h1 align="center">鼠害一览</h1>
        <br>
        <br>
        <div class="layui-card-body">
            <table class="layui-table">
                <colgroup>
                    <col width="150">
                    <col width="150">
                    <col width="200">
                    <col>
                </colgroup>
                <thead>
                <tr>
                    <th>名称</th>
                    <th>食物</th>
                    <th>主要危害</th>
                </tr>
                <c:forEach items="${list}" var="list">
                    <tr><td>${list.name}</td><td>${list.checkType}</td>
                        <td>${list.checkStatus}</td></tr>
                </c:forEach>

                </thead>
            </table>
            <div class="layui-card-body">
                <div id="test-laypage-demo20"></div>
                <ul id="test-laypage-biuuu_city_list">
                    <li><a href="javaScript:void(0)" id="firstId" class="a-page-class">首页</a>
                        <a href="javaScript:void(0)" id="prevId" class="a-page-class">上一页</a>
                        <button class="layui-btn layui-btn-primary layui-btn-sm">${page}</button>
                        <span id="conditionNum">/${maxPage}</span>
                        <a href="javaScript:void(0)" id="skipId" class="a-page-class">跳转</a>
                        <a href="javaScript:void(0)" id="nextId" class="a-page-class">下一页</a>
                        <a href="javaScript:void(0)" id="lastId" class="a-page-class">尾页</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<div class="layui-card-header"></div>
<div class="layui-card-body">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-primary layui-btn-sm" style=" position:relative;left:50px">添加新鼠害</button>
        <button class="layui-btn layui-btn-primary layui-btn-sm" style=" position:relative;left:100px">查看详细信息</button>
    </div>

</div>
<div style="border: solid #b2b2b2;width: 400px;height: 200px;position:relative;left:500px;top: -80px">
    <span style=" position:absolute;top:-30px;left:30px">查询鼠害信息</span>
    <span style=" position:absolute;top:40px;left:30px">鼠害名称</span>
    <input type="text" style=" position:absolute;top:40px;left:140px"/>

    <button class="layui-btn layui-btn-primary layui-btn-sm" style=" position:absolute;top:140px;left:200px">查询</button>
</div>
</body>
</html>
