package DSTAProject.model;

public class Progresses implements java.io.Serializable {

	private static final long serialVersionUID = 1268599965766983292L;

	int idProgresses = 0;
	int idUsers = 0;
	int idStoryPoint = 0;
	String page = "";
	
	public Progresses() {
		
	}

	public int getIdProgresses() {
		return idProgresses;
	}

	public void setIdProgresses(int idProgresses) {
		this.idProgresses = idProgresses;
	}

	public int getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(int idUsers) {
		this.idUsers = idUsers;
	}

	public int getIdStoryPoint() {
		return idStoryPoint;
	}

	public void setIdStoryPoint(int idStoryPoint) {
		this.idStoryPoint = idStoryPoint;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProgresses;
		result = prime * result + idStoryPoint;
		result = prime * result + idUsers;
		result = prime * result + ((page == null) ? 0 : page.hashCode());
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
		Progresses other = (Progresses) obj;
		if (idProgresses != other.idProgresses)
			return false;
		if (idStoryPoint != other.idStoryPoint)
			return false;
		if (idUsers != other.idUsers)
			return false;
		if (page == null) {
			if (other.page != null)
				return false;
		} else if (!page.equals(other.page))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Progresses [idProgresses=" + idProgresses + ", idUsers="
				+ idUsers + ", idStoryPoint=" + idStoryPoint + ", page=" + page
				+ "]";
	}
	
	
}
