package DSTAProject.model;

public class Story_Point implements java.io.Serializable {

	private static final long serialVersionUID = -7890943283782418330L;

	private int idStoryPoint = 0;
	private String path = null;
	
	public Story_Point() {
		
	}

	public int getIdStoryPoint() {
		return idStoryPoint;
	}

	public void setIdStoryPoint(int idStoryPoint) {
		this.idStoryPoint = idStoryPoint;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idStoryPoint;
		result = prime * result + ((path == null) ? 0 : path.hashCode());
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
		Story_Point other = (Story_Point) obj;
		if (idStoryPoint != other.idStoryPoint)
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Story_Point [idStoryPoint=" + idStoryPoint + ", path=" + path
				+ "]";
	}

	
	
}
