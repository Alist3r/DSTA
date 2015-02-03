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
import DSTAProject.bo.PagesBo;
import DSTAProject.bo.ProgressesBo;
import DSTAProject.bo.StoryPointBo;
import DSTAProject.bo.UsersBo;
import DSTAProject.model.Characters;
import DSTAProject.model.Pages;
import DSTAProject.model.Progresses;
import DSTAProject.model.Story_Point;
import DSTAProject.model.Users;
import DSTAProject.utils.DSTAConstants;


@Controller
@SessionAttributes({ DSTAConstants.SESSION_USER, DSTAConstants.SESSION_CHAR})
public class UsersController {
	
	@Autowired
	UsersBo usersBo;
	
	@Autowired
	CharactersBo charactersBo;
	
	@Autowired
	StoryPointBo storyPointBo;
	
	@Autowired
	ProgressesBo progressesBo;
	
	@Autowired
	PagesBo pagesBo;
	
	//PROCEDURA DI LOGIN
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public ModelAndView login(
			@RequestParam(DSTAConstants.PARAM_EMAIL) String email,
			@RequestParam(DSTAConstants.PARAM_PSW) String psw, 
			Model model) {

		try {
			
			//CERCO L'UTENTE NEL DATABASE
			Users user = usersBo.checkLogin(email, psw);
			
			//SE TROVO L'UTENTE
			if (user != null) {
							
				    //CERCO UN PERSONAGGIO ASSOCIATO ALL'UTENTE
					Characters character = charactersBo.getByEmail(user.getEmail());
					
					//SE NON TROVO NESSUN PERSONAGGIO NE CREO UNO NUOVO E LO SALVO NEL DATABASE
					if(character == null) {
						
						character = new Characters();
						character.setName("Unknown");
						
						
						Progresses progress = new Progresses();
						progress.setIdStoryPoint(1);
						progress.setIdUsers(user.getIdUsers());
						progress.setIdPages(1);
						progressesBo.save(progress);
					}

					
					Progresses progress = progressesBo.getByUserId(user.getIdUsers());					
					Story_Point storyPoint = storyPointBo.getById(progress.getIdStoryPoint());		
					Pages page = pagesBo.getById(progress.getIdPages());
					String pageName = storyPoint.getPath() + page.getPageName();

					
					//SALVO NELLA SESSIONE L'UTENTE IL PERSONAGGIO
					model.addAttribute(DSTAConstants.SESSION_CHAR, character);
					model.addAttribute(DSTAConstants.SESSION_USER, user);
					model.addAttribute("page", pageName);

					return new ModelAndView("mainPage");

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
