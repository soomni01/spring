<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <style>
        .active {
            background-color: yellow;
        }
    </style>
    <title>Title</title>
</head>
<body>
<h3>주문 목록 (페이징)</h3>
<table style="text-align: center">
    <thead>
    <tr>
        <th>id</th>
        <th>고객id</th>
        <th>직원id</th>
        <th>주문일</th>
        <th>배송id</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${orderList}" var="order">
        <tr>
            <td>${order.id}</td>
            <td>${order.customerId}</td>
            <td>${order.employeeId}</td>
            <td>${order.orderDate}</td>
            <td>${order.shipperId}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div style="margin: 10px;">
    <%--처음 페이지로 이동--%>
    <c:if test="${currentPageNumber > 1}">
        <c:url value="/main27/sub5" var="pageLink">
            <c:param name="page" value="1"></c:param>
        </c:url>
        <a href="${pageLink}">&lt;&lt; 처음</a>
    </c:if>

    <%--이전 페이지로 이동--%>
    <c:if test="${not empty previousPageNumber}">
        <c:url value="/main27/sub6" var="pageLink">
            <c:param name="page" value="${previousPageNumber}"></c:param>
        </c:url>
        <a href="${pageLink}">&lt; 이전</a>
    </c:if>

    <%--현재 페이지를 표시하고 페이지 표시 수 설정--%>
    <c:forEach begin="${beginPageNumber}" end="${endPageNumber}" var="pageNumber">
        <c:url value="/main27/sub6" var="link">
            <c:param name="page" value="${pageNumber}"></c:param>
        </c:url>
        <span class="${currentPageNumber == pageNumber ? 'active' : ''}">
            <a href="${link}">${pageNumber}</a>
        </span>
    </c:forEach>

    <%--다음 페이지로 이동--%>
    <c:if test="${not empty nextPageNumber}">
        <c:url value="/main27/sub6" var="pageLink">
            <c:param name="page" value="${nextPageNumber}"></c:param>
        </c:url>
        <a href="${pageLink}">다음 &gt;</a>
    </c:if>

    <%--마지막 페이지로 이동--%>
    <c:if test="${currentPageNumber < lastPageNumber}">
        <c:url value="/main27/sub6" var="pageLink">
            <c:param name="page" value="${lastPageNumber}"></c:param>
        </c:url>
        <a href="${pageLink}">맨끝 &gt;&gt;</a>
    </c:if>
</div>
</body>
</html>