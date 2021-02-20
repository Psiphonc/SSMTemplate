<%@ page import="top.psiphonc.pojo.Book" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yangchang
  Date: 2/20/21
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
</head>
<body>
<h1>书籍展示</h1>
<form action="/book/queryBook" method="get">
    <label for="bookName">查询书籍</label>
    <input id="bookName" name="bookName" type="text">
    <input type="submit"></form>
<table>
    <thead>
    <tr>
        <th>书籍编号</th>
        <th>书籍名称</th>
        <th>书籍数量</th>
        <th>书籍详情</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.bookId}</td>
            <td>${book.bookName}</td>
            <td>${book.bookCount}</td>
            <td>${book.detail}</td>
            <td><a href="${pageContext.request.contextPath}/book/toUpdateBook?bookId=${book.bookId}">修改</a></td>
            <td><a href="${pageContext.request.contextPath}/book/deleteBook?bookId=${book.bookId}">删除</a></td>
        </tr>
    </c:forEach>
    </tbody>
    <a href="${pageContext.request.contextPath}/book/toAddBook">添加图书</a>
</table>
</body>
</html>
