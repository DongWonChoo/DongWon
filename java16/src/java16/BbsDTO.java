package java16;

public class BbsDTO {
	private String id;
	private String title;
	private String content;
	private String etc;
	public BbsDTO() {
		
	}
	
	public BbsDTO(String id, String title, String content, String etc) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.etc = etc;
	}
	
	//alt + shift + S + R : setters/getters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	
	@Override
	public String toString() {
		return "BbsDTO [id=" + id + ", title=" + title + ", content=" + content + ", etc=" + etc + "]";
	}	
}
