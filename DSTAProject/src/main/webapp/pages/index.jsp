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
			 	<div class="div-center-Text" style="font-size: 60px; padding-top: 200px; font-family: 'Playfair Display', serif;">
			 		I n f i n i t y GDR
			 	</div>
			 	<div class="div-center-Text">
			 		A Diablo Souls Adventure
		 		</div>
		 	</div>
		 
		 	<div class="div-center-Text div-centered" id="startButton" hidden="hidden" style="margin-top: 200px; width: 95px;">
			 		<div id="toLogin" class="index-button" style="">S t a r t</div>
		 	</div>		
		 	
		 	<script>
	
			function base64_encode (data) {
				  var b64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
				  var o1, o2, o3, h1, h2, h3, h4, bits, i = 0,
				    ac = 0,
				    enc = "",
				    tmp_arr = [];
		
				  if (!data) {
				    return data;
				  }
		
				  do { // pack three octets into four hexets
				    o1 = data.charCodeAt(i++);
				    o2 = data.charCodeAt(i++);
				    o3 = data.charCodeAt(i++);
		
				    bits = o1 << 16 | o2 << 8 | o3;
		
				    h1 = bits >> 18 & 0x3f;
				    h2 = bits >> 12 & 0x3f;
				    h3 = bits >> 6 & 0x3f;
				    h4 = bits & 0x3f;
		
				    // use hexets to index into b64, and append result to encoded string
				    tmp_arr[ac++] = b64.charAt(h1) + b64.charAt(h2) + b64.charAt(h3) + b64.charAt(h4);
				  } while (i < data.length);
		
				  enc = tmp_arr.join('');
		
				  var r = data.length % 3;
		
				  return (r ? enc.slice(0, r - 3) : enc) + '==='.slice(r || 3);
		
				}	
			
			
				function readBlob(opt_startByte, opt_stopByte) {
		
					var files = document.getElementById('files').files;
					if (!files.length) {
						alert('Please select a file!');
						return;
					}
		
					var file = files[0];
					var start = parseInt(opt_startByte) || 0;
					var stop = parseInt(opt_stopByte) || file.size - 1;
		
					var reader = new FileReader();
		
					// If we use onloadend, we need to check the readyState.
					reader.onloadend = function(evt) {
						if (evt.target.readyState == FileReader.DONE) { // DONE == 2
							document.getElementById('myform').image.value= base64_encode(evt.target.result);
							document.getElementById('myform').action = "salvaImmagine.htm";
							document.getElementById('myform').submit();
							
						}
					};
		
					var blob = file.slice(start, stop + 1);
					reader.readAsBinaryString(blob);
				}
		
				document
						.querySelector('.readBytesButtons')
						.addEventListener(
								'click',
								function(evt) {
									if (evt.target.tagName.toLowerCase() == 'button') {
										var startByte = evt.target
												.getAttribute('data-startbyte');
										var endByte = evt.target
												.getAttribute('data-endbyte');
										readBlob(startByte, endByte);
									}
								}, false);
			</script>
		 			 	
		 	<div class="push"></div>
		 		
		</div> 
		
		<jsp:include page="componenti/footer.jsp"></jsp:include>
		  
	</body>
</html>
