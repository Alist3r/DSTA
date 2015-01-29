<!DOCTYPE html>

<html>
	<title>DSTA Project</title>

	<link href="css/DSTAStyle.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="js/jquery-1.10.2.js"></script>
	<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,300italic,700' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Playfair+Display:400,700,900,400italic,700italic,900italic' rel='stylesheet' type='text/css'>
	
		
	<script type="text/javascript">
		
		$(document).ready(function() {
			
			$('#footer').fadeIn( 3500 );
			
			$('#titleDiv').fadeIn( 3500, function() {				
				setInterval(function(){
				      $('#startButton').fadeIn(800).fadeOut(800);		 
				},1);		
				
			});	
			
			$('#startButton').click( function() {
				window.location.href = 'login.htm';
			});
			
		});
	
	</script>	
		
	<body>
		<div class="wrapper">
		
		 	<div id="titleDiv" hidden="hidden">
			 	<div class="divCenterText" style="font-size: 60px; padding-top: 200px; font-family: 'Playfair Display', serif;">
			 		T E X T SOULS
			 	</div>
			 	<div class="divCenterText">
			 		D a r k S o u l s A d v e n t u r e E d i t i o n
		 		</div>
		 	</div>
		 
		 	<div class="divCenterText divCentered" id="startButton" hidden="hidden" style="margin-top: 200px; width: 95px;">
			 		<div id="toLogin" class="loginButton" style="">S t a r t</div>
		 	</div>		
		 			 	
		 	<div class="push"></div>
		 		
		</div> 
		
		<jsp:include page="componenti/footer.jsp"></jsp:include>
		  
	</body>
</html>