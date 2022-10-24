<%--
  Created by IntelliJ IDEA.
  User: c3bos
  Date: 9/28/2022
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>test EL</title>
</head>
<body>
<%--    <% String name = request.getParameter("name"); %>--%>
<%--    <h2> Name = <%=name%> (Scripting)</h2>--%>
<%--    <h2> Name = ${param.name} (EL)</h2>--%>
<%--    Hard code--%>
<%--    <h2>Favorite Subject : ${paramValues.fav[0]}</h2>--%>
<%--    <h2>Favorite Subject : ${paramValues.fav[1]}</h2>--%>
<%--    <h2>Favorite Subject : ${paramValues.fav[2]}</h2>--%>

<%--    LOOP--%>
<%--<c:forEach items="${paramValues.fav}" var="f">--%>
<%--    <h2>Favorite Subject: ${f}</h2>--%>
<%--</c:forEach>--%>
    <h2>Header: </h2>
    <h3>Your browser: ${header["user-agent"]}</h3>
    <h3>Host: ${header.host}</h3>
    <h3>Connection: ${header.connection}</h3>
    <h3>Accept: ${header.accept}</h3>
    <h3>Cookies Id: ${cookie.JSESSIONID.value}</h3>
</body>
</html>