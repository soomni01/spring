<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<p>${students[0]}</p>
<p>${students[1]}</p>
<p>${students[2]}</p>
<hr>
<p>${num}</p> <%-- 0 --%>
<p>${index}</p> <%-- "1" --%>
<p>${point}</p>
<hr>
<p>${students[num]}</p> <%--${students[0]}--%>
<p>${students[index]}</p> <%-- ${students["1"]}--%>
<p>${students[point]}</p> <%-- ${students["2"]}--%>
</body>
</html>