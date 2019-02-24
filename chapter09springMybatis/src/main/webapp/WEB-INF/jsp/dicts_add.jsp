<%@ page language="java" contentType="text/html;charset=UTF8" pageEncoding="UTF8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD//XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%--<html>--%>
<head>
    <c:set var="path" value="${pageContext.request.contextPath}"></c:set>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <title>字典维护</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
<form action="${ path}/dicts/add" method="post">
    <input type="hidden" name="id" value="${model.id}">
    <table>
        <c:if test="${msg!= null}">
        <tr>
            <th colspan="2" style="color:red; max-width:400px;">${msg}</th>
        </tr>
        </c:if>
    </table>
    <tr>
        <th colspan="2">字典维护</th>
    </tr>
    <tr>
        <th>类别名</th>
        <td><input type="text" name="code" value="${model.code}"></td>
    </tr>
    <tr>
        <th>字典名</th>
        <td><input type="text" name="name" value="${model.name}"></td>
    </tr>
    <tr>
        <th>字典值</th>
        <td><input type="text" name="value" value="${model.value}"></td>
    </tr>
    <tr>
        <th colspan="2">
            <input type="submit" value ="保存">
            <input type="button" onclick="backToList()"value="取消">
        </th>
    </tr>
</form>
<script>

    function backToList() {
        location.href ='${path}/dicts';
    }

</script>
</body>
</html>
