<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<style>

body{
display : flex;
flex-direction: column;
justify-content: center;
align-items: center;
}

</style>
<body>
<h2>Hello user !!! Welcome to Tourist App</h2>
<form action="newUser" method="post">
    <table>
        <tr>
            <td><label for="name">Name</label></td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td><label for="email">E-mail</label></td>
            <td><input type="email" name="email" id="email"></td>
        </tr>
        <tr>
            <td><label for="address">Address</label></td>
            <td><input type="text" name="address" id="address"></td>
        </tr>
        <tr>
            <td><label for="age">Age</label></td>
            <td><input type="number" name="age" id="age"></td>
        </tr>
        <tr>
            <td><label for="phoneNumber">Phone Number</label></td>
            <td><input type="number" name="phoneNumber" id="phoneNumber"></td>
        </tr>
        <tr>
            <td><label for="password">Password</label></td>
            <td><input type="password" name="password" id="password"></td>
        </tr>
        <tr>
            <td><button type="submit">SUBMIT</button></td>
        </tr>
    </table>
</form>

<a href="allUsers">All users info</a>
</body>
</html>
