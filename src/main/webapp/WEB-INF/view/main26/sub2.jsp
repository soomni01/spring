<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>국가별 고객 조회</h3>
<form>
    <select name="country" id="">
        <c:forEach items="${countryList}" var="country">
            <option value="${country}"
                ${param.country == country ? 'selected' : ''}
            >${country}</option>
        </c:forEach>
    </select>
    <div style="border: 1px solid black; margin: 10px;">
        <h5>정렬 조건</h5>
        <input type="radio" name="order" value="name" id="radio1" ${param.order == 'name' ? 'checked' : ''}>
        <label for="radio1">고객명</label>
        <input type="radio" name="order" value="contact" id="radio2" ${param.order == 'contact' ? 'checked' : ''}>
        <label for="radio2">계약명</label>
    </div>
    <button>조회</button>
</form>
<hr>
<%--조회된 고객 데이터들 출력하는 table--%>
<table>
    <thead>
    <tr>
        <th>번호</th>
        <th>고객명</th>
        <th>계약명</th>
        <th>주소</th>
        <th>도시</th>
        <th>우편번호</th>
        <th>국가</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.contact}</td>
            <td>${customer.address}</td>
            <td>${customer.city}</td>
            <td>${customer.postalCode}</td>
            <td>${customer.country}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>