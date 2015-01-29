package DSTAProject.servlet;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class PersonaggioServlet extends AbstractController {
	

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Map<String, Object> myModel = new HashMap<String, Object>();
		
		myModel.put("stringa", "Ciao");
		
		return new ModelAndView("personaggio", "model", myModel);
				
	}

	
}