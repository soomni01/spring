<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty message} ">
    <h5 style="background-color: skyblue">${message}</h5>
</c:if>
<h3>고객 조회</h3>
<form>
    <input type="number" placeholder="고객 번호" name="id">
    <button>조회</button>
</form>
<hr>
<c:if test="${not empty customer}">
    <%--    div*7>input[readonly][value]--%>
    <div>
        <input type="text" readonly="" value="${customer.id}">
    </div>
    <div>
        <input type="text" readonly="" value="${customer.name}">
    </div>
    <div>
        <input type="text" readonly="" value="${customer.contact}">
    </div>
    <div>
        <input type="text" readonly="" value="${customer.address}">
    </div>
    <div>
        <input type="text" readonly="" value="${customer.city}">
    </div>
    <div>
        <input type="text" readonly="" value="${customer.postalCode}">
    </div>
    <div>
        <input type="text" readonly="" value="${customer.country}">
    </div>
    <div>
        <form action="/main28/sub6" method="post">
            <input type="hidden" name="id" value="${customer.id}">
            <button style="background-color: darkred; color: white">삭제</button>
        </form>
    </div>
</c:if>
<c:if test="${empty customer}">
    <h3>해당 번호의 고객이 존재하지 않습니다.</h3>
</c:if>
</body>
</html>