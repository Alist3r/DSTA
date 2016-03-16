package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.Costanti;
import modelli.Utente;
import dao.UtenteDao;

@WebServlet("/pages/Login")
public class LoginServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
				    	
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UtenteDao utenteDao = new UtenteDao();		
		boolean verificato = utenteDao.checkLogin(email, password);
			   
		if(verificato) {
			Utente utente = utenteDao.getUtenteDaEmail(email);
			request.getSession().setAttribute(Costanti.SESSION_UTENTE, utente);
			String pagina = utente.getPagina();
			response.sendRedirect(pagina);	 
		}
		else {
			response.sendRedirect("index.jsp");	    
		}				
	} 
}
