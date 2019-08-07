package com.rest.services.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rest.services.model.dto.UserDto;

public interface UserService extends UserDetailsService {

	public UserDto createUser(UserDto userDto);
	public UserDto getUser(String email);
	public UserDto getUserByUserId(String id);
	
	public UserDto updateUser(String userId, UserDto user);
	public void deleteUser(String userId);
	public List<UserDto> getUsers(int page, int limit);

}
