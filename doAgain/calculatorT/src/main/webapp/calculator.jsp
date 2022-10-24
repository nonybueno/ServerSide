<%--
  Created by IntelliJ IDEA.
  User: c3bos
  Date: 10/24/2022
  Time: 5:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <form method="post" action="CalculatorServlet">
        Number 1 <input type="number" name="number1">
        Operator [+,-,*,/] <input type="text" name ="operator">
        Number 2 <input type="number" name="number2">

        <input type="submit">
    </form>
<c:if test="${sumNum != null}">
    result : ${sumNum}
</c:if>

</body>
</html>
