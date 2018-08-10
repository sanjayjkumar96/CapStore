<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello ${cust_obj.c_name}</title>
</head>
<body>
<form>
name : ${cust_obj.c_name }<br/>
ID: ${cust_obj.c_id }<br/>
Phone: ${cust_obj.c_phone }<br/>
Email: ${cust_obj.c_email }<br/>



</form>
</body>
</html>