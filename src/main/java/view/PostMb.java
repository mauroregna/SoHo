package view;

import javax.inject.Inject;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import controller.PostController;
import view.AuthMb;
import model.Post;

@Named
@SessionScoped
public class PostMb implements Serializable{
	private static final long serialVersionUID = 1L;

	@Inject
	private PostController postCntr;
	private AuthMb auth;
	
	private String content;
	
	public String create(){
		Post posts = new Post(content,auth.getUsername());
		postCntr.create(posts);
		return "home";
	}
	
	public List<Post> allPost(){
		return null;
		
	}

}
