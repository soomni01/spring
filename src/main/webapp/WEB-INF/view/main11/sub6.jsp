<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--Controller11에 6번째 메소드--%>
<%--Car 클래스(JavaBeans) com.example.spring.dto.c11에 작성--%>
<p>${carList[0].modelName}</p>
<p>${carList[0].price}</p>
<p>${carList[0].expired}</p>
<hr>
<p>${carList[1].modelName}</p>
<p>${carList[1].price}</p>
<p>${carList[1].expired}</p>
<hr>
<p>${carList[2].modelName}</p>
<p>${carList[2].price}</p>
<p>${carList[2].expired}</p>
</body>
</html>
