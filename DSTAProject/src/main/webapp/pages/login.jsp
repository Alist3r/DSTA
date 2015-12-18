
<!DOCTYPE html>

<%@page import="DSTAProject.model.Users"%>
<%@page import="DSTAProject.utils.DSTAConstants"%>
<html>
	<title>DSTA Project</title>
	
	<% 	
	Users user = (Users) session.getAttribute(DSTAConstants.SESSION_USER);

	if (user == null) {
	%>
	

	<jsp:include page="componenti/scripts.jsp"></jsp:include>
		
	<script type="text/javascript">
	
		$(document).ready(function() {
			
			
		});
		
	</script>	
		
	<body>
		<div class="wrapper">
		
	 		<div id="mainDiv">
			 	
			 	<jsp:include page="componenti/header.jsp"></jsp:include>
			 			 	
			 	<form action="doLogin.htm" method="POST">	
			 	
				 	<div id="loginDiv" style="margin: 0 auto; margin-top: 380px;">
				 		<table style="margin: 0 auto">
				 			<tr>
				 				<td style="width: 20px;"><i class="fa fa-user"></i></td>
				 				<td colspan="2"> <input name="<%= DSTAConstants.PARAM_USERNAME %>" id="usernameInput" class="custom-input" placeholder="Username"> </td>
				 			</tr>
				 			<tr>
				 				<td style="width: 20px;"><i class="fa fa-lock"></i></td>
				 				<td colspan="2"> <input name="<%= DSTAConstants.PARAM_PSW %>" type="password" id="passwordInput" class="custom-input" placeholder="Password"> </td>
				 			</tr>
				 			<tr>
				 				<td></td>
				 				<td> <button type="submit" class="custom-button" id="doLogin">L O G I N</button> </td>
				 				<td style="text-align: right;"> <a href="#">Registrati</a> </td>
				 			<tr>
				 		</table>
				 		<div class="div-center-Text">${msg}</div>
				 	</div>
				 </form>
				 
		 	</div>
		 	
		 	<div class="push"></div>
		 	
		</div>
		
		<jsp:include page="componenti/footer.jsp"></jsp:include>
		
	</body>
	<%
	}
	else {
		request.getRequestDispatcher("create.jsp").forward(request, response);
	}
	%>
</html>