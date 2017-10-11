package db;


import java.util.ArrayList;
import java.util.List;

import model.User;
import model.Post;
import javax.inject.Singleton;



@Singleton
public class DataBase {

	public List<User> users = new ArrayList<>();
	public List<Post> posts = new ArrayList<>();
	
	public DataBase() {
		User user = new User("mica","mica");
		user.setId(nextUserId());
		users.add(user);
		
		Post post = new Post("Mica te amo", "mica");
		post.setId(nextPostId());
		posts.add(post);
	}
	
	public int nextUserId(){
		return users.size();
	}
	
	public int nextPostId(){
		return posts.size();
	}
	
	public List<Post> getAllPost(){
		return posts;
	}
}


/*
 
 USer controller: es un EJB (Stateless, comt iene logica no guarda ningun dato, no guarda estados)
 	@Inject de la base da dtos, el controller solo habla con DB u otros controllers // aca obtento la base de datos (que es singleton, por eso puedo 
 	ahacer asi)
 	
 	
 
 */
