
<!DOCTYPE html>

<%@page import="DSTAProject.model.Characters"%>
<%@page import="DSTAProject.utils.DSTAConstants"%>
<%@page import="DSTAProject.model.Users"%>

<% 	
	Users user = (Users) session.getAttribute(DSTAConstants.SESSION_USER);
    Characters character = (Characters) session.getAttribute("character");

	if (user != null) {
%>

<html>
	<title>DSTA Project</title>
	
	<jsp:include page="componenti/scripts.jsp"></jsp:include>
			
	<script type="text/javascript">
		
		$(document).ready(function() {
			
			$('#footer').fadeIn( 2000 );
			$('#header').hide().fadeIn( 2000 );
			$('#navBar').hide().fadeIn( 2000 );
			
			
			$("#dialog").dialog({
				modal:false,
				draggable:false,
				resizable:false,
				minWidth: 500,
	            maxWidth: 500,
	            minHeight: 800,
	            maxHeight: 800,
	            closeOnEscape: true,
	            autoOpen: false,
	            show: {
                    effect: "fade",
                    duration: 400
                },
                hide: {
                    effect: "fade",
                    duration: 400
                },
                open: function ()
                {
                    $(this).load('personaggio.htm');
                },
                position: { 
                    my: 'top',
                    at: 'bottom+5',
                    of: $('#inventario')
                  }
                                         
			});
			
			$('.ui-dialog .ui-button-text:contains(close)').text('Chiudi');
					
			$("#inventario").click( function() {	
				
				if($('#dialog').dialog( "isOpen" )) {
					$('#dialog').dialog('close');
				}
				else {
					$('#dialog').dialog('open');	
				}
				
				return false;
			});
		
								
		});
	
	</script>	
		
	<body>
		
		<div id="dialog"></div>
		
		<div class="wrapper">
		
		 	<jsp:include page="componenti/header.jsp"></jsp:include>	
		 	
		 	<div id="navBar" style="border-bottom: 1px dashed black; background-color: black;">
				<table style="width: 60%; margin: 0 auto; background-color: black;">
					<tr>
						<td class="tdNavBar">
							TIMELINE: Prologo
						</td>
						<td class="tdNavBar">
							LOCAZIONE: Da Qualche Parte
						</td>
						<td class="tdNavBar">
							LIVELLO: 82
						</td>
						<td class="tdNavBar">
							ANIME: 9999
						</td>
						<td class="tdNavBar" style="border-right: none; text-align: center;">
							<button id="inventario" class="customNavButton"><%= character.getName() %></button>
						</td>
					</tr>
				</table>
			</div>
		 	
		 	
		 	<div id="paginaPrincipale" style="border: 1px solid black; width: 38%; margin: 0 auto; margin-top: 10px; height: 87%">
		 		
		 		
		 	
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