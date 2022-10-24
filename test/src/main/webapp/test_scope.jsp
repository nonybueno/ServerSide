<%--
  Created by IntelliJ IDEA.
  User: c3bos
  Date: 9/21/2022
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%! String pc = "this is page scope"; %>
    <h3>Page Attribute: <%= pc %>  </h3>
    <h3> Request Scope: ${rc} </h3>
    <h3> Session Scope: ${sc} </h3>
    <h3> Application Scope: ${ac} </h3>
</body>
</html>
