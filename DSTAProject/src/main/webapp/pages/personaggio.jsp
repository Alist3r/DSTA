
<%@page import="DSTAProject.utils.DSTAUtils"%>
<%@page import="DSTAProject.model.Characters"%>

<%
Characters character = (Characters) session.getAttribute("character");

Integer maxHP    = character.getMaxHP();
Integer currHP   = character.getCurrHP();
Integer level  	 = character.getLevel();
Integer souls    = character.getSouls();

Integer attacco  = character.getAttacco();
Integer difesa   = character.getDifesa();
Integer velocita = character.getVelocita();
Integer armatura = character.getArmatura();

double percHpPersi = DSTAUtils.percHpPersa(maxHP, currHP);


%>

<html>

	<body>
		
		<div id="divHPMain" style="font-size: 17px; margin-bottom: 15px;">
			<table>
				<tr>
					<td> HP </td>
					<td style="text-align: center; width: 100%;">
						<div style="border: 1px solid black; width: 100%; height: 2px;">
							<div style="background-color: black; width: <%= 100 - percHpPersi %>%; height: 100%"></div>
						</div> 
					</td>
					<td> <%= currHP %>/<%= maxHP %> </td>
				</tr>
			</table>	
		</div>  
		
		<div id="divInfoMain" style="font-size: 14px; margin-bottom: 15px;">
			<table class="tablePersonaggio">
				<tr>
					<td class="tdInfoHeader"> Livello </td>
					<td class="tdInfoHeader"> Anime </td>
					<td class="tdInfoHeader"> Per level Up</td>
					<td rowspan="2" style="vertical-align: middle; text-align: right;">
						<button class="customButton" style="width: 120px">Fiaschette Estus - 1</button>
					</td>
				</tr>
				<tr>
					<td class="tdInfoDati"> <%= level %> </td>
					<td class="tdInfoDati"> <%= souls %> </td>
					<td class="tdInfoDati"> 87 </td>					
				</tr>
				
			</table>	
		</div> 
		
		<div id="divEquipmentMain" style="font-size: 14px; margin-bottom: 15px;">
			<table class="tablePersonaggio">
				<tr>
					<td class="tdEquipHeader" style="width: 40%"> Statistiche </td>
					<td class="tdEquipHeader"> Equipaggiamento</td>
				</tr>
				<tr>	
					<td>
						<table class="innerTablePersonaggio">
							<tr>	
								<td> ATTACCO </td>
								<td> <%= attacco %> </td>
							</tr>
							<tr>	
								<td> DIFESA </td>
								<td> <%= difesa %> </td>
							</tr>
							<tr>	
								<td> VELOCITA' </td>
								<td> <%= velocita %> </td>
							</tr>
							<tr>	
								<td> ARMATURA </td>
								<td> <%= armatura %> </td>
							</tr>
						</table> 
					</td>
					
					<td> 
					<table class="innerTablePersonaggio">
							<tr>	
								<td> ARMA PRIMARIA: </td>
								<td> Spada Lunga </td>
							</tr>
							<tr>	
								<td> ARMA SECONDARIA: </td>
								<td> Scudo Tondo </td>
							</tr>
							<tr>	
								<td> TIPO ARMATURA: </td>
								<td> Cotta Militare </td>
							</tr>
							<tr>	
								<td> ANELLO: </td>
								<td> Anello del Falco </td>
							</tr>
						</table> 
					</td>
				</tr>
			</table>	
		</div>
		
		<div id="divInventoryMain" style="border: 1px  black; font-size: 16px;">
			<table class="tablePersonaggio">
				<tr>	
					<td colspan="4" style="color: white; background-color: black; text-align: center"> Inventario </td>
				</tr>
				<% 
				for(int i=0; i<20; i++) {
				%>
				<tr>
					<td style="width: 80%; border-bottom: 1px dotted black; font-size: 15px;"> Spada Corta </td>
					<td class="tdInvetDati"> <button class="customButton" style="font-size: 14px; padding: 0px; width: 60px">Equip.</button></td>
					<td class="tdInvetDati"> <button class="customButton" style="font-size: 14px; padding: 0px; width: 40px">Usa</button></td>
					<td class="tdInvetDati"> <button class="customButton" style="font-size: 14px; padding: 0px; width: 60px">Elimina</button> </td>
					 
				</tr>
				<%
				}
				%>
			</table>	
		</div>
		
	</body>
</html>