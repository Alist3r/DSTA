
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
			
			$('#mainDiv').fadeIn(2000);
			$('#footer').fadeIn(2000);
			
		});
		
	</script>	
		
	<body>
		<div class="wrapper">
		
	 		<div id="mainDiv" hidden="hidden">
			 	
			 	<jsp:include page="componenti/header.jsp"></jsp:include>
			 
			 	
			 	<form action="story/begin/create.htm" method="POST">	
			 	
				 	<div id="loginDiv" style="margin: 0 auto; margin-top: 380px;">
				 		<table style="margin: 0 auto">
				 			<tr>
				 				<td colspan="2"> <input name="<%= DSTAConstants.PARAM_EMAIL %>" id="emailInput" class="customInput" placeholder="E-Mail Address"> </td>
				 			</tr>
				 			<tr>
				 				<td colspan="2"> <input name="<%= DSTAConstants.PARAM_PSW %>" type="password" id="passwordInput" class="customInput" placeholder="Password"> </td>
				 			</tr>
				 			<tr>
				 				<td> <button type="submit" class="customButton" id="doLogin">L O G I N</button> </td>
				 				<td style="text-align: right;"> <a href="#">Registrati</a> </td>
				 			<tr>
				 		</table>
				 		<div class="divCenterText">${msg}</div>
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
		request.getRequestDispatcher("mainPage.jsp").forward(request, response);
	}
	%>
</html>