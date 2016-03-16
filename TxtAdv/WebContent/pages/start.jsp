<%@page import="modelli.Utente"%>
<%@page import="utils.Costanti"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	Utente utente = (Utente) session.getAttribute(Costanti.SESSION_UTENTE);
	
	if(utente != null) {
%>

<html>

	<jsp:include page="../pages/componenti/link.jsp"></jsp:include>
	
	<script type="text/javascript">
	

		$(document).ready(function() {

			var numPrologo = 1;

			hide('divPrologo2')
			fadeIn('divTitle')
			fadeIn('divPrologo' + numPrologo)

			$('#nextButton').click(function() {

				if(numPrologo == 2) {
					var url = 'In-Gabbia'
					
					window.location.href = url;
			        return false;
				}
				
				hide('divPrologo' + numPrologo);
				numPrologo = numPrologo + 1;
				fadeIn('divPrologo' + numPrologo)
				
			});		
		});
	
	</script>
	
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Prologo</title>
	</head>
	
	<body>
		<div class="wrapper">
	
			<div id="divTitle" style="padding-top: 50px; font-size: 18px;">
				<div class="autoMargin" style="width: 550px; border-bottom: 1px solid #fff; text-align: center;">PROLOGO</div>
			</div>
			
			<div id="divPrologo1" class="autoMargin divPrologo">
				Quando caddero le stelle, nessuno era pronto.<br>		
				Il 70% della superficie terrestre devastato da questo fenomeno inspiegabile.<br>	
				Subito dopo l'evento si diffuse il caos: <br>
				centri commerciali assaliti, risse in strada, furti, omicidi. <br>
				E poi c'erano quegli strani comportamenti di alcuni individui... <br>
				...cosa era arrivato insieme alle stelle?				
			</div>
			
			<div id="divPrologo2" class="autoMargin divPrologo">
				Nei successivi 6 anni la tecnologia fece passi in avanti enormi. <br>
				Caddero i governi e si formarono repubbliche indipendenti. <br>
				Alcune persone svilupparono capacità sovrumane, additati come contaminati. <br>
				Iniziarono le prime perseguitazioni. <br>
				La caccia al mutante costantemente aperta: <br>
				segregati, torturati, studiati.
				In pochi riuscivano a nascondersi.
			</div>
					
			<div class="autoMargin" style="text-align: center;"><button id="nextButton" class="customButton">Avanti ></button></div>
			
			<div class="push"></div>
		
		</div>
		
		<div id="footer" class="footer" style="text-align: center;">
			<p>Ver 1.0</p>
		</div> 
		
	</body>

</html>
<%
	}
	else {
		response.sendRedirect("index.jsp");	    
	}
 %>