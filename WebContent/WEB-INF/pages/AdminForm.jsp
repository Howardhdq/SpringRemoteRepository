<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Administration</title>
</head>
<body>

<h1>Contact Administration</h1>
<form action="/DynamicWebSpringMVCProject/submitadminform" method="post">
<p> Name: <input type = "text" name = "contactName" />
</p>
<p> Phone: <input type = "text" name = "contactPhone" />
</p>
<input type = "submit" value = "Submit this form!" />
</form>
</body>
</html>