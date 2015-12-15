package DSTAProject.servlet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import DSTAProject.bo.UsersBo;
import DSTAProject.model.Users;
import DSTAProject.utils.DSTAConstants;


@Controller
@SessionAttributes({ DSTAConstants.SESSION_USER, DSTAConstants.SESSION_CHAR})
public class UsersController {
	
	@Autowired
	UsersBo usersBo;
	
	
	
	//PROCEDURA DI LOGIN
	@RequestMapping(value = "doLogin", method = RequestMethod.POST)
	public ModelAndView login(
			@RequestParam(DSTAConstants.PARAM_USERNAME) String username,
			@RequestParam(DSTAConstants.PARAM_PSW) String psw, 
			Model model) {

		try {
			
			//CERCO L'UTENTE NEL DATABASE
			Users user = usersBo.checkLogin(username, psw);
			
			//SE TROVO L'UTENTE
			if (user != null) {
							
				    
					//model.addAttribute("page", pageName);
					
					model.addAttribute("msg","OK");
					return new ModelAndView("login");

			} 
			//SE NON TROVO NESSUN UTENTE RESTITUISCO MESSAGGIO DI ERRORE
			else {
				model.addAttribute("msg","Utente non Trovato o Password Errata.");
				return new ModelAndView("login");
			}
		} 
		catch (Exception e) {
			model.addAttribute("msg", e.getMessage());
			System.out.println("Eccezione: " + e.getMessage());
			return new ModelAndView("login");
		}
		
	}
	
	
}


