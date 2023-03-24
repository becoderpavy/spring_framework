<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>
		
		<%-- <% 
			String className=(String)request.getAttribute("Class");
			Integer regNum=(Integer)request.getAttribute("regnumber");
			List<String> nameList=(List<String>)request.getAttribute("nameList");
		%>


		<h4>Class : <%=className %></h4>
		<h4>Reg Num : <%=regNum %></h4>
		<h4>Name: <%=nameList %></h4> --%>
		
		
		<h4>Class : ${className } </h4>
		<h4>Reg Num : ${regnumber }</h4>
		<h4>Name: ${nameList }</h4>
		
		
</body>
</html>