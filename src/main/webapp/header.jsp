<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <title>Header</title>
    <link rel ="stylesheet" type="text/css" href="style.css">
</head>
<body>
<ul>
<li><a href="index.jsp">Home</a></li>
<li><a href="ServletAdmin">Admin Dashboard</a></li>
<li><a href="date.jsp">Get current date</a></li>
<li><a href="time.jsp">Get current time</a></li>
</ul>
<hr>
<br>
<jsp:useBean id="beanMote" class="com.example.assigment3.BeanMotOfTheDay" scope="application"/>
<p class="mot"><jsp:getProperty name="beanMote" property="mote_of_the_day" /></p>
<hr>
<br>

</body>
</html>
