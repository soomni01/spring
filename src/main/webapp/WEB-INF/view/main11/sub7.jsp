<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>${person.firstName} ${person.lastName}</p>
<p>${person.age} 세</p>
<p>
    취미
<ul>
    <li>${person.hobbies[0]}</li>
    <li>${person.hobbies[1]}</li>
    <li>${person.hobbies[2]}</li>
</ul>
</p>
</body>
</html>
