<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="/login">登录页面</a>
<a href="/index">首页</a>
<div style="text-align: center">
    <a href="/UserfindAll">测试查询</a>
    <form action="/get" method="post" id="loginForm">
        姓名：<input type="text" name="uname" id="uname" ><br>
        密码：<input type="password" name="upwd" id="upwd" ><br>
        <span id="msg" style="font-size: 12px;color: red"></span><br>
        <input type="submit" value="登录"/><br/>
        <button type="button">注册</button>
    </form>
</div>

    <a href="account/findAll">测试查询</a>

    <h3>测试包</h3>

    <form action="account/save" method="post">
        姓名：<input type="text" name="name" /><br/>
        金额：<input type="text" name="money" /><br/>
        <input type="submit" value="保存"/><br/>
    </form>



</body>
</html>
