package modelli;

public class Utente {
	private String email = null;
	private String password = null;
	private String nome = null;
	private int livello; 
	private String pagina = null;
	
	public Utente() {
		
	}

	public Utente (String email, String password) {
		this.email = email;
		this.password = password;
		this.livello = 1;
		this.pagina = "start.jsp";
	}
	
	public Utente (String email, String password, String nome, int livello, String pagina) {
		this.email = email;
		this.password = password;
		this.nome = nome;
		this.livello = livello;		
		this.pagina = pagina;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	
}
