<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html>
	<title>CialdeStore</title>

	<jsp:include page="componenti/scripts.jsp"></jsp:include>
	
		
	<script type="text/javascript">
		
		$(document).ready(function() {
			
			
		});
	
	</script>	
		
	<body>
		<!-- CONTENITORE PRINCIPALE -->
		<div class="wrapper"> 
		
			<!-- DIV CONTENENTE L'HEADER -->
			<jsp:include page="componenti/header.jsp"></jsp:include>
			
			<!-- DIV CONTENENTE LA NAVBAR -->
			<jsp:include page="componenti/navBar.jsp"></jsp:include>
					
			<table style="border-collapse: collapse; width: 100%; margin-top: 10px; margin-bottom: 20px;">
				<tr>
					<td id="colMenu" class="colmenu" style="width:300px; vertical-align: top;">
						<table>		
							<tr><td class="tdMenuTitle"> MARCHE </td>				
							<tr><td class="tdMenu" > Mitaca<td> <tr>
							<tr><td class="tdMenu" > Illy <td> <tr>
							<tr><td class="tdMenu" > Lavazza <td> <tr>	
							<tr><td class="tdMenu" > Tutte le Marche <td> <tr>
							
							<tr><td class="tdMenuTitle"> SISTEMA </td>				
							<tr><td class="tdMenu" > MPS<td> <tr>
							<tr><td class="tdMenu" > IES <td> <tr>
							<tr><td class="tdMenu" > Altro <td> <tr>
																	
						</table>
					
					</td>
					<td id="colListaOggetti" class="colListaOggetti" style="border-left: 3px solid #912b3d">
						
						<% for(int i=0; i < 10; i++) { %>
						
							<div style="float: left; border:3px solid white; width: 340px; height: 350px;">
								<table style="border-collapse: collapse; background-color: #f1cf8f; width: 100%; height: 100%; text-align: center;">
								 	<tr>
									 	<td style="text-align: center; vertical-align: top; font-size: 20px; color: #912b3d; font-weight: bold;">
									 		TITOLO INSERZIONE <%= i %>
									 	</td>
									</tr>
									<tr>
										<td style="padding: 0px; text-align: center; ">
											<img alt="" width="120" height="120" src="img/prova-macchina.png">
										</td>
									</tr>
									<tr>
										<td id="promoInsTabPrezzo" class="">
											
											<div class="promoInsTabPrezzo" >
												€ 69.00
											</div>
											<div class="promoInsTabPrezzoOld" >
												€ 50.00
											</div>
											
										</td>
									</tr>
									<tr>
										<td id="promoInsTabAggiungi" class="promoInsTabAggiungi">
											Aggiungi al Carrello <i class="fa fa-shopping-cart"></i>
										</td>
									</tr>
								</table>
							
							</div>
						<% } %>
								
					</td>
				<tr>
			</table>
			
			<jsp:include page="componenti/boxInfo.jsp"></jsp:include>	
		 	
		 	
		 	<!-- IL CONTAINER DEI COLLEGAMENTI SOCIAL -->
		 	<jsp:include page="componenti/boxMedia.jsp"></jsp:include>	
		    
		 	<div class="push"></div>
		 		 		
		</div> 
		
		<!-- FOOTER -->
		<jsp:include page="componenti/footer.jsp"></jsp:include>
		  
	</body>
</html>
