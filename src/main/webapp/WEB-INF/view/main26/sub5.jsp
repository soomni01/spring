<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>가격으로 상품 검색</h3>
<form>
    <input type="number" step="0.01" placeholder="부터" name="a" value="${param.a}">
    <input type="number" step="0.01" placeholder="까지" name="b" value="${param.b}">
    <br>
    <button>검색</button>
</form>
<table>
    <thead>
    <tr>
        <th>번호</th>
        <th>상품명</th>
        <th>공급자번호</th>
        <th>카테고리번호</th>
        <th>단위</th>
        <th>가격</th>
    </tr>
    </thead>
    <tbody>
    <tbody>
    <%--  forEach로 각 상품 출력  --%>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.supplierId}</td>
            <td>${product.categoryId}</td>
            <td>${product.unit}</td>
            <td>${product.price}</td>
        </tr>
    </c:forEach>
    </tbody>
    </tbody>
</table>

</body>
</html>
