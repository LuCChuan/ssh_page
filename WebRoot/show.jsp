<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    	<table align="center" width="60%">
    		<tr align="center">
    			<th>员工编号</th>
    			<th>员工姓名</th>
    			<th>入职时间</th>
    			<th>员工工资</th>
    			<th>部门名称</th>
    		</tr>
    		<s:iterator value="empPage.pageList" var="emp">
    			<tr align="center">
    				<td>${emp.empno}</td>
    				<td>${emp.ename}</td>
    				<td><s:date name="#emp.hiredate" format="yyyy-MM-dd"/></td>
    				<td>${emp.sal}</td>
    				<td>${emp.dept.dname}</td>
    			</tr>
    		</s:iterator>
    		
    	</table>	
	    	<div align="center">
	    		${empPage.maxResult}
	    		<s:iterator  var="i" begin="1" end="empPage.allPage">
	    			<a href="index/show?empPage.currentPage=${i}&empPage.maxResult=${empPage.maxResult}">${i}</a>
	    		</s:iterator>
	    		<form action="index/show" method="post">
	    		<input name="empPage.maxResult"/>
	    		<input type="submit" value="查询" />
	    		</form>
	    	</div>
    	
  </body>


</html>
