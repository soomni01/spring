<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>고객 정보 수정</h3>
<c:if test="${empty customer}">
    <h5>고객 정보를 먼저 조회하세요.</h5>
</c:if>
<c:if test="${not empty customer}">
    <form action="/main38/sub8" method="post">
        <div>
            고객번호
            <input type="text" name="id" value="${customer.id}">
        </div>
        <div>
            이름
            <input type="text" name="name" value="${customer.name}">
        </div>
        <div>
            계약명
            <input type="text" name="contactName" value="${customer.contactName}">
        </div>
        <div>
            주소
            <input type="text" name="address" value="${customer.address}">
        </div>
        <div>
            도시
            <input type="text" name="city" value="${customer.city}">
        </div>
        <div>
            우편번호
            <input type="text" name="postalCode" value="${customer.postalCode}">
        </div>
        <div>
            국가
            <input type="text" name="country" value="${customer.country}">
        </div>


        <div>
            <button>저장</button>
        </div>
    </form>
</c:if>
</body>
</html>
