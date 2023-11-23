package com.example;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class UserDAO {
	private HibernateTemplate temp;

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	
	//insert
	public int insert(User u) {
		return (int) temp.save(u);
	}
	
	 // update
    public void update(User u) {
        temp.update(u);
    }

    // retrieve by ID
    public User getUserById(int userId) {
        return temp.get(User.class, userId);
    }
	
//retrieve 
	public List<User> getal(){
		return (List<User>) temp.find("from User");
	}

	

}
