<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty message}">
    <h4 style="background-color: skyblue">${message}</h4>
</c:if>
<form action="/main28/sub4" method="post">
    이름:
    <input type="text" name="name">
    <br>
    수:
    <input type="text" name="unit">
    <br>
    가격:
    <input type="text" name="price">
    <br>
    <button>등록</button>
</form>

</body>
</html>
