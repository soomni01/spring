<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<style>
    .navbar {
        display: flex;
        gap: 5px;
    }

    .nav-item {
        padding: 10px;
    }

    .nav-item:hover {
        background-color: darkgray;
        color: yellow;
        cursor: pointer;
    }
</style>

<div class="navbar">
    <div class="nav-item">증권 홈</div>
    <div class="nav-item">국내증시</div>
    <div class="nav-item">해외증시</div>
    <div class="nav-item">시장지표</div>
    <div class="nav-item">리서치</div>
    <div class="nav-item">AI분석</div>
</div>
