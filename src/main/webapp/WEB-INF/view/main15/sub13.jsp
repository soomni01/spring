<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>상품목록</h3>
<%--table>thead>tr>th*3--%>
<table>
    <thead>
    <tr>
        <th>번호</th>
        <th>상품명</th>
        <th>가격</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productList}" var="product">
        <c:import url="/WEB-INF/view/main15/sub14.jsp">
            <c:param name="id" value="${product.id}"/>
            <c:param name="name" value="${product.name}"/>
            <c:param name="price" value="${product.price}"/>
        </c:import>
        <%--        <tr>--%>
        <%--            <td>${product.id}</td>--%>
        <%--            <td>${product.name}</td>--%>
        <%--            <td>${product.price}</td>--%>
        <%--        </tr>--%>
    </c:forEach>
    </tbody>
</table>
<hr>
<%--table>thead>tr>th*3--%>
<table>
    <thead>
    <tr>
        <th>번호</th>
        <th>상품명</th>
        <th>가격</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productList}" var="product">
        <c:set var="product" value="${product}" scope="request"/>
        <c:import url="/WEB-INF/view/main15/sub15.jsp"/>
    </c:forEach>
    </tbody>
</table>

</body>
</html>