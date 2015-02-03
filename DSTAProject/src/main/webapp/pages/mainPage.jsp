
<!DOCTYPE html>

<%@page import="DSTAProject.model.Characters"%>
<%@page import="DSTAProject.utils.DSTAConstants"%>
<%@page import="DSTAProject.model.Users"%>

<% 	
	Users user = (Users) session.getAttribute(DSTAConstants.SESSION_USER);
    Characters character = (Characters) session.getAttribute(DSTAConstants.SESSION_CHAR);

	if (user != null) {
%>

<html>
	<title>DSTA Project</title>
	
	<jsp:include page="componenti/scripts.jsp"></jsp:include>
			
	<script type="text/javascript">
		
		$(document).ready(function() {

			//CONTROLLO DELLA MUSICA
			var music = document.getElementById("themeMusic");
			music.volume = 0.1;

			//TRANSAZIONE COMPONENTI
			$('#footer').fadeIn( 2000 );
			$('#header').hide().fadeIn( 2000 );
			$('#navBar').hide().fadeIn( 2000 );
			
			//CREO IL DIALOG
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

			//CAMBIO IL TESTO DEL BOTTONE DI CHIUSURA DEL DIALOG
			$('.ui-dialog .ui-button-text:contains(close)').text('Chiudi');

			//FUNZIONE DI CLICK PER APERTURA/CHIUSURA DELLA SCHERMATA DEL PERSONAGGIO
			$("#inventario").click( function() {	
				
				if($('#dialog').dialog( "isOpen" )) {
					$('#dialog').dialog('close');
				}
				else {
					$('#dialog').dialog('open');	
				}
				
				return false;
			});

			//PLAY/PAUSE DELLA MUSICA
			$("#controlMusic").click( function() {	
				
				if(music.paused == true) {
					music.play()
					$("#controlMusic").attr({'class': 'fa fa-volume-up' })
				}
				else {
					music.pause();
					$("#controlMusic").attr({'class': 'fa fa-volume-off' })
				}

				
			});
		
								
		});
	
	</script>	
		
	<body>
		
		<div id="dialog"></div>
		
		<div class="wrapper">
		
			<audio id="themeMusic" autoplay="autoplay" loop="loop">  
        			<source src="music/Majula-Extended.mp3" type="audio/mp3" />
			</audio>
		
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
							<% if (!character.getName().equals("Unknown")) { %>
								<button id="inventario" class="customNavButton"><%= character.getName() %></button>
							<% } %>
						</td>
						<td> <i id="controlMusic" style="color:white; cursor:pointer;" class="fa fa-volume-up"></i> <a></a>
					</tr>
				</table>
			</div>
		 	
		 	
		 	<div id="paginaPrincipale" style="border: 1px solid black; width: 38%; margin: 0 auto; margin-top: 10px; height: 87%">
		 		<jsp:include page="${page}"></jsp:include>
		 	
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