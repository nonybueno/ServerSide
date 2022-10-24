<%--
  Created by IntelliJ IDEA.
  User: c3bos
  Date: 10/24/2022
  Time: 7:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator Number</title>
</head>
<body>
    <form name="number" action="calculate">
      Number 1: <input type="number" name="num1"><br>
      Number 2: <input type="number" name="num2"><br>
        <input type="submit">
    </form>
    Sum of Num 1, Num 2 : ${result}
</body>
</html>
