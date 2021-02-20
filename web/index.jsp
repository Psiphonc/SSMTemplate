<%--
  Created by IntelliJ IDEA.
  User: yangchang
  Date: 2/20/21
  Time: 02:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <style>
        *,
        *::after,
        *::before {
            margin: 0;
            padding: 0;
            box-sizing: inherit;
        }

        html {
            font-size: 100%;
            font-family: "Arial", "Microsoft YaHei", "黑体", "宋体", sans-serif;
        }

        /* properties related to font are usually inherited so we using the body element to set universal font */
        body {
            /* any borders and padding margin are no longer added to the total box size */
            box-sizing: border-box;
        }
        .btn-group {
            width: 100%;
            display: flex;
            align-items: center;
            justify-content: center;
            margin: 2rem 0;
        }

        .btn {
            flex-basis: 10rem;
            background-image: linear-gradient(to right, #1abc9c, #16a085);
            box-shadow: .5rem .3rem .5rem rgba(0, 0, 0, .2);
            border-radius: 2rem;
            color: #fff;
            padding: 1rem 2rem;
            text-align: center;
            line-height: 100%;
            text-decoration: none;
        }


    </style>
</head>
<body>
<div class="btn-group">
    <a href="${pageContext.request.contextPath}/book/allBooks" class="btn">书籍列表</a>
</div>
</body>
</html>
