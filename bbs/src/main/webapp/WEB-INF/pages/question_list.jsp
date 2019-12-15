<%--
  Created by IntelliJ IDEA.
  User: zengfeng
  Date: 2019/12/8
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
    <head>
        <title>所有提问</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <script src="${pageContext.request.contextPath}/js/jquery-2.1.0.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <style type="text/css">
            td {
                font-size: 10px;
                border-width: 0px;
            }

            img{
                width: 20px;
                height: 20px;
            }

            a {
                text-decoration: none;
            }
        </style>

    </head>
    <body>
        <table align="center" border="1px" class="table table-hover">
            <c:forEach items="${questions}" var="question" varStatus="vs">
                <tr>
                        <%--<td>${vs.count}</td>--%>
                    <td style="width: 500px; text-align: left;">
                        <a href="${pageContext.request.contextPath}/question/look?qid=${question.qid}">
                            <img src="${pageContext.request.contextPath}/images/question_logo.png"/> ${question.title}
                        </a>
                        <font color="red"> - [悬赏 ${question.credit} 积分] </font>
                        <c:if test="${question.isResolved == 1}">
                            (已解决)
                        </c:if>
                    </td>
                    <td style="text-align: right">
                        <fmt:formatDate value="${question.askTime}" pattern="yyyy-MM-dd HH:mm"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
