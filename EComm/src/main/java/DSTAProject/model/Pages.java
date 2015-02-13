package DSTAProject.model;

public class Pages implements java.io.Serializable {

	private static final long serialVersionUID = 3391603021700500062L;

	private Integer idPages = 0;
	private Integer idStoryPoint = 0;
	private String pageName = "";
	
	public Pages() {
		
	}

	public Integer getIdPages() {
		return idPages;
	}

	public void setIdPages(Integer idPages) {
		this.idPages = idPages;
	}

	public Integer getIdStoryPoint() {
		return idStoryPoint;
	}

	public void setIdStoryPoint(Integer idStoryPoint) {
		this.idStoryPoint = idStoryPoint;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

}
