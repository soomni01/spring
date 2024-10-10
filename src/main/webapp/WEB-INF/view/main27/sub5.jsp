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
<h3>고객 목록 (페이징)</h3>
<table>
    <thead>
    <tr>
        <th>번호</th>
        <th>고객명</th>
        <th>계약명</th>
        <th>주소</th>
        <th>도시</th>
        <th>우편번호</th>
        <th>국가</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customerList}" var="customer">
        <tr style="text-align: center;">
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.contact}</td>
            <td>${customer.address}</td>
            <td>${customer.city}</td>
            <td>${customer.postalCode}</td>
            <td>${customer.country}</td>
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
        <c:url value="/main27/sub5" var="pageLink">
            <c:param name="page" value="${previousPageNumber}"></c:param>
        </c:url>
        <a href="${pageLink}">&lt; 이전</a>
    </c:if>

    <%--현재 페이지를 표시하고 페이지 표시 수 설정--%>
    <c:forEach begin="${beginPageNumber}" end="${endPageNumber}" var="pageNumber">

        <%--
        link
        1페이지 : /main27/sub5?page=1
        2페이지 : /main27/sub5?page=2
        3페이지 : /main27/sub5?page=3
            --%>

        <c:url value="/main27/sub5" var="pageLink">
            <c:param name="page" value="${pageNumber}"/>
        </c:url>
        <span class="${currentPageNumber == pageNumber ? 'active' : ''}">
            <a href="${pageLink}">${pageNumber}</a>
        </span>
    </c:forEach>

    <%--다음 페이지로 이동--%>
    <c:if test="${not empty nextPageNumber}">
        <c:url value="/main27/sub5" var="pageLink">
            <c:param name="page" value="${nextPageNumber}"></c:param>
        </c:url>
        <a href="${pageLink}">다음 &gt;</a>
    </c:if>

    <%--마지막 페이지로 이동--%>
    <c:if test="${currentPageNumber < lastPageNumber}">
        <c:url value="/main27/sub5" var="pageLink">
            <c:param name="page" value="${lastPageNumber}"></c:param>
        </c:url>
        <a href="${pageLink}">맨끝 &gt;&gt;</a>
    </c:if>
</div>
</body>
</html>