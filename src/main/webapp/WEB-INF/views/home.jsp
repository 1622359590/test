<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/14
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成员</title>
    <style>
        div{
            margin: auto;
        }
        table{
            width: 900px;
            margin: auto;
        }
    </style>
</head>
<body>
<form action="select">
    <input type="text" name="name" id="name">
    <input type="submit" value="提交">
</form><br>
<form action="add">
    姓名:<input type="text" name="name">
    密码:<input type="text" name="pwd">
    <input type="submit" value="新增">
</form>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>密码</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${users}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.pwd}</td>
            <td><a href="delete?id=${emp.id}">删除</a>&nbsp;&nbsp;<a href="toupdate?id=${emp.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>