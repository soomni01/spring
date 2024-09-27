<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- jstl choose tag--%>
<c:choose>
    <c:when test="${param.country == 'uk'}">
        <p>해리케인</p>
    </c:when>
    <c:when test="${param.country == 'jp'}">
        <p>오타니</p>
    </c:when>
    <c:when test="${param.country == 'kr'}">
        <p>흥민</p>
    </c:when>
    <c:when test="${not empty param.country}">
        <p>해당 선수가 없습니다.</p>
    </c:when>
    <c:otherwise>
        <p>국가를 선택해주세요</p>
    </c:otherwise>
</c:choose>

<hr>
<%--
요청파라미터 age를 받아서
0 < age <= 13 이면 '어린이 영화'
13 < age <= 19 이면 '청소년 영화'
20 <= age 이면 '성인 영화'

age 가 없으면 '나이를 입력해주세요'
age < 0 면 '유효한 나이를 입력해주세요.'
--%>
<c:choose>
    <c:when test="${0 < param.age && param.age <= 13}">
        <p>어린이 영화</p>
    </c:when>
    <c:when test="${13 < param.age && param.age <= 19}">
        <p>청소년 영화</p>
    </c:when>
    <c:when test="${20 <= param.age }">
        <p>성인 영화</p>
    </c:when>
    <c:when test="${empty param.age}">
        <p>나이를 입력해주세요</p>
    </c:when>
    <c:otherwise>
        <p>유효한 나이를 입력해주세요</p>
    </c:otherwise>
</c:choose>
</body>
</html>
