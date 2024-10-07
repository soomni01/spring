<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <style>
        td, th {
            border: 1px solid black;
        }
    </style>
    <title>Title</title>
</head>
<body>
<table style="border-collapse: collapse; width: 100%;">
    <thead>
    <tr>
        <th>이름</th>
        <th>계약명</th>
        <th>주소</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.contactName}</td>
            <td>${customer.address}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>