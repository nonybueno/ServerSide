<%--
  Created by IntelliJ IDEA.
  User: c3bos
  Date: 10/24/2022
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>CalSum</title>
</head>
<body>
    <form method="post" action="sum">
        Enter Num1: <input type="number" name="num1"> <br>
        Enter Num2: <input type="number" name="num2"> <br>
        <input type="submit">
    </form>
<c:if test="${result != null}">
    Result = ${result}
</c:if>
</body>
</html>
