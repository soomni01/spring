<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty message}">
    ${message}
</c:if>
<h3>책 정보</h3>
<form action="/main29/sub8" method="post">
    <%--    div*5>input--%>
    <div>
        isbn
        <input type="text" name="isbn" step="1">
    </div>
    <div>
        제목
        <input type="text" name="title" step="1">
    </div>
    <div>
        저자
        <input type="text" name="author">
    </div>
    <div>
        가격
        <input type="number" name="price" step="1">
    </div>
    <div>
        출판일
        <input type="date" name="published">
    </div>
    <div>
        <button>전송</button>
    </div>
</form>
</body>
</html>
