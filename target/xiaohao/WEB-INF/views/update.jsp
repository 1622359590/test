<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/18
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改</title>
</head>
<body>

<form action="tohome">
    <input type="hidden" id="id" name="id" value="${user.id}">
    <input type="text" id="name" name="name" value="${user.name}"><br>
    <input type="text" id="pwd" name="pwd" value="${user.pwd}"><br>
    <input type="submit" value="修改">
</form>
</body>
</html>
