<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<p>${jobs[0]}</p>
<p>${jobs[1]}</p>
<p>${jobs[2]}</p>
<hr>
<p>${pointList[0]}</p>
<p>${pointList[1]}</p>
<p>${pointList[2]}</p>
<hr>
<c:forEach items="${jobs}" var="job">
  <p>${job}</p>
</c:forEach>
<hr>
<c:forEach items="${pointList}" var="point">
  <p>${point}</p>
</c:forEach>
</body>
</html>