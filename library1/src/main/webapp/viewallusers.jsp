<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<style>
ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: lightgreen;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: black;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: orange;
  color: white;
}
</style>
</head>
<body>

<h1 align=center>WELCOME TO E-LIBRARY</h1>

<br>

<ul>
  <li><a href="adminhome">Home</a></li>
  <li><a class="active"  href="viewallusers">View All Users</a></li>
  <li><a href="adminlogin">Logout</a></li>
</ul>

<br><br>

<h3 align=center><u>View All Users</u></h3>

<table align=center border=2>

<tr>

<th>ID</th>
<th>Name</th>
<th>Department</th>
<th>Email ID</th>
<th>Username</th>
<th>Contact No</th>
<th>Action</th>

</tr>

<c:forEach items="${emplist}" var="emp">

<tr>

<td> <c:out value="${user1.id}"></c:out>   </td>
<td> <c:out value="${user1.name}"></c:out>   </td>

<td> <c:out value="${user1.department}"></c:out>   </td>

<td> <c:out value="${user1.emailid}"></c:out>   </td>
<td> <c:out value="${user1.username}"></c:out>   </td>
<td> <c:out value="${user1.contactno}"></c:out>   </td>
<td> 

<a href='<c:url value='deleteuser?id=${user1.id}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a href='<c:url value='viewuserbyid?id=${user1.id}'></c:url>'>View</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

</table>

</body>
</html>

 