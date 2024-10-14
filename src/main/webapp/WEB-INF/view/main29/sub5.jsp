<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>자료입력</h3>
<form action="/main29/sub6" method="post">
    <%--    div*5>input--%>

    <div>
        제목
        <input type="text" name="title">
    </div>
    <div>
        가격
        <input type="number" name="price" step="1">
    </div>
    <div>
        평점
        <input type="number" name="score" step="0.1">
    </div>
    <div>
        출판일
        <input type="date" name="published">
    </div>
    <div>
        입력일시
        <input type="datetime-local" name="inserted">
    </div>
    <div>
        <button>전송</button>
    </div>
</form>
</body>
</html>