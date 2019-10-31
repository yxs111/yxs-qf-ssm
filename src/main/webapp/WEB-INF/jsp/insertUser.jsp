
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/insert" method="post">


        <label for="username">姓名：<input type="text" value="${users.username}"  id="username" name="username"/></label>
        <label for="sex">性别：<input type="text" value="${users.sex}"  id="sex" name="sex"/></label>
        <label for="age">年龄：<input type="text" value="${users.age}"  id="age" name="age"/></label>
        <label for="address">地址：<input type="text" value="${users.address}"  id="address" name="address"/></label>
        <input type="submit" value="保存"/>

</form>
</body>
</html>
