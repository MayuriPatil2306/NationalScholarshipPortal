<%@page errorPage="error.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<!-- disabling back button -->
<script type="text/javascript">
	history.pushState(null, null, location.href);
	window.onpopstate = function() {
		history.go(1);
	};
</script>
<body>
	<hr>
	<div class="container">
		<div class="logout">
			<!-- <img src="img/logout.jpg" style="width:100px; height:100px;margin-left:45% "> -->
			<h3>Logout Successful</h3>

		</div>
		<div id="logout-success">
			<a href="index.jsp"><button type="submit" class="submit-btn1"
					autofocus>Back to Login Page</button></a>
		</div>
	</div>
</body>
</html>