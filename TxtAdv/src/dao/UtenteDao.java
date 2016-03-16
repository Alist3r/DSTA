package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import modelli.Utente;

import com.mysql.jdbc.Statement;

import utils.DbConnection;

public class UtenteDao {
	
	DbConnection connessioneDb = null;
	
	public UtenteDao() {
		this.connessioneDb = new DbConnection();
	}
	
	public boolean checkLogin(String email, String password) {
		
		String query = "SELECT * FROM utente WHERE email = '" + email + "' and password = '" + password + "'";
		
		Statement st;
		try {
			st = (Statement) connessioneDb.getConnessione().createStatement();
			ResultSet rs = st.executeQuery(query);			
			while (rs.next()) {				
				return true;
			}
		} 
		catch (SQLException e) {		
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void setNomeUtente(String nome, String email) {
		
		String query = "UPDATE utente SET nome = '" + nome + "' WHERE email = '" + email + "'";
		
		Statement st;
		try {
			st = (Statement) connessioneDb.getConnessione().createStatement();
			st.executeUpdate(query);
			st.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}		
	}
	
	public Utente getUtenteDaEmail(String email) {
		
		String query = "SELECT email as email, password as password, nome as nome, livello as livello, pagina as pagina FROM utente, avanzamento WHERE email = '" + email + "' and utente.idAvanzamento = avanzamento.idAvanzamento ";
		
		Statement st;
		Utente utente = null;
		try {
			st = (Statement) connessioneDb.getConnessione().createStatement();
			ResultSet rs = st.executeQuery(query);	
			
			while (rs.next()) {		
				utente = new Utente();
				
				utente.setEmail(rs.getString("email"));
				utente.setPassword(rs.getString("password"));
				utente.setNome(rs.getString("nome"));
				utente.setLivello(rs.getInt("livello"));
				utente.setPagina(rs.getString("pagina"));
				
				return utente;
			}
		} 
		catch (SQLException e) {		
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void setPagina(int idPagina, String email) {
		String query = "UPDATE utente SET idAvanzamento = " + idPagina + " WHERE email = '" + email + "'";
		
		Statement st;
		try {
			st = (Statement) connessioneDb.getConnessione().createStatement();
			st.executeUpdate(query);
			st.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}		
	}
	
}
