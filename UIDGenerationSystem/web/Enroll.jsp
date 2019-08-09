<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src = "js/ValidateEnroll.js"></script>
</head> 
<body>
<link rel="stylesheet" href="Background.css"/></link>
<H1>WELCOME TO THE UID GENERATION SYSTEM </H1>
<form action = "/UIDGenerationSystem/enroll.action" onsubmit return  = "ValidateContent(this);">
<table>
<td>
Name
<td/>
<td>
<input type = "text" name = "name"/>
<td/>
<tr/>
<tr>
<td>
Contact No:
<td/>
<td>
<input type = "text" name = "CONTACT_NO"/>
<td/>
<tr/>
<tr>
<td>
Look
<td/>
<td>
<input type = "text" name = "look"/>
<td/>
<tr/>
</table>
<input type = "submit" value = "Click to enroll"/>
</form>
<form action = "/UIDGenerationSystem/HomePage.action" >
<input type = "submit" value = "Cancel" />
</form>
</body>
</html>