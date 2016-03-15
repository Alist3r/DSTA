package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseServlet extends HttpServlet{

	private static final long serialVersionUID = 7907017660289372149L;

	public BaseServlet() {
	        super();
	    }
	
	public abstract void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
}


