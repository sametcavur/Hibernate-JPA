package com.project.repository;

import com.project.model.User;

public interface IUserRepository {
	
	public User findById(int userId);
	public void findByUsername(String username);
	public void findUser();
	public void findUserCount();
	public void findAdvertisementByUsername(String username);

}
