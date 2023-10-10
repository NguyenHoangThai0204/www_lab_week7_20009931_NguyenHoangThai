<%@ page import="vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.models.Employee" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 10/7/2023
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<table style="width: 70%; margin: auto;">
        <h1 style="text-align: center"> Danh sách nhân viên </h1>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Address</th>
            <th>Email</th>
            <th>Date</th>
            <th>Status</th>
            <th></th>
        </tr>
        <% List<Employee> list ;
            list = (List<Employee>) request.getAttribute("listEmployees");
    for (Employee e  :list
         ) {%>
        <tr style="text-align: center">
            <td><%= e.getId() %> </td>
            <td><%= e.getFull_name()%> </td>
            <td><%= e.getAddress() %> </td>
            <td><%= e.getEmail()%> </td>
            <td><%= e.getDob()%> </td>
            <td><%= e.getStatus() %> </td>
            <td>
                <a href="insertEmp.jsp" style="margin-right: 5px">insert</a>
                <a >update</a>
            </td>
        </tr>
    <%}%>
</table>

</body>
</html>
