<%--
  Created by IntelliJ IDEA.
  User: ANISA
  Date: 22/07/2020
  Time: 07:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login success page</title>
</head>
<body>
<p>
    You are successfully logged in!
</p>
<%
    LoginBean bean=(LoginBean)request.getAttribute("bean");
    out.print("Welcome, "+bean.getName());
%>
</body>
</html>
