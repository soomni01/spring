<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2024-09-25
  Time: 오후 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <p>request를 전달 받은 jsp</p>

  <h1>
    <%
      Object d = request.getAttribute("data");
      out.println(d);
    %>
  </h1>
</body>
</html>
