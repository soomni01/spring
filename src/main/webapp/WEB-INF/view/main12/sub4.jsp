<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            border: 1px solid black;
        }

        td, th {
            border: 1px solid black;
        }

        td:nth-child(1)
        td:nth-child(4),
        td:nth-child(5),
        td:nth-child(6) {
            text-align: right;
        }
    </style>
</head>
<body>
<h3>상품 목록</h3>
<%--table>thead>tr>th*7--%>
<table>
    <thead>
    <tr>
        <th>번호</th>
        <th>상품명</th>
        <th>설명</th>
        <th>가격</th>
        <th>수량</th>
        <th>합계</th>
        <th>비고</th>
    </tr>
    </thead>
    <%--  tbody>tr*4>td*7--%>
    <tbody>
    <tr>
        <td>${productList[0].id}</td>
        <td>${productList[0].name}</td>
        <td>${productList[0].description}</td>
        <td>${productList[0].price}원</td>
        <td>${productList[0].quantity}개</td>
        <td>${productList[0].price * productList[0].quantity}</td>
        <td>${productList[0].quantity eq 0 ? "재고없음" : 0}</td>
    </tr>
    <tr>
        <td>${productList[1].id}</td>
        <td>${productList[1].name}</td>
        <td>${productList[1].description}</td>
        <td>${productList[1].price}원</td>
        <td>${productList[1].quantity}개</td>
        <td>${productList[1].price * productList[1].quantity}</td>
        <td>${productList[1].quantity eq 0 ? "재고없음" : 0}</td>
    </tr>
    <tr>
        <td>${productList[2].id}</td>
        <td>${productList[2].name}</td>
        <td>${productList[2].description}</td>
        <td>${productList[2].price}원</td>
        <td>${productList[2].quantity}개</td>
        <td>${productList[2].price * productList[2].quantity}</td>
        <td>${productList[2].quantity eq 0 ? "재고없음" : 0}</td>
    </tr>
    <tr>
        <td>${productList[3].id}</td>
        <td>${productList[3].name}</td>
        <td>${productList[3].description}</td>
        <td>${productList[3].price}원</td>
        <td>${productList[3].quantity}개</td>
        <td>${productList[3].price * productList[3].quantity}</td>
        <td>${productList[3].quantity eq 0 ? "재고없음" : 0}</td>
    </tr>
    </tbody>
</table>

</body>
</html>
