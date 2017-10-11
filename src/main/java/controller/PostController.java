package controller;

import javax.ejb.Stateless;
import javax.inject.Inject;

import db.DataBase;
import model.Post;
//import model.User;

@Stateless
public class PostController {
	
	@Inject
	private DataBase db;
	
	public void create(Post post){
		post.setId(db.nextPostId());
		db.posts.add(post);
	}
	
	public Post all(){
		for(Post post : db.posts){
			return post;
		}
		return null;
	}
	
}
