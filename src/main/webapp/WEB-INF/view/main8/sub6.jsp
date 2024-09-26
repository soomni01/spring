<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>${names}</p>
    <%--배열과 같은 방법 : [] 와 index를 사용--%>
    <p>${names[0]}</p>
    <p>${names[1]}</p>
    <p>${names[2]}</p>
    <hr>
    <p>${names["0"]}</p>
    <p>${names['1']}</p>
    <p>${names[2]}</p>
</body>
</html>
