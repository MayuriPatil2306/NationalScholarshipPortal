<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/style1.css">
<script type="text/javascript">
	function Validate() {
		var password = document.getElementById("gs_password").value;
		var confirmPassword = document.getElementById("gs_confirm_password").value;
		if (password != confirmPassword) {
			alert("Passwords do not match.");
			return false;
		}
		return true;
	}
</script>
</head>
<body>
<div class="login-page">
	<center><h1>Institute Registration Form</h1></center>
  <div class="form">
    <form class="login-form" method="post" action="student_register">
      <h3>Basic Details</h3>
				Institute Code: <input type="text" name="gi_code"
					pattern="[A-Za-z]{}" value="" placeholder="Your Institute Code"
					required> Institute Name : <input type="text"
					name="gi_name" value="" placeholder="Your Institute Name" required>
				<br> Institute State : <select name="gi_state" title="State"
					class="required" required>
					<option selected="selected" value="-1" title="-Select-">-Select-</option>
					<option title="Andaman &amp; Nicobar Islands">Andaman
						&amp; Nicobar Islands</option>
					<option title="Andhra Pradesh">Andhra Pradesh</option>
					<option title="Arunachal Pradesh">Arunachal Pradesh</option>
					<option title="Assam">Assam</option>
					<option title="Bihar">Bihar</option>
					<option title="Chandigarh">Chandigarh</option>
					<option title="Chhattisgarh">Chhattisgarh</option>
					<option title="Dadra &amp; Nagar Haveli">Dadra &amp; Nagar
						Haveli</option>
					<option title="Daman &amp; Diu">Daman &amp; Diu</option>
					<option title="Delhi">Delhi</option>
					<option title="Goa">Goa</option>
					<option title="Gujarat">Gujarat</option>
					<option title="Haryana">Haryana</option>
					<option title="Himachal Pradesh">Himachal Pradesh</option>
					<option value="1" title="Jammu and Kashmir">Jammu and
						Kashmir</option>
					<option title="Jharkhand">Jharkhand</option>
					<option title="Karnataka">Karnataka</option>
					<option title="Kerala">Kerala</option>
					<option title="Lakshadweep">Lakshadweep</option>
					<option title="Madhya Pradesh">Madhya Pradesh</option>
					<option title="Maharashtra">Maharashtra</option>
					<option title="Manipur">Manipur</option>
					<option title="Meghalaya">Meghalaya</option>
					<option title="Mizoram">Mizoram</option>
					<option title="Nagaland">Nagaland</option>
					<option title="Odisha">Odisha</option>
					<option title="Puducherry">Puducherry</option>
					<option title="Punjab">Punjab</option>
					<option title="Rajasthan">Rajasthan</option>
					<option title="Sikkim">Sikkim</option>
					<option title="Tamil Nadu">Tamil Nadu</option>
					<option title="Telangana">Telangana</option>
					<option title="Tripura">Tripura</option>
					<option title="Uttar Pradesh">Uttar Pradesh</option>
					<option title="Uttarakhand">Uttarakhand</option>
					<option title="West Bengal">West Bengal</option>
				</select> <br><br>
				Institute Affiliated University: <input type="text" name="gi_uni"
					value="" placeholder="Your Institute Affiliated University"
					required>

				<h3>Your Password</h3>
				Password<input type="password" name="gs_password" id="gs_password"
					pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
					placeholder="Your Password"
					title="Must contain at least one uppercase letter, one digit, one special character and lowercase letter and must be of 8 or more characters"
					required> 
				Confirm Password<input type="password" name="gs_confirm_password"
					id="gs_confirm_password" placeholder="Confirm Password" required>
	
      <button>login</button>
    </form>
  </div>
</div>
</body>
</html>