<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        td, th {
            border: 1px solid black;
        }

        table {
            border-collapse: collapse;
            width: 100%;
        }
    </style>
</head>
<body>
<p>이름:${actor.name}</p>
<p>소속사:${actor.agency}</p>
<p>생일:${actor.birth}</p>
<p>mbti:${actor.mbti}</p>
<p>
    작품
<ul>
    <c:forEach items="works" var="work">
        <li>${work}</li>
    </c:forEach>
</ul>

<hr>
<table>
    <thead>
    <tr>
        <th>이름</th>
        <th>소속사</th>
        <th>mbti</th>
        <th>생일</th>
        <th>작품목록</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${actorList}" var="actor">
        <tr>
            <td>${actor.name}</td>
            <td>${actor.agency}</td>
            <td>${actor.mbti}</td>
            <td>${actor.birth}</td>
            <td>
                <c:forEach items="${actor.works}" var="work">
                    ${work}
                    <br>
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
