<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>/main13/sub1.jsp</p>
<p>${attr1}</p>
<%-- EL imlpicit objects --%>
<%-- 총 11개 --%>
<%-- param, paramValues,
 pageScope, requestScope, sessionScope, applicationScope--%>

<%--
param : request parameter를 map으로 담은 객체
--%>
<%-- ?name=흥민&age=33 --%>
<p>${param.name}</p> <%--흥민--%>
<p>${param.age}</p> <%--33--%>

<%-- ?address=seoul&city=jeju --%>
<p>${param["address"]}</p>
<p>${param.city}</p>

<%--쿼리 스트링 작성하고 요청 보내기--%>
<%--?email=gmail&hobby=soccer&score=80&location=seoul--%>
<p>${param.email}</p>
<p>${param.hobby}</p>
<p>${param.score}</p>
<p>${param.location}</p>

<h5>paramValues</h5>
<%-- paramValues : request parameter의 값들을 배열로 map에 넣은 객체 --%>
<%-- ?email=gmail&city=seoul --%>
<p>${param.email}</p> <%--gmail--%>
<p>${paramValues.email[0]}</p> <%--gmail--%>
<p>${param.city}</p> <%--seoul--%>
<p>${paramValues.city[0]}</p> <%--seoul--%>

<%--?hobby=축구&hobby=야구&hobby=농구&score=9.9&hobby=8.8--%>
<p>${paramValues.hobby[0]}</p>
<p>${paramValues.hobby[1]}</p>
<p>${paramValues.hobby[2]}</p>
<p>${paramValues.score[0]}</p>
<p>${paramValues.score[1]}</p>
<p>${param.hobby}</p>
<p>${param.score}</p>

<%--쿼리스트링 작성 후 요청 보내기--%>
<%--?player=son&player=lee&player=hwang&teams=a&teams=b--%>
<p>${paramValues.player[0]}</p>
<p>${paramValues.player[1]}</p>
<p>${paramValues.player[2]}</p>
<p>${paramValues.teams[0]}</p>
<p>${paramValues.teams[1]}</p>
</body>
</html>
