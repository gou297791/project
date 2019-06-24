<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
//http://ip+port+projectName
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String basePathIMG = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/img/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>文件上传</title>
</head>
<body>

     <form action="upload.lovo" method="post" enctype="multipart/form-data">
      头像：   <input type="file" name="fileName"><p/>
      用户名： <input type="text" name="userName" ><p/>
      密码：   <input type="text" name="password" ><p/>
         <input type="submit"> <span style="color: red">${errorImg}</span>
     </form>
<hr/>
   <div>

              <table>
                  <tr>
                      <td>用户名</td>
                      <td>用户密码</td>
                      <td>头像</td>
                  </tr>
                  <c:forEach var="s" items="${fileList}">
                  <tr>
                      <td>${s.studentName}</td>
                      <td>${s.loginPassword}</td>
                      <td><img style="width: 50px;height: 80px" src="<%=basePathIMG%>${s.imgPath}"> </td>
                  </tr>
                  </c:forEach>
              </table>
  </div>
</body>
</html>
