<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>sub16.jsp contents</h3>
<%--
attribute가 저장되는 영역 4군데
1. page
2. request(model)
3. session
4. application
--%>

<%--
set : attribute에 값을 추가하는 태그
--%>

<%--page 영역에 추가 --%>
<c:set var="attr1" value="hello attribute1"/>
<c:set var="attr2" value="hello attribute2" scope="page"/>

<%--request(model) 영역에 추가--%>
<c:set var="attr3" value="hello attribute3" scope="request"/>

<%-- session(?) 영역에 추가--%>
<c:set var="attr4" value="hello attribute4" scope="session"/>

<%-- application(?) 영역에 추가--%>
<c:set var="attr5" value="hello attribute5" scope="application"/>

<%-- page 영역에서 꺼냄 --%>
<p>${attr1}</p>
<p>${attr2}</p>

<%-- request 영역에서 꺼냄--%>
<p>${attr3}</p>

<%-- session 영역에서 꺼냄--%>
<p>${attr4}</p>

<%--application 영역에서 꺼냄--%>
<p>${attr5}</p>

<%-- page 영역 : 하나의 jsp가 공유하는 영역 --%>
<c:set var="prod" value="커피" scope="page"/>
<p>${prod}</p>

<%-- request 영역 : 하나의 request를 사용하는 곳에서 공유하는 영역 --%>
<c:set var="model" value="제네시스" scope="request"/>
<p>${model}</p>

<%-- session 영역 : 하나의 브라우저에서 오는 여러 request가 공유하는 영역 --%>
<c:set var="car" value="테슬라" scope="session"/>
<p>${car}</p>

<%-- application 영역 : 어플리케이션 내의 모든 곳에서 사용 가능한 영역--%>
<c:set var="food" value="피자" scope="application"/>

<c:import url="/WEB-INF/view/main15/sub17.jsp"/>
</body>
</html>