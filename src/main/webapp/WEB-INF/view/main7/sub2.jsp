<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2024-09-25
  Time: 오후 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    <%
        Object d = request.getAttribute("person");
        out.println(d);
    %>
</h1>
</body>
</html>
