<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>

    <script type="text/javascript">

        function deleteConfirm (id) {
            location.href= "/user/deleteById/"+id;
        }

        function editGoods(id) {
            location.href= "/user/selectById/"+id;
        }




    </script>
</head>
<body>
<form>
    <table style="text-align: center;margin-right:10px;width:99%" class="table table-striped table-hover table-bordered">
        <thead>
        <tr>
            <th style="text-align: center;"><input id="all" type="checkbox" /></th>
            <th>序号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>地址</th>
            <th>编辑</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="users" varStatus="s">
            <tr>
                <td><input type="checkbox" name="ids" /></td>
                <td>${s.count }</td>
                <td>${users.username }</td>
                <td>${users.sex }</td>
                <td>${users.age }</td>
                <td>${users.address }</td>

                <td><a onclick="editGoods(${users.id})">编辑</a></td>
                <td><a onclick="deleteConfirm(${users.id})">删除</a></td>

            </tr>
        </c:forEach>

        </tbody>
    </table>
</form>
<form action="/user/selectById1" method="post">
    <label for="id">用户ID:<input type="text"id="id" name="idd"/></label>
    <input type="submit" value="查询"/>
</form>
<form action="/user/insertUser" method="post">

    <input type="submit" value="添加"/>
</form>
</body>
</html>
