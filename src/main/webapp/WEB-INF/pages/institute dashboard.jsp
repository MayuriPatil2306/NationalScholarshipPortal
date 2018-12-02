<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<!-- Template by Quackit.com -->
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<title>Institute DashBoard</title>

<!-- Bootstrap Core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS: You can use this stylesheet to override any Bootstrap styles and/or apply your own styles -->
<link href="resources/css/custom.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<!--  <!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			Logo and responsive toggle
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"> <span
					class="glyphicon glyphicon-fire"></span> National Scholarhip Portal
				</a>
			</div>
			Navbar links
			<div class="collapse navbar-collapse" id="navbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#">About Us</a></li>
					<li><a href="#">Contact Us</a></li>
					<li><a href="ViewUpload">View Student Applied Forms</a></li>
					<li><a href="#">Logout</a></li>
				</ul>

				Search
				<form class="navbar-form navbar-right" role="search">
					<div class="form-group">
						<input type="text" class="form-control">
					</div>
					<button type="submit" class="btn btn-default">Search</button>
				</form>

			</div>
			/.navbar-collapse
		</div>
		/.container
	</nav>
	-->


	<!-- Content -->
	<div class="container">

		<!-- Heading -->
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Institute Guidelines</h1>

			</div>
		</div>

		<c:if test="${lst !=null and not empty lst}">
			<table border="2px" cellpadding="8px" cellspacing="4px">
				<tr>
					<td>Name</td>
					<td>DOB</td>
					<td>Institute</td>
					<td>Aadhar</td>
					<td>10th Marks</td>
					<td>12th Marks</td>
					<td>Degree</td>
					<td>Income</td>
					<td>Caste</td>
					<td>View</td>

				</tr>


				<c:forEach var="e" items="${lst}">
					<tr>
						<td>${e.gs_name}</td>
						<td>${e.gs_dob}</td>
						<td>${e.gs_insname}</td>
						<td>${e.gs_aadhar}</td>
						<td>${e.gs_metric}</td>
						<td>${e.gs_hsc}</td>
						<td>${e.gs_degree}</td>
						<td>${e.gs_income}</td>
						<td>${e.gs_caste}</td>
						<td><a href="view/${e.gs_aadhar}">View</a></td>


					</tr>
				</c:forEach>

			</table>
		</c:if>



		<footer>


			<div class="footer-blurb">
				<div class="container">
					<div class="row">
						<div class="col-sm-4 footer-blurb-item">







							<form action="  " method="post">
								<h5>
									Select Bonafide to Upload:
									<h5>
										<input type="file" name="file" value="fileupload"
											id="fileupload"><br> <input type="submit"
											value="UPLOAD"> File_Name:<input type="text"
											name="name">
							</form>





						</div>

					</div>
					<!-- /.row -->
				</div>
			</div>

			<div class="small-print">
				<div class="container">
					<p>
						<a href="#">Terms &amp; Conditions</a> | <a href="#">Privacy
							Policy</a> | <a href="#">Contact</a>
					</p>
					<p>Copyright &copy; Example.com 2015</p>
				</div>
			</div>
		</footer>


		<!-- jQuery -->
		<script src="js/jquery-1.11.3.min.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script src="js/bootstrap.min.js"></script>

		<!-- IE10 viewport bug workaround -->
		<script src="js/ie10-viewport-bug-workaround.js"></script>

		<!-- Placeholder Images -->
		<script src="js/holder.min.js"></script>
</body>

</html>
