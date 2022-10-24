<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Natdanai WebApp" %>
</h1>
<br/>
<a href="TestScope">test_scope call by servlet</a> <br>
<a href="test_scope.jsp">Call directly to jsp</a>
<hr>
<h2> Example Login Session Test</h2>
<a href="Page1">Page1</a> <br>
<a href="Page2">Page2</a> <br>
<a href="Page3">Page3</a> <br>
<h3>Click this to test Login:</h3>
<a href="Login?user=Admin&password=123456">Test Login here</a>
</body>
</html>