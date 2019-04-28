<%--
  Created by IntelliJ IDEA.
  User: 章腾
  Date: 2019/4/27
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>login</title>
  </head>
  <body>

  <form action="se/newServlet" method="post">
      <p>账号</p>
    <input type="text" name="username">
      <P>密码</P>
    <input type="password" name="password">
    <input type="submit" value="提交">
      <a href="se/newServlet?username=tenforests&password=123456" >我是超管！</a>
  </form>
  </body>
</html>
