<%--
  Created by IntelliJ IDEA.
  User: loren_95ef1sg
  Date: 11/04/2022
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<jsp:useBean id="timeBean" class="com.example.assigment3.BeanFunctions" scope="request"/>
<div class="info">
    <jsp:getProperty name="timeBean" property="_Date"/>
</div>

</body>
</html>
