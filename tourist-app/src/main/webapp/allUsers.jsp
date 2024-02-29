<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Users</title>
    <style>
    body{
        display: flex;
        flex-direction: column;
        justify-contents: center;
        align-items: center;
    }
    table{
        width: 70vw;
        border: 1px solid black;
        border-collapse: collapse;
    }
    tr,td,th{
    border: 1px solid black;
    padding: 5px;
    }
    </style>
</head>
<body>
<table>
    <tr>
        <th>Sl no</th>
        <th>Name</th>
        <th>Email id</th>
        <th>Address</th>
        <th>Age</th>
        <th>Phone number</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${allUsers}" var="user" >
    <tr>
        <td>${user.getUserId()}</td>
        <td>${user.getUserName()}</td>
        <td>${user.getUserEmail()}</td>
        <td>${user.getUserAddress()}</td>
        <td>${user.getUserAge()}</td>
        <td>${user.getUserPhoneNumber()}</td>
        <td style="display:flex;flex-direction:row;gap:10px;border:solid 1px white;align-items:center;justify-content:center;">
            <a href="updateUser?id=${user.getUserId()}" style="border:none;background-color:white;color:green">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="14" fill="currentColor" class="bi bi-pen" viewBox="0 0 16 16" >
              <path d="m13.498.795.149-.149a1.207 1.207 0 1 1 1.707 1.708l-.149.148a1.5 1.5 0 0 1-.059 2.059L4.854 14.854a.5.5 0 0 1-.233.131l-4 1a.5.5 0 0 1-.606-.606l1-4a.5.5 0 0 1 .131-.232l9.642-9.642a.5.5 0 0 0-.642.056L6.854 4.854a.5.5 0 1 1-.708-.708L9.44.854A1.5 1.5 0 0 1 11.5.796a1.5 1.5 0 0 1 1.998-.001m-.644.766a.5.5 0 0 0-.707 0L1.95 11.756l-.764 3.057 3.057-.764L14.44 3.854a.5.5 0 0 0 0-.708z"/>
            </svg>
            </a>
            <form action="delete?id=${user.getUserId()}" method="post">
            <button type="submit" style="border:none;background-color:white;">
            <svg style="color:red" xmlns="http://www.w3.org/2000/svg" width="16" height="14" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16" style="margin-left:10px">
              <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5m2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5m3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0z"/>
              <path d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4zM2.5 3h11V2h-11z"/>
            </svg></a>
            </button>
            </form>
        </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>