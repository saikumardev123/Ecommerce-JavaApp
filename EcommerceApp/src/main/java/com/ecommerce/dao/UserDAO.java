package com.ecommerce.dao;

import com.ecommerce.model.User;
import com.ecommerce.util.Response;

/*
 *  
 *   This DAO contains the methods w.r.t User functionality
 * 
 * 
 */

public interface UserDAO {
	
	  public Response register(User user);

}
