<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>


<script 
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
  function validation(){
	 var userName=$('#userName').val(); 
	 var userEmail=$('#userEmail').val(); 
	 var password=$('#password').val(); 
	 var addess=$('#address').val(); 
	 var contact=$('#contact').val(); 
	 
	 var patternPassword="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
	
	 if (userName.length < 1) 
	 {
	     $('#userName').after('<span class="error">This field is required</span>');
	     return false;
	 }
	
	 else if(userEmail.length < 1) 
	 {
	     $('#userEmail').after('<span class="error">This field is required</span>');
	     return false;
	 }
	 
	 
	 else if(contact.length < 10) 
	 {
	     $('#contact').after('<span class="error">This field is required and must be of 10 numbers</span>');
	     return false;
		 }
	 else if(password.length < 4) 
	 {
	     $('#password').after('<span class="error">This field is required and atleast of 4 characters</span>');
	     return false;
		 }
	 else
	{
			
		return true;

			}
	 
	 } 
	

		
		
</script>
	<div align="center">



		<div class="container text-center text-center">
			<form method="post"
				action="<%=request.getContextPath()%>/MemberController/registerMember"
				class="form-horizontal" role="form" onsubmit="return validation()">

				<center>
					<h2>Registration Form</h2>
				</center>

				<br> <br>
				<div class="form-group">
					<label for="firstName" class="col-sm-3 col-form-label">Name</label>
					<div class="col-sm-4">
						<input type="text" placeholder="Full Name" id="userName"
							name="userName" class="form-control" required autofocus>

					</div>
				</div>

				<div class="form-group">
					<label for="ID Number" class="col-sm-3 col-form-label">Email
						Id</label>
					<div class="col-sm-4">
						<input type="email" placeholder="email" id="userEmail"
							name="userEmail" 
							pattern="^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$"
							titile="" class="form-control" required autofocus>

					</div>
				</div>

				<div class="form-group">
					<label for="password" class="col-sm-3 col-form-label">Password</label>
					<div class="col-sm-4">
						<input type="password" id="password" placeholder="Enter Password"
							id="password" name="password"
							
							title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
							class="form-control">
					</div>
				</div>

				<div class="form-group">
					<label for="Address" class="col-sm-3 col-form-label">Address</label>
					<div class="col-sm-4">
						<input type="text" placeholder="Enter address" id="address"
							name="address" required class="form-control">

					</div>
				</div>
				<div class="form-group">
					<label for="Contact Number" class="col-sm-3 col-form-label">Contact
						No</label>
					<div class="col-sm-4">
						<input type="tel" placeholder="Mobile number" id="contact"
							name="contact" class="form-control" minlength=10 maxlength=10
							title="Minimum 10 number should be there" required
							class="form-control">

					</div>
				</div>
				<div class="form-group">
					<div class="col-md-2 col-sm-offset-3">
						<button type="submit" id="btnRegister" class="btn btn-info">Register</button>
					</div>
				</div>
			</form>
			<!-- /form -->
		</div>
		<!-- ./container -->









	</div>




	</div>

</body>
</html>