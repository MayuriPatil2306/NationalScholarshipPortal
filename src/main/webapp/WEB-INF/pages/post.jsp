<%@page errorPage="error.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Application Form</title>

<!-- CSS -->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/post.css"/>">


</head>
<body>
	<h3 align=center>${str}</h3>
	<header>
		<center>
			<img class="img-responsive" src="resources/images/5.png">
		</center>
	</header>
	<div id="main">
		<article>
			<form class="myForm" method="POST" action="uploadMultipleFile"
				enctype="multipart/form-data">
				<center>
					<h1>Application Form</h1>
				</center>
				<center>
					<h3>Basic Details</h3>
				</center>
				<div class="box1">
					<table border="2px" cellpadding="10px" cellspacing="10px">
						<tr>
							<td><label>Name of the Candidate <input type="text"
									name="gs_name" placeholder="Name of Candiadte Applying"
									required>
							</label></td>
							<td><label>Name of the Institute <input type="text"
									name="gs_insname" placeholder="Name of Current Institute"
									required>
							</label></td>
						</tr>

						<tr>
							<td><label>Student DOB : <input type="text"
									name="gs_dob" placeholder="Candiadte DOB" required>
							</label></td>
							<td><label>Student Email id : <input type="email"
									name="gs_email" placeholder="Email of Candiadte Applying"
									required>
							</label></td>
						</tr>
						<tr>
							<td><label>Student Mobile Number : <input
									type="text" name="gs_mobile" placeholder="Enter Mobile No."
									required>
							</label></td>
							<td><label>Student State : <input type="text"
									name="gs_state" placeholder="Enter Address of Candiadte"
									required>
							</label></td>
						</tr>
					</table>
				</div>
				<center>
					<h3>Education Details</h3>
				</center>
				<div class="box1">
					<table border="2px" cellpadding="10px" cellspacing="10px">
						<tr>
							<td><label>Candidate 10th Marks <input type="text"
									name="gs_metric" placeholder="Enter Marks" required>
							</label></td>
							<td><label>Candidate 12th Marks <input type="text"
									name="gs_hsc" placeholder="Enter Marks" required>
							</label></td>
						</tr>
						<tr>
							<td><label>Candidate Degree Marks <input type="text"
									name="gs_degree" placeholder="Enter Marks" required>
							</label></td>
						</tr>
					</table>

				</div>

				<center>
					<h3>Other Details</h3>
				</center>

				<div class="box1">

					<table border="2px" cellpadding="10px" cellspacing="10px">
						<tr>
							<td><label>Family Annual Income <input type="text"
									name="gs_income" placeholder="Candiadte Family income" required>
							</label></td>
							<td><label>Candidate Religion/Caste <input
									type="text" name="gs_caste"
									placeholder="Candiadte Religion/Caste" required>
							</label></td>
						</tr>
					</table>
				</div>

				<center>
					<h3>Documents to be Uploaded</h3>
				</center>


				<div class="box1">

					<table border="2px" cellpadding="10px" cellspacing="10px">
						<tr>
							<td><label>10th Marksheet <input type="file"
									name="file" value="fileupload" id="fileupload">
									File_Name:<input type="text" name="name">
							</label></td>
							<td><label>12 Marksheet <input type="file"
									name="file" value="fileupload" id="fileupload">
									File_Name:<input type="text" name="name">
							</label></td>
						</tr>
						<tr>
							<td><label>Degree Marksheet <input type="file"
									name="file" value="fileupload" id="fileupload">
									File_Name:<input type="text" name="name">
							</label></td>
							<td><label> Domecile Certificate <input type="file"
									name="file" value="fileupload" id="fileupload">
									File_Name:<input type="text" name="name">
							</label></td>
						</tr>
						<tr>
							<td><label> Income Certificate <input type="file"
									name="file" value="fileupload" id="fileupload">
									File_Name:<input type="text" name="name">
							</label></td>
							<td><label> Aadhar Card No <input type="file"
									name="file" value="fileupload" id="fileupload">
									File_Name:<input type="text" name="name">
							</label></td>
						</tr>
						<tr>
							<td><label> Caste Validity Certificate <input
									type="file" name="file" value="fileupload" id="fileupload">
									File_Name:<input type="text" name="name">
							</label></td>
						</tr>

					</table>
				</div>

				<center>
					<input type="submit" value="Send for Approval">
				</center>
			</form>
		</article>
		<nav>

			<h3>Welcome Candidate</h3>
			<ul>
				<li><a href="#">My Account</a></li>
				<li><a href="#">Check Application Status</a></li>
				<li><a href="#">LogOut</a></li>

			</ul>
		</nav>
	</div>


</body>
</html>