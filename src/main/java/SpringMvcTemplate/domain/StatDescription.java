package SpringMvcTemplate.domain;

public class StatDescription {
	private String name;
	private String url;
	
	
	public StatDescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StatDescription(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
