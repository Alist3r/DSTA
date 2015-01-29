package DSTAProject.servlet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import DSTAProject.bo.CharactersBo;
import DSTAProject.bo.UsersBo;
import DSTAProject.model.Characters;
import DSTAProject.model.Users;
import DSTAProject.utils.DSTAConstants;


@Controller
@SessionAttributes({ DSTAConstants.SESSION_USER,"character"})
public class UsersController {
	
	@Autowired
	UsersBo usersBo;
	
	@Autowired
	CharactersBo charactersBo;
	
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public ModelAndView login(
			@RequestParam(DSTAConstants.PARAM_EMAIL) String email,
			@RequestParam(DSTAConstants.PARAM_PSW) String psw, 
			Model model) {

		try {
			Users user = usersBo.checkLogin(email, psw);
			
			System.out.println("Entrato Login");
			
			if (user != null) {
			
					// aggiunge l'attributo in request.
					model.addAttribute(DSTAConstants.SESSION_USER, user);
					model.addAttribute("msg", "Utente Trovato");
					
					Characters character = charactersBo.getByEmail(user.getEmail());
					
					if(character == null) {
						character = new Characters();
						character.setName("Alist3r");
						character.setIdUsers(user.getIdUsers());
					}
					
					model.addAttribute("character", character);

					return new ModelAndView("mainPage");

			} 
			else {
				model.addAttribute("msg","Utente non Trovato o Password Errata.");
				System.out.println("Utente non Trovato o password errata.rore");
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
