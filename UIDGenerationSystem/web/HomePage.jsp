<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<link rel="stylesheet" href="Background.css"/></link>
<p style="text-align:center"><H1>WELCOME TO THE UID GENERATION SYSTEM </H1></p>
<marquee>Please click on the appropriate link to perform the operation</marquee>
<BR/>
<BR/>
${requestScope.Msg}
<BR/>
<BR/>
<form action = "/UIDGenerationSystem/Enroll_.action">
<input type = "submit" value = "Click to Enroll">
</form>
<BR/>
<form action = "/UIDGenerationSystem/Admin_.action">
<input type = "submit" value = "Click to Delete Record">
</form>
<BR/>
<form action = "/UIDGenerationSystem/report.action">
<input type = "submit" value = "Click to generate Report">
</form>
</body>
</html>