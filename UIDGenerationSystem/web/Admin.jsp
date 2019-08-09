<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src  = js/ValidateAdmin.js></script>
</head>
<body>
<link rel="stylesheet" href="Background.css"/></link>
<H1>WELCOME TO THE UID GENERATION SYSTEM </H1>
<form action = "/UIDGenerationSystem/admin.action" onsubmit return  = "ValidateContent(this);">
<table>
<tr>
<td>
UID
<td/>
<td>
<c:forEach items = "${listOfUids}" var = "var">
<select name = "uid">
<option value = "${var.uid}"  ${var.uid} />
</select>
</c:forEach>
<td/>
<tr/>
<tr>
<td>
ACTION
<td/>
<td>
<input type = "radio" name = "action" value = "YES" /> YES
<input type = "radio" name = "action" value = "NO"  /> NO
<td/>
<tr/>
</table>
<input type = "submit" value = "Click to delete"/>
</form>
<form action = "/UIDGenerationSystem/HomePage.action" >
<input type = "submit" value = "Cancel" />
</form>
</body>
</html>