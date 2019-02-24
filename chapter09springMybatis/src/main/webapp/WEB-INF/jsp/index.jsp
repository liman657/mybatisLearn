<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.Date" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/22
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD//XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%--<html>--%>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <title>九九乘法表</title>
</head>
<body>
<br/>
<form id="form1" name="form1" method="post" action="result.jsp">
    <p align="center">请输入两个自然数给您打印乘法表</p>
    <p align="center">要求：startNumber &lt;endNumber <br/></p>
    <table width="350" border="1" align="center" cellpadding="0"
           cellspacing="0" bgcolor="#aaccdd" bordercolor="#cccccc">
        <tr>
            <td width="101">startNumber:</td>
            <td width="113">
                <label>
                    <input name="s" type="text" id="textfield" size="15" maxlength="8" height="20"/>
                </label>
            </td>
            <td width="68">&nbsp;<br/></td>
        </tr>
        <tr>
            <td>endNumber</td>
            <td>
                <label>
                    <input name="e" type="text" id="textfield2" size="15" maxlength="8" height="20"/>
                </label>
            </td>
            <td>&nbsp;<br/></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>
                <label>
                    <input type="submit" name="button" id="button" value="submit"/>
                    <input name="button2" type="reset" id="button2" value="reset"/>
                </label>
            </td>
            <td>&nbsp;</td>
        </tr>
    </table>

    <p>
        Hello Web!
    </p>
    <p>
        <%
            Date now = new Date();
            System.out.println("服务器时间："+now.toString());
        %>
        服务器时间：<fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss"/>
    </p>
</form>
</body>
</html>
