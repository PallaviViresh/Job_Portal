<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
 <link rel="stylesheet" href="./css/home.css">
 <style type="text/css">
 button{
 align-items: center;
 position: relative;
 left: 550px;
 top:100px;
 background-color: black;
 color: pink;
 }
 button:hover{
	color: crimson;
 }
 h1{
	position: relative;
	top: 50px;
 }
 </style>
 
</head>
<body>

   
	<h1 style="color: red">${neg}</h1>
	<h1 style="color: green">${pos}</h1>
	<h1 style="color:coral;text-align:center;">Job Portal</h1>
	

    <form action="/"  method="post">
    <div class="buttons">
               
	     
        <a href="/admin/login" class="button"><button>Admin</button></a> 
        <a href="/recruiter/login" class="button"><button>Recruiter</button></a> 
        <a href="/user/login" class="button"><button>User</button></a>
    </div>
    </form>
</body>
</html>