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
<form action="home?action=insertUpdateEmployee" method="post">
    Name: <input type="text" name="nameEm"><br>
    Date: <input type="date" name="dateEm"><br>
    Address: <input type="text" name="addEm"><br>
    Email: <input type="email" name="emailEm"><br>
    Status:
    <select name="statusEm">
        <option value="acctive">Acctive</option>
        <option value="inacctive">In_Acctive</option>
        <option value="terminate">Terminate</option>
    </select> <br>
    <input type="submit" value="Insert">
    <input type="reset" value="Reset">
</form>
</body>
</html>
