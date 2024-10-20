<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <style>
        table {
            border-collapse: collapse;
            width: 50%;
        }

        th, td {
            border: 1px solid black;
        }
    </style>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty message}">
    <h5 style="background-color: skyblue">${message}</h5>
</c:if>
<h3>
    상품 등록
</h3>
<form method="post">
    <div>상품명
        <input type="text" name="name">
    </div>
    <div>가격
        <input type="text" name="price">
    </div>
    <div>
        <button>저장</button>
    </div>
</form>
<hr>
<table>
    <thead>
    <tr>
        <th>번호</th>
        <th>이름</th>
        <th>가격</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>