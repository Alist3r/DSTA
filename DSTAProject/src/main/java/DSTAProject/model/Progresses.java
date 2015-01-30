package DSTAProject.model;

public class Progresses implements java.io.Serializable {

	private static final long serialVersionUID = 1268599965766983292L;

	Integer idProgresses = 0;
	Integer idUsers = 0;
	Integer idStoryPoint = 0;
	String page = "";
	
	public Progresses() {
		
	}

	public Integer getIdProgresses() {
		return idProgresses;
	}

	public void setIdProgresses(Integer idProgresses) {
		this.idProgresses = idProgresses;
	}

	public Integer getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(Integer idUsers) {
		this.idUsers = idUsers;
	}

	public Integer getIdStoryPoint() {
		return idStoryPoint;
	}

	public void setIdStoryPoint(Integer idStoryPoint) {
		this.idStoryPoint = idStoryPoint;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
	
}
