<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        span:nth-child(odd),
        div:nth-child(odd) {
            background-color: burlywood;
        }

        span:nth-child(even),
        div:nth-child(even) {
            background-color: cornflowerblue;
        }

    </style>
</head>
<body>
<%-- bootstrap 의 flexbox 관련 class --%>
<%-- d-flex = display : flex--%>
<%-- justify-content-center = justify-content : center--%>
<%-- justify-content-start --%>
<%-- justify-content-end --%>
<%-- justify-content-between --%>
<%-- justify-content-evenly --%>
<%-- justify-content-around --%>

<%-- align-items-start --%>
<%-- align-items-end --%>
<%-- align-items-center --%>
<%-- align-items-stretch --%>

<%-- flex-0 --%>
<%-- flex-1 --%>

<div class="d-flex align-items-center bg-success " style="height: 300px">
    <div class="flex-grow-1">1</div>
    <div class="flex-grow-1">2</div>
    <div>3</div>
    <div>4</div>
    <div>5</div>
</div>
<hr>

<div class="d-flex justify-content-center bg-success " style="height: 300px">
    <div>1</div>
    <div>2</div>
    <div>3</div>
    <div>4</div>
    <div>5</div>
</div>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
        integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
        crossorigin="anonymous"></script>
</body>
</html>