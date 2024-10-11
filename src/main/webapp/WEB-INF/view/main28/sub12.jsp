<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty message}">
    <h5 style="background-color: skyblue">${message}</h5>
</c:if>
<h3>직원 조회 후 수정</h3>
<form>
    <input type="text" name="id">
    <button>조회</button>
</form>
<c:if test="${empty employee}">
    <h5>조회된 직원 정보가 없습니다.</h5>
</c:if>
<c:if test="${not empty employee}">
    <%--    (div>input[name][value])*6--%>
    <form action="/main28/sub11" method="post">
        <div>
            <input type="text" name="id" value="${employee.id}">
        </div>
        <div>
            <input type="text" name="firstName" value="${employee.firstName}">
        </div>
        <div>
            <input type="text" name="lastName" value="${employee.lastName}">
        </div>
        <div>
            <input type="text" name="birthDate" value="${employee.birthDate}">
        </div>
        <div>
            <input type="text" name="photo" value="${employee.photo}">
        </div>
        <div>
            <input type="text" name="notes" value="${employee.notes}">
        </div>
        <div>
            <button>저장</button>
        </div>
    </form>
</c:if>

</body>
</html>
