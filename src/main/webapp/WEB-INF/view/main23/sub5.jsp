<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>공급자 국가명</h3>
<c:forEach items="${countryList}" var="country">
    <ul>
        <li>${country}</li>
    </ul>
</c:forEach>
</body>
</html>
