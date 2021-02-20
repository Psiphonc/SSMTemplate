<%--
  Created by IntelliJ IDEA.
  User: yangchang
  Date: 2/20/21
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddBook</title>
</head>
<body>
<h1>修改书籍</h1>
<form action="${pageContext.request.contextPath}/book/updateBook" method="post">
    <div class="form-group">
        <label for="bookId">书籍编号</label><input type="text" name="bookId" id="bookId" value="${book.bookId}" disabled>
    </div>
    <div class="form-group">
        <input type="hidden" name="bookId" value="${book.bookId}" style="display: none">
    </div>
    <div class="form-group">
        <label for="bookName">书籍名</label><input type="text" name="bookName" id="bookName" value="${book.bookName}">
    </div>
    <div class="form-group">
        <label for="bookCount">书籍数量</label><input type="text" name="bookCount" id="bookCount" value="${book.bookCount}">
    </div>
    <div class="form-group">
        <label for="detail">信息</label><input type="text" name="detail" id="detail" value="${book.detail}">
    </div>
    <input type="submit">
</form>
</body>
</html>
