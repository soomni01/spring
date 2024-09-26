<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<p>${countries[0]}</p>
<p>${countries[1]}</p>
<p>${countries[2]}</p>
<p>${islands[0]}</p>
<p>${islands[1]}</p>
<p>${islands[2]}</p>
<p>${points[0]}</p>
<p>${points[1]}</p>
<p>${points[2]}</p>
<hr>
<!-- html 주석 : 응답에 포함됨 -->
<%-- jsp 주석 : 응답에 포함안됨 --%>
<%--
  단축키 ctrl + /
--%>
<p>${countries["0"]}</p> <%-- 배열인덱스로 문자열 사용가능 --%>
<p>${countries['1']}</p>
<p>${countries[2]}</p>
</body>
</html>