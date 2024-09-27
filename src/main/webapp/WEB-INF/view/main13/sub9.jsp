<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${data}" var="entry">
    <p>${entry.key}</p>
    <ul>
        <c:forEach items="${entry.value}" var="item">
            <li>${item}</li>
        </c:forEach>
    </ul>
</c:forEach>
<hr>
<%--forEach 코드 작성--%>
<c:forEach items="${movies}" var="list">
    <h4>${list.key}</h4>
    <c:forEach items="${list.value}" var="item">
        <p style="padding-left: 30px">${item}</p>
    </c:forEach>
</c:forEach>
</body>
</html>