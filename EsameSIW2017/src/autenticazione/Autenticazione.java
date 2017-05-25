package autenticazione;

import model.Utente;

public interface Autenticazione {
	
	public Utente login(String username, String password);

}
