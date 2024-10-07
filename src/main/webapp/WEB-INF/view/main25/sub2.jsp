<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>가격으로 상품 조회</h3>
<form>
    상품가격
    <input type="text" name="price">
    <br>
    <button>검색</button>
</form>

<hr>

<c:if test="${not empty productList}">
    <ul>
        <c:forEach items="${productList}" var="product">
            <li>${product}</li>
        </c:forEach>
    </ul>
</c:if>
<c:if test="${empty productList}">
    <strong>가격을 정확히 입력해주세요.</strong>
</c:if>
</body>
</html>
