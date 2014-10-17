<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>books</title>
</head>
<body>
	The books of
		<s:property value="name"/>
	<br>
	==========================================================<br>
	
	<table width="55%" border="1" cellpadding="2" cellspacing="0">
	<%
		out.println("<tr>");
		out.println("<td>"+"Title"+"</td>");
		
		out.println("<td>"+"ISBN"+"</td>");
	
		out.println("<td>"+"Publisher"+"</td>");
		
		out.println("<td>"+"PublishDate"+"</td>");
		
		out.println("<td>"+"Price(￥)"+"</td>");
		out.println("<tr>");
	%>
	</table>
	-----------------------------------------------------------------------------------------<br>
	<table>
	
	
	<s:iterator value="books" id="bok">
   	<tr>
        <td><s:property value="Title"/></td>
        <td>|</td>
        
        <td><s:property value="ISBN"/></td>
        <td>|</td>
        
        <td><s:property value="Publisher"/></td>
        <td>|</td>
        
        <td><s:property value="PublishDate"/></td>
        <td>|</td>
        
        <td><s:property value="Price"/></td>
        <td>|</td>
   	</tr>
	</s:iterator>
	</table>
	==========================================================<br>
	<br>
	-----------------------------------------------------------------------------------------<br>
	<form Action="delete.action" method="post">
			 Title:<input name="title" type="text">
			 <input type="submit" value="delete">
	</form>
	==========================================================<br>
</body>
</html>