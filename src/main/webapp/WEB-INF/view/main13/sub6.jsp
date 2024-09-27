<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>${proucts[0]}</p>
<p>${proucts[1]}</p>
<p>${proucts[2]}</p>
<c:forEach begin="0" end="2" var="i">
    <p>${products[i]}</p>
</c:forEach>

<hr>

<c:forEach begin="0" end="${products.size() - 1}" var="i">
    <p>${products[i]}</p>
</c:forEach>

<hr>

<%-- items : 반복할 attribute --%>
<%-- var : 각 아이템이 들어갈 attribute 명--%>
<c:forEach items="${products}" var="product">
    <p>${product}</p>
</c:forEach>

<hr>

<%--
오타니, 흥민, 범근, 케인 지성 출력
--%>
<c:forEach items="${players}" var="player">
    <p>${player}</p>
</c:forEach>

<hr>

<c:forEach items="${cityList}" var="city">
    <p>${city}</p>
</c:forEach>

</body>
</html>
