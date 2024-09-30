<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- attribute를 추가하는 코드 작성 하기 --%>
<c:set var="car" value="테슬라" scope="page"/>
<c:set var="car" value="기아" scope="request"/>
<c:set var="car" value="현대" scope="session"/>
<c:set var="car" value="삼성" scope="application"/>

<hr>
<p>${car}</p> <%--테슬라--%>
<p>${pageScope.car}</p> <%--테슬라--%>
<p>${requestScope.car}</p> <%--기아--%>
<p>${sessionScope.car}</p> <%--현대--%>
<p>${applicationScope.car}</p> <%--삼성--%>

<hr>
<c:set var="model" value="아반떼"/>
<c:set var="model" value="제네시스" scope="request"/>
<c:set var="model" value="모하비" scope="session"/>
<c:set var="model" value="모델 Y" scope="application"/>

<c:set var="food" value="피자" scope="request"/>
<c:set var="food" value="버거" scope="session"/>
<c:set var="food" value="돈까스" scope="application"/>

<p>${model}</p>
<p>${requestScope.model}</p>
<p>${sessionScope.model}</p>
<p>${applicationScope.model}</p>
<p>${food}</p>
<p>${sessionScope.food}</p>
<p>${applicationScope.food}</p>
<hr>

<c:if test="true" var="someTest">
</c:if>

<c:if test="${someTest}">
</c:if>

<p>${someTest}</p>
<p>${requestScope.someTest}</p> <%--request에 있는 someTest--%>

<c:import url="/WEB-INF/view/main/sub15.jsp" var="sub19output" scope="page"/>
<p>${sub19output}</p>
</body>
</html>
