<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <h3>
        <%@include file="Welcome.html" %>
        Exception Raised: <%=exception.getMessage() %>
    </h3>

</body>
</html>