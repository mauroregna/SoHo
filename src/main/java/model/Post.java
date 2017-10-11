package model;

public class Post {
	
	private int id;
	private String content;
	private String username;
	
	public Post(String content, String username){
		super();
		this.content = content;
		this.username = username;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUser() {
		return username;
	}
	public void setUser(String user) {
		this.username = user;
	}
	

}
