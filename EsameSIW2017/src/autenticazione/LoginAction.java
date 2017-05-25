package autenticazione;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.Utente;

public class LoginAction {
	
	public LoginAction(){}

	public String esegui(HttpServletRequest request)
			  throws ServletException  {
				FacadeAutenticazione authService = new FacadeAutenticazioneImpl();
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				Utente utente = authService.login(username, password);
				if (utente!=null) {
					HttpSession session = request.getSession();
					session.setAttribute("utente",utente);
					return "OK";
				} else
					return "KO";
			}

}
