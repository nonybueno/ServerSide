<%@ page import="java.util.Set" %>
<%@ page import="java.util.Map" %>
<%--
  Created by IntelliJ IDEA.
  User: c3bos
  Date: 10/6/2022
  Time: 1:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${courseRegistered == null}">
    ${message}
</c:if>
<c:if test="${courseRegistered != null}">
    <c:forEach items="${courseRegistered.history}" var="entry" varStatus="vs">
        count : ${vs.count} Semester: ${entry.key} <br>
        <c:forEach items="${entry.value}" var="subject">
            ${subject.subjectId} ${subject.title} ${subject.credit} <br>
        </c:forEach>
        <hr>
    </c:forEach>
</c:if>
</body>
</html>
