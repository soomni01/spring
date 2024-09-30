<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<div>
    <a href="/main16/sub3">블로그</a>
</div>
<div>
    <a href="/main16/sub4">카페</a>
</div>
<c:if test="${not empty sessionScope.userid}" var="loggedIN">
    <div>
        <a href="/main16/sub9">로그아웃</a>
    </div>
</c:if>

<c:if test="${not loggedIN}">
    <div>
        <a href="/main16/sub5">로그인</a>
    </div>
</c:if>
