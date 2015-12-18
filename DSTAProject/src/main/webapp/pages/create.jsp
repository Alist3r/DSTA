
<!DOCTYPE html>

<%@page import="DSTAProject.model.Users"%>
<%@page import="DSTAProject.utils.DSTAConstants"%>
<html>
	<title>DSTA Project</title>
	
	<% 	
	Users user = (Users) session.getAttribute(DSTAConstants.SESSION_USER);

	if (user != null) {
	%>
	

	<jsp:include page="componenti/scripts.jsp"></jsp:include>
		
	<script type="text/javascript">
	
		$(document).ready(function() {

			$('#classGuerriero').mouseover(function() {
				$('.border-guerriero').css('border-width','10px')
			});

			$('#classGuerriero').mouseout(function() {
				$('.border-guerriero').css('border-width','5px')
			});

			$('#classMago').mouseover(function() {
				$('.border-mago').css('border-width','10px')
			});

			$('#classMago').mouseout(function() {
				$('.border-mago').css('border-width','5px')
			});

			$('#classLadro').mouseover(function() {
				$('.border-ladro').css('border-width','10px')
			});

			$('#classLadro').mouseout(function() {
				$('.border-ladro').css('border-width','5px')
			});
			
		});
		
	</script>	
		
	<body>
		<div class="wrapper">	 		
	 		<jsp:include page="componenti/header.jsp"></jsp:include>
			 
			<div class="div-centered" style="border:1px  #000; width: 50%; padding: 5px; margin-top: 300px; height: 30%">
				
				<div id="classGuerriero" class="class-container">
					<span style="width: 30%">
						<img class="class-icon border-guerriero" width="150" height="150" src="img/icon-guerriero.svg" />
					</span>
					<span class="class-name color-guerriero">GUERRIERO</span>
					<span class="class-attribute"><img style="" src="img/attacco.svg" width="24" height="24"/> ATTACCO: 8 </span>
					<span class="class-attribute"><img style="" src="img/difesa.svg" width="24" height="24"/> DIFESA: 8 </span>
					<span class="class-attribute"><img style="" src="img/precisione.svg" width="24" height="24"/> PRECISIONE: 8 </span>				
					
				</div>
				<div id="classMago" class="class-container">
					<span style="width: 30%">
						<img class="class-icon border-mago" width="150" height="150" src="img/icon-mago.svg" />
					</span>
					<span class="class-name color-mago">MAGO</span>
					<span class="class-attribute"><img style="" src="img/attacco.svg" width="24" height="24"/> ATTACCO: 8 </span>
					<span class="class-attribute"><img style="" src="img/difesa.svg" width="24" height="24"/> DIFESA: 8 </span>
					<span class="class-attribute"><img style="" src="img/precisione.svg" width="24" height="24"/> PRECISIONE: 8 </span>				
					
				</div>			
				<div id="classLadro" class="class-container">
					<span style="width: 30%">
						<img class="class-icon border-ladro" width="150" height="150" src="img/icon-ladro.svg" />
					</span>
					<span class="class-name color-ladro">LADRO</span>
					<span class="class-attribute"><img style="" src="img/attacco.svg" width="24" height="24"/> ATTACCO: 8 </span>
					<span class="class-attribute"><img style="" src="img/difesa.svg" width="24" height="24"/> DIFESA: 8 </span>
					<span class="class-attribute"><img style="" src="img/precisione.svg" width="24" height="24"/> PRECISIONE: 8 </span>				
					
				</div>	
					
			</div> 	
			 		 	
		 	<div class="push"></div>	 	
		</div>
		
		<jsp:include page="componenti/footer.jsp"></jsp:include>
		
	</body>
	<%
	}
	else {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	%>
</html>