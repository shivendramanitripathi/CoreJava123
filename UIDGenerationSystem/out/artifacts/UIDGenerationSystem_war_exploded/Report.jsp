<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<link rel="stylesheet" href="Background.css"/></link>
<H1>WELCOME TO THE UID GENERATION SYSTEM </H1>

<table border = "1">
    <tr>
        <td>
            <h5>Generated ID</h5>
        <td/>
        <td>
            <h5>Contact No</h5>
        <td/>
        <td>
            <h5>Name</h5>
        <td/>
        <td>
            <h5>Look</h5>
        <td/>
    </tr>
<c:forEach items="${requestScope.listOfReports}" var="var">
    <tr>
        <td>
                ${var.enroll_id}
        <td/>
        <td>
                ${var.CONTACT_NO}
        <td/>
        <td>
                ${var.name}
        <td/>
        <td>
                ${var.look}
        <td/>
    <tr/>
</c:forEach>
</table>
<form action = "/UIDGenerationSystem/HomePage.action" >
    <input type = "submit" value = "Cancel" />
</body>
</html>