<%@ page errorPage="error.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Dashboard</title>
<!-- <link href="css/custom.css" rel="stylesheet">

 <link href="css/bootstrap.min.css" rel="stylesheet">
 -->
<link rel="stylesheet" href="resources/css/dash.css">

</head>

<body>
	<header>
	<center>
		<img class="img-responsive" src="resources/images/5.png">
	</center>
	</header>
	<div id="main">
		<article>
		<form>
			<label for="fname">Minority Based Scholarship</label> <a href="post">
				<input type="text" value="Post Matric Scholarship">
			</a> <label for="lname">Merit Based Scholarship</label> <a href="post">
				<input type="text"
				value="National Talent Search Examination Scholarship">
			</a> <label for="lname">Scholarship for Girls </label> <a href="post">
				<input type="text" value="Pragati Scholarship">
			</a> <a href="resources/pdf/Pragati.pdf">Guidelines for Pragati
				Scholarship Scheme.</a><br> <a href="resources/pdf/NTSE.pdf">Guidelines
				for National Talent Scholarship Education Scheme</a><br> <a
				href="resources/pdf/PostMetric.pdf">Guidelines for Post Metric
				Scholarship Scheme </a><br>
		</form>

		</article>

		<nav>

		<h3>Welcome Candidate </h3>
		<ul>
			<li><a href="#">My Account</a></li>
			<li><a href="status">Check Application Status</a></li>
			<li><a href="logout">Logout</a></li>

		</ul>
		</nav>
	</div>
	<footer>Footer</footer>
</body>

</html>