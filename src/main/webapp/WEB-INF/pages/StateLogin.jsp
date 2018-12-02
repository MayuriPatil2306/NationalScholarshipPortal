<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page errorPage="error.jsp"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/File.css">
</head>
<body>
	<div class="log-form">

		<form class="login" action="state_login">
			<h1>Login For State Nodal Officer</h1>
			<input type="text" name="gstate_name" class="login-input"
				placeholder="State Username" autofocus> <input
				type="password" name="gstate_password" class="login-input"
				placeholder="Password"> <input type="submit" value="Login"
				class="login-button">
			<!--   <p class="login-lost"><a href="">Forgot Password?</a></p>-->
		</form>
	</div>
	<!--end log form -->
</body>
</html>