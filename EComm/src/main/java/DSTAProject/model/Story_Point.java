package DSTAProject.model;

public class Story_Point implements java.io.Serializable {

	private static final long serialVersionUID = -7890943283782418330L;

	private Integer idStoryPoint = 0;
	private String path = null;
	
	public Story_Point() {
		
	}

	public Integer getIdStoryPoint() {
		return idStoryPoint;
	}

	public void setIdStoryPoint(Integer idStoryPoint) {
		this.idStoryPoint = idStoryPoint;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}


}
