<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--引入标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>查询所有user的帐户</h3>
<%--遍历集合--%>
<c:forEach items="${list}" var="user">
    ${user.username}
</c:forEach>
<a href="/login">登录页面</a>
<a href="/index">首页</a>
<div style="text-align: center">
    <a href="/UserfindAll">测试查询</a>
    <form action="/get" method="post" id="loginForm">
        姓名：<input type="text" name="uname" id="uname" >  ${messageModel.username}<br>
        密码：<input type="password" name="upwd" id="upwd" > ${messageModel.password}<br>
        <span id="msg" style="font-size: 12px;color: red"></span><br>
        <input type="submit" value="登录"/><br/>
        <button type="button">注册</button>
    </form>

</div>


</body>
</html>
