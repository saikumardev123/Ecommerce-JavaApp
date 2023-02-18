package com.ecommerce.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.User;
import com.ecommerce.util.Response;

/*
 *  
 *   This DAO contains the methods w.r.t User functionality
 * 
 * 
 */

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	  @Override
	  public Response register(User user) {
		  Response response = new Response();
		 Session session = entityManager.unwrap(Session.class);
		  int i=  (int) session.save(user);
		   if(i != 0) {
			    response.setMessage("user registered successfully");
			    response.setOperation(true);
			    response.setStatusCode(200);
			    return response;
		   }
		   else {
			   response.setMessage("user registeration failed");
			    response.setOperation(false);
			    response.setStatusCode(500);
			    return response;
		   }
	}

}
