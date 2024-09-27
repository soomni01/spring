<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- 반복 --%>
<c:forEach begin="1" end="3">
    <p>반복해야하는 컨텐츠</p>
</c:forEach>

<c:forEach begin="0" end="4">
    <p>다섯번</p>
</c:forEach>

<c:forEach begin="1" end="5" var="idx">
    <p>${idx} 번</p>
</c:forEach>

<%-- begin 보다 end가 커야함 --%>
<%-- begin 의 값은 음수가 될 수 없음--%>
<hr>
<c:forEach begin="11" end="15" var="num">
    <p>${num}</p>
</c:forEach>

<hr>
<%-- 구구단 5단 출력 --%>
<c:forEach begin="1" end="9" var="i">
    <p>5 X ${i} = ${5*i}</p>
</c:forEach>

<hr>
<%--
request parameter 'dan'
?dan=5 : 5단 출력
?dan=7 : 7단 출력
--%>
<c:if test="${param.dan >1 && param.dan < 10}" var="validDan">
    <c:forEach begin="1" end="9" var="i">
        <p>${param.dan} X ${i} = ${param.dan * i}</p>
    </c:forEach>
</c:if>
<c:if test="${not validDan}">
    <p>유효한 단 수를 입력해주세요.</p>
</c:if>

<hr>
<%--forEach를 활용하여 2단~9단까지 출력--%>
<c:forEach begin="2" end="9" var="i">
    <p>구구단 ${i} 단</p>
    <c:forEach begin="2" end="9" var="j">
        <p>${i} X ${j} = ${i*j}</p>
    </c:forEach>
    <hr>
</c:forEach>
</body>
</html>
