package view;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import java.io.Serializable;
import java.util.List;


import javax.inject.Named;

import controller.PostController;
import view.AuthMb;
import model.Post;

@Named
@ViewScoped
public class PostMb implements Serializable{
	private static final long serialVersionUID = 1L;

	@Inject
	private PostController postCntr;
	@Inject
	private AuthMb auth;
	
	private String content;
	private String username;
	
	public void create(){
		username = "mica";/*auth.getUsername();*/
		Post posts = new Post(content,username);
		postCntr.create(posts);
	}
	
	public PostController getPostCntr() {
		return postCntr;
	}

	public void setPostCntr(PostController postCntr) {
		this.postCntr = postCntr;
	}

	public AuthMb getAuth() {
		return auth;
	}

	public void setAuth(AuthMb auth) {
		this.auth = auth;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<Post> allPost(){
		return postCntr.allPost();
	}

}
