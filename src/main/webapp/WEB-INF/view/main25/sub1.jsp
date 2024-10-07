<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>국가명으로 고객 조회</h3>
<form>
    국가명
    <input type="text" name="country">
    <br>
    <button>검색</button>
</form>

<hr>

<c:if test="${not empty nameList}">
    <ul>
        <c:forEach items="${nameList}" var="name">
            <li>${name}</li>
        </c:forEach>
    </ul>
</c:if>
<c:if test="${empty nameList}">
    <strong>국가명을 정확히 입력해주세요.</strong>
</c:if>


</body>
</html>
