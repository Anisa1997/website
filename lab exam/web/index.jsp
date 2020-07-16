<%--
  Created by IntelliJ IDEA.
  User: ANISA
  Date: 16/07/2020
  Time: 03:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Student Information</title>
  </head>
  <body>
  <form method="get" action="Servlet">
    <label>Name</label>
    <input type="text" name="name"><br><br>
    <label>RegistrationNumber</label>
    <input type="text" name="registration"><br><br>
    <label>Grade</label>
    <input type="text" name="grade"><br><br>
    <label>Phone number</label>
    <input type="number" name="phone"><br><br>
    <label>Email</label>
    <input type="email" name="email">
    <br><br>
    <label>Gender</label>
    <input type="radio" name="gender">male

    <input type="radio" name="gender">female
    <br /><br />
<label>registration status</label>
    <input type="radio" name="status">registered
    <input type="radio" name="status">not registered
    <br><br>
    <input type="button" name="submit" value="SUBMIT">



  </form>
  </body>
</html>
