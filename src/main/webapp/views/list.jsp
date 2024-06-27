<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>雇员列表</title>
</head>
<body>

<table width="600px" cellpadding="0" cellspacing="0" align="center" border="1px">
    <tr>
        <td>ID</td>
        <td>名称</td>
        <td>密码</td>
        <td>EMail</td>
        <td>年龄</td>
        <td>操作</td>
    </tr>
    <%--
        c:forEach 遍历：
        items：具体遍历的数据  ${Key} 在共享数据中找到 key= employeeList 的数据，拿到对应的值。
        var：每一次遍历时的临时名字。
     --%>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.password}</td>
            <td>${employee.email}</td>
            <td>${employee.age}</td>
            <td>
                <a href="#">删除</a>
                <a href="#">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>