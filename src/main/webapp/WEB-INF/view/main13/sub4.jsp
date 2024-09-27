<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- var 속성의 이름으로 test 연산 결과가 el 객체(attribute)에 저장됨 --%>
<c:if test="${param.age < 20}" var="forKids">
    <p>어린이용 컨텐츠1</p>
</c:if>
<c:if test="${param.age >= 20}" var="forAdults">
    <p>성인용 컨텐츠1</p>
</c:if>
<hr>
<c:if test="${forKids}">
    <p>어린이용 컨텐츠2</p>
</c:if>
<c:if test="${forAdults}">
    <p>성인용 컨텐츠2</p>
</c:if>

<hr>
<c:if test="${param.loc == 'kr'}" var="locKr">
    <p>한국 컨텐츠1</p>
</c:if>
<c:if test="${param.loc == 'us'}" var="lokUs">
    <p>미국 컨텐츠1</p>
</c:if>

<p>여러 코드들...</p>
<c:if test="${locKr}">
    <p>한국 컨텐츠2</p>
</c:if>
<c:if test="${lokUs}">
    <p>미국 컨텐츠2</p>
</c:if>
</body>
</html>
