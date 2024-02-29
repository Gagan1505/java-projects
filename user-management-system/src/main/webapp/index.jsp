<html>
<style>

body{
display : flex;
flex-direction: column;
justify-content: center;
align-items: center;
}

form{
width : 40%;
height : 100%;
display : flex;
flex-direction: column;
justify-content: center;
align-items: center;
background-color: lavender;
display-content: center;
color: red;
}

input{
text-align: center;
border-radius: 80px;
width: 380px;
height: 40px;
margin: 0% 10% 2% 10%;
padding: 0px 30px 0px 30px;

}
h2{
text-align: center;
}
button{
width: 380px;
height: 40px;
border-radius: 20px;
background-color: black;
color: white;

}


</style>
<body>
<h2>Hello World!</h2>
<form action="userAction" method="post">
User Name : <input type="text" id="userName" name="userName" onclick="validateName"><br>
Email id : <input type="email" id="email" name="email"><br>
Age : <input type="number" id="age" name="age"><br>
Phone Number : <input type="number" id="phoneNumber" name="phoneNumber"><br>
Password : <input type="password" id="password" name="password"><br>
<button type="submit">SUBMIT</button>
</form>
<a href="getAllUsers">Fetch all users details</a>

</body>
</html>
