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
        <th>번호</th>
        <th>성</th>
        <th>이름</th>
        <th>생일</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employeeList}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.first}</td>
            <td>${employee.last}</td>
            <td>${employee.birth}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>