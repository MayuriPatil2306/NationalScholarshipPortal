<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<c:if test="${list !=null and not empty list}">
		<table border="2px" cellpadding="8px" cellspacing="4px">
			<tr>
				<td>Name</td>
				<td>DOB</td>
				<td>Mobile</td>
				<td>Email</td>
				<td>Institute</td>
				<td>Aadhar</td>
				<td>Bank Name</td>
				<td>Ifsc</td>
				<td>Account No</td>
				<td>State</td>
				<td>10th Marks</td>
				<td>12th Marks</td>
				<td>Degree</td>
				<td>Income</td>
				<td>Caste</td>
				<td>Status</td>
			</tr>
			<c:forEach var="e" items="${list}">
				<tr>
					<td>${e.gs_name}</td>
					<td>${e.gs_dob}</td>
					<td>${e.gs_mobile}</td>
					<td>${e.gs_email}</td>
					<td>${e.gs_insname}</td>
					<td>${e.gs_aadhar} <a href="/scholarship/download/${e.gs_aadhar}/aadhar">download</a></td>
					<td>${e.gs_bank_name}</td>
					<td>${e.gs_ifsc}</td>
					<td>${e.gs_account_no}</td>
					<td>${e.gs_state}<a href="/scholarship/download/${e.gs_aadhar}/state">download</a></td>
					<td>${e.gs_metric}<a href="/scholarship/download/${e.gs_aadhar}/metric">download</a></td>
					<td>${e.gs_hsc}<a href="/scholarship/download/${e.gs_aadhar}/hsc">download</a></td>
					<td>${e.gs_degree}<a href="/scholarship/download/${e.gs_aadhar}/degree">download</a></td>
					<td>${e.gs_income}<a href="/scholarship/download/${e.gs_aadhar}/income">download</a></td>
					<td>${e.gs_caste}<a href="/scholarship/download/${e.gs_aadhar}/caste">download</a></td>

					<td>
						<form action="/scholarship/status/${e.gs_aadhar}">
					   <select name="checkstatus">
							<option>Approved</option>
							<option>Rejected</option>
					   </select> <input type="submit" value="Confirm">
					    </form>
					</td>

				</tr>
			</c:forEach>

		</table>
	</c:if>
	
	  
</body>
</html>