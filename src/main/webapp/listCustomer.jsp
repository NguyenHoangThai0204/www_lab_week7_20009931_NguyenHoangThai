<%@ page import="vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Employee" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Customer" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
        <h1 style="text-align: center"> Danh sách khách hàng </h1>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Address</th>
            <th>Email</th>
            <th>PhoneNumber</th>
            <th></th>
        </tr>
        <% List<Customer> list ;
            list = (List<Customer>) request.getAttribute("listCustomer");
    for (Customer e  :list
         ) {%>
        <tr style="text-align: center">
            <td><%= e.getId() %> </td>
            <td><%= e.getAddress() %> </td>
            <td><%= e.getEmail()%> </td>
            <td><%= e.getPhone() %> </td>
            <td>
                <a style="margin-right: 5px">update</a>
                <a >delete</a>
            </td>
        </tr>
    <%}%>
    <div style="text-align: right;">
        <a href="insertUpdateCus.jsp" style="margin-right: 5px;font-size: 25px;font-weight: bold;">Insert</a>
    </div>
</table>
</body>
</html>
