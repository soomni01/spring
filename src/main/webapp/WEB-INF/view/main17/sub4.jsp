<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<div>
    <a href="/main17/sub2">블로그</a>
</div>
<div>
    <a href="/main17/sub3">카페</a>
</div>
<c:if test="${not empty sessionScope.userid}" var="loggedIN">
    <div>
        <a href="/main17/sub4">로그아웃</a>
    </div>
</c:if>

<c:if test="${not loggedIN}">
    <div>
        <a href="/main17/sub1">로그인</a>
    </div>
</c:if>
