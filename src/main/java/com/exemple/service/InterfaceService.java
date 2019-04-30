package com.exemple.service;

import java.util.List;

public interface InterfaceService<T>{
	
	public T findOneById(Long id);
	public T save(T p);
	void delete(T p);
	List<T> getAll();

}
