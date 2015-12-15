<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html>
	<title>CialdeStore</title>

	<jsp:include page="componenti/scripts.jsp"></jsp:include>
	
		
	<script type="text/javascript">
		
		$(document).ready(function() {

			$('#goTopDiv').hide()
			
			$("#owl-demo").owlCarousel({
				 
			      navigation : false, // Show next and prev buttons
			      slideSpeed : 300,
			      paginationSpeed : 400,
			      singleItem:true,
			      autoPlay: 10000,
			      pagination: true
			 
	  		});

			$("#promoCarousel").owlCarousel({
				 
			      navigation : false, // Show next and prev buttons
			      slideSpeed : 1000,
			      paginationSpeed : 1000,
			      items: 3,
			      autoPlay: 5000,
			      pagination: false,
			      stopOnHover: true,
			      itemsScaleUp: false,
			      scrollPerPage: true
			 
		  	});


			$(window).scroll(function()
				{

					if ($(window).scrollTop() == 0) {
						$('#goTopDiv').fadeOut(500);
					}
					else {
						$('#goTopDiv').fadeIn(500);
					}
					
				});


			$('#goTopDiv').click(function() {

				$("html, body").animate({ scrollTop: 0 }, "slow");
				
			});
			
		});
	
	</script>	
		
	<body>
		<!-- CONTENITORE PRINCIPALE -->
		<div class="wrapper"> 
		
			<!-- DIV CONTENENTE L'HEADER -->
			<jsp:include page="componenti/header.jsp"></jsp:include>
			
			<!-- DIV CONTENENTE LA NAVBAR -->
			<jsp:include page="componenti/navBar.jsp"></jsp:include>
					
				
			<div id="carouselDiv" class="carouselDiv">		
				<div id="owl-demo" class="owl-carousel owl-theme">
	 
	  				<div class="item"><img src="img/banner1.jpg" alt="The Last of us"></div>
	  				<div class="item"><img src="img/banner2.jpg" alt="GTA V"></div>
	  				<div class="item"><img src="img/banner3.jpg" alt="Mirror Edge"></div>
	 
				</div>
			</div>
			
			
			<div class="promoHeaderDiv">
		 		<div style="font-size: 50px; margin-top: 15px; color: #f1cf8f">
		 			<i class="fa fa-euro"></i>
		 		</div>
		 		<div style="font-size: 28px; margin-top: 10px; color: black; line-height: 28px; color: #f1cf8f">
		 			LE NOSTRE PROMOZIONI
		 		</div>
		 		<div style="font-size: 13px; font-weight: bold; margin-top: 15px; padding-left: 2px; padding-right: 2px; text-align: center">
		 			Non lasciarti scappare l'occasione di acquistare prodotti scontatissimi!
		 		</div>
			</div>
			
			
				
			<div class="promoDiv">
		 		<div id="promoCarousel" class="owl-carousel owl-theme">
	 				
	 				<% for (int i=0; i<12; i++) { %>
	  				<div class="item">
	  					<table class="promoInsTab">
							<tr>
								<td id="promoInsTabTitle" class="promoInsTabTitle">
									TITOLO PROMO NUMERO <%= i %>
								</td>
							</tr>
							<tr>
								<td style="padding: 0px; ">
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
				</div>
			</div>
			
			
		 	<div class="arrow"></div>
		 	<div id="goTopDiv"><i class="fa fa-angle-up"></i></div>
		 	
		 	<jsp:include page="componenti/boxInfo.jsp"></jsp:include>
		 		 	
		 	<jsp:include page="componenti/panelInfo.jsp"></jsp:include>
		 	
		 	<!-- IL CONTAINER DEI COLLEGAMENTI SOCIAL -->
		 	<jsp:include page="componenti/boxMedia.jsp"></jsp:include>	
		 	
		    
		 	<div class="push"></div>
		 		 		
		</div> 
		
		<!-- FOOTER -->
		<jsp:include page="componenti/footer.jsp"></jsp:include>
		  
	</body>
</html>
