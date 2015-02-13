package DSTAProject.model;

public class Users implements java.io.Serializable {

	private static final long serialVersionUID = -7251652590769319883L;

	private Integer idUsers = 0;
	private String email = null;
	private String psw = null;

	public Users() {
	}

	public Users(String email,String psw) {
		this.psw = psw;
		this.email = email;
	}

	public Integer getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(Integer idUsers) {
		this.idUsers = idUsers;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((idUsers == null) ? 0 : idUsers.hashCode());
		result = prime * result + ((psw == null) ? 0 : psw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idUsers == null) {
			if (other.idUsers != null)
				return false;
		} else if (!idUsers.equals(other.idUsers))
			return false;
		if (psw == null) {
			if (other.psw != null)
				return false;
		} else if (!psw.equals(other.psw))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Users [idUtente=%s, email=%s, psw=%s]", idUsers,
				email, psw);
	}

	
}
