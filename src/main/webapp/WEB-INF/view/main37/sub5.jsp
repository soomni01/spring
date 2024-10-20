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
<h3>새 고객 입력</h3>
<form method="post">
    <div>
        이름
        <input type="text" name="name">
    </div>
    <div>
        도시
        <input type="text" name="city">
    </div>
    <div>
        국가
        <input type="text" name="country">
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
        <th>도시</th>
        <th>국가</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.city}</td>
            <td>${customer.country}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>