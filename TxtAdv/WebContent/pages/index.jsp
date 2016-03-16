<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<jsp:include page="../pages/componenti/link.jsp"></jsp:include>
	
	<script type="text/javascript">
	
		function vaiALogin() {
			var email = document.getElementById('email').value
			var password = document.getElementById('password').value
	
			var url = 'Login?email=' + email + '&password=' + password;
	
			window.location.href = url;
	        return false;
		}
	
	</script>
	
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Pagina Login</title>
	</head>
	
	<body>
		<div class="wrapper">
	
			<div style="text-align: center; padding-top: 200px;">
				<div class="autoMargin" style="width: 300px; text-align: left;">
					<div>email > <input placeholder="Inserire Email" class="customInput" id="email"></div>
					<div>password > <input placeholder="Inserire Password" type="password" class="customInput" id="password"></div>
					<br>
					<button class="autoMargin customButton" onClick="vaiALogin()">Login</button>
				</div>
			</div>
			
			<div class="push"></div>
		
		</div>
		
		<div id="footer" class="footer" style="text-align: center;">
			<p>Ver 1.0</p>
		</div> 
		
	</body>

</html>