<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to home page</h1>

	<%-- 	<%
		String name = (String) request.getAttribute("name");
		Integer roll = (Integer) request.getAttribute("roll");
		List<String> nameList=(List<String>)request.getAttribute("nameList");
		
		
	%>

	<h3>Name : <%=name%></h3>
	<h3> Roll :<%=roll%></h3>
	<h3> Name List :
	
	<% for(String s:nameList)
		{%>
		<h4><%=s %></h4>
		<%}%>
	
	</h3>	 --%>

	<h3>Name : ${name}</h3>
	<h3>Roll :${roll }</h3>
	<h3>Name List :</h3>

	<c:forEach items="${nameList }" var="n">
	<h3><c:out value="${n }"></c:out>  </h3>
	</c:forEach>


	<a href="login">login</a>
</body>
</html>