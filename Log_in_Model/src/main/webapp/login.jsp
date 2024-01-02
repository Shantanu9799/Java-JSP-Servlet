<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
	<div class="container" id="container">
		<div class="form-container sign-up-container">
			<form action="register">
				<h1>Create Account</h1>
				<input type="text" placeholder="Choose your username" name="name"/>
				<input type="email" placeholder="Email" name="email" />
				<input type="password" placeholder="Password" name="psw" />
				<button type="submit">Sign Up</button>
			</form>
		</div>
		
		<div class="form-container sign-in-container">
			<form action="login" method="post">
				<h1>Sign in</h1>
				<input type="text" placeholder="Username" name="name" />
				<input type="password" placeholder="Password" name="psw" />
				<!-- <a href="#">Forgot your password?</a> -->
				<button type="submit">Sign In</button>
			</form>
		</div>
		
		<div class="overlay-container">
			<div class="overlay">
				<div class="overlay-panel overlay-left">
					<h1>Welcome Back!</h1>
					<p>To keep connected with us please login with your personal info</p>
					<button class="ghost" id="signIn">Sign In</button>
				</div>
				<div class="overlay-panel overlay-right">
					<h1>Hello, Friend!</h1>
					<p>Enter your personal details and start journey with us</p>
					<button class="ghost" id="signUp">Sign Up</button>
				</div>
			</div>
		</div>
	</div>
	
	<footer>
		<p>
			Created with <i class="fa fa-heart"></i> by
			<a target="_blank" href="https://florin-pop.com">Florin Pop</a>
			- Read how I created this and how you can join the challenge
			<a target="_blank" href="https://www.florin-pop.com/blog/2019/03/double-slider-sign-in-up-form/">here</a>.
		</p>
	</footer>
	
</body>
<script src="index.js"></script>
</html>