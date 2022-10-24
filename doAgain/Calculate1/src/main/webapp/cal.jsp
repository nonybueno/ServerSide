<%--
  Created by IntelliJ IDEA.
  User: c3bos
  Date: 10/24/2022
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculate</title>
</head>
<body>
    <form method="get" action="Calculate">
        Number 1 :<input type="number" name="num1">
        Number 2 :<input type="number" name="num2">
        <input type="submit">
    </form>
    <c:if test="${result != null}">
        result : ${result}
    </c:if>
zlll
</body>
</html>
