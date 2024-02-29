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
<h2>Update the values here </h2>
<h3> ${ msg }</h3>
<form action="update?id=${user.getUserId()}" method="post">
    <table>
        <tr>
            <td><label for="name">Name</label></td>
            <td><input type="text" name="name" id="name" value="${user.getUserName()}"></td>
        </tr>
        <tr>
            <td><label for="email">E-mail</label></td>
            <td><input type="email" name="email" id="email" value="${user.getUserEmail()}"></td>
        </tr>
        <tr>
            <td><label for="address">Address</label></td>
            <td><input type="text" name="address" id="address" value="${user.getUserAddress()}"></td>
        </tr>
        <tr>
            <td><label for="age">Age</label></td>
            <td><input type="number" name="age" id="age" value="${user.getUserAge()}"></td>
        </tr>
        <tr>
            <td><label for="phoneNumber">Phone Number</label></td>
            <td><input type="number" name="phoneNumber" id="phoneNumber" value="${user.getUserPhoneNumber()}"></td>
        </tr>
        <tr>
            <td><button type="submit">SUBMIT</button></td>
        </tr>
    </table>
</form>

<a href="allUsers">All users info</a>
</body>
</html>
