<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>
    <jsp:useBean id="timeBean" class="com.example.assigment3.BeanFunctions" scope="request"/>
    <jsp:getProperty name="timeBean" property="_Time" />
</body>
</html>
