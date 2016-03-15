<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<jsp:include page="../pages/componenti/link.jsp"></jsp:include>
	
	<script type="text/javascript">
	

		$(document).ready(function() {

			var numAvanzamento = 1;

			fadeIn('divTitle')
			fadeIn('divInGabbia' + numAvanzamento)
			
		});
	
	</script>
	
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>In Gabbia</title>
	</head>
	
	<body>
		<div class="wrapper">
	
			<div id="divTitle" style="padding-top: 50px; font-size: 18px;">
				<div class="autoMargin" style="width: 550px; border-bottom: 1px solid #fff; text-align: center;">IN GABBIA</div>
			</div>
			
			<div id="divInGabbia1" class="autoMargin divPrologo" style="text-align: left;">
				??? > Ehi... ehi... Sei sveglio?
				<br>
				<br>
				<span class="fontCorsivo">
					La voce femminile desta i tuoi sensi. <br>
					Ti fa male la testa... hai gli occhi chiusi, forse da troppo tempo, considerando la fatica che fai per aprirli.
					Quando ci riesci la luce è terribilmente fastidiosa e ti obbliga a richiuderli subito dopo.
					Riprovi pochi minuti dopo e pian piano la luce si dirada, lasciando spazio ad un'ombra sfocata; <br>
					la figura prende forma pian piano, facendo intravedere il profilo che sembra quello di una donna dai capelli lunghi.
				</span>
				<br>
				<br>
				??? > Sono la dottoressa Adley. Ricordi il tuo nome? <br>
				Tu > Mi... mi chiamo:  <span><input placeholder="Inserisci il tuo nome" class="customInput" style="font-family: 'Muli', sans-serif;"></span><br>
				<span><button class="customButton">Conferma</button></span>				
			</div>
			
			<div id="divInGabbia1" class="autoMargin divPrologo" style="text-align: left;">
				??? > Ehi... ehi... Sei sveglio?
				<br>
				<br>
				<span class="fontCorsivo">
					La voce femminile desta i tuoi sensi. <br>
					Ti fa male la testa... hai gli occhi chiusi, forse da troppo tempo, considerando la fatica che fai per aprirli.
					Quando ci riesci la luce è terribilmente fastidiosa e ti obbliga a richiuderli subito dopo.
					Riprovi pochi minuti dopo e pian piano la luce si dirada, lasciando spazio ad un'ombra sfocata; <br>
					la figura prende forma pian piano, facendo intravedere il profilo che sembra quello di una donna dai capelli lunghi.
				</span>
				<br>
				<br>
				??? > Sono la dottoressa Adley. Ricordi il tuo nome? <br>
				Tu > Mi... mi chiamo:  <span><input placeholder="Inserisci il tuo nome" class="customInput" style="font-family: 'Muli', sans-serif;"></span><br>
				<span><button class="customButton">Conferma</button></span>				
			</div>
			
			<div class="push"></div>
		
		</div>
		
		<jsp:include page="../pages/componenti/footer.jsp"></jsp:include>
		
	</body>

</html>