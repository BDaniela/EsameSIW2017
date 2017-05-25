package autenticazione;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Autentica extends HttpServlet{

	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

String prossimaPagina = "/fallimento.jsp";
ServletContext application  = getServletContext();
RequestDispatcher rd = application.getRequestDispatcher(prossimaPagina);
rd.forward(request, response);
}


public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
String prossimaPagina = "/fallimento.jsp";
LoginAction login = new LoginAction();
String esito = login.esegui(request);
if (esito.equals("OK"))
prossimaPagina = "/risorsaProtetta.jsp";
ServletContext application  = getServletContext();
RequestDispatcher rd = application.getRequestDispatcher(prossimaPagina);
rd.forward(request, response);
}




}
