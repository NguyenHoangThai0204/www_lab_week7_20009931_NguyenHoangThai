<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 10/7/2023
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="home?action=insertUpdateCus" method="post">
    Name: <input type="text" name="nameCus"><br>
    Address: <input type="text" name="addCus"><br>
    Email: <input type="email" name="emailCus"><br>
    PhoneNumber: <input type="text" name="phoneCus"><br>
    <input type="submit" value="Insert">
    <input type="reset" value="Reset">
</form>
</body>
</html>
