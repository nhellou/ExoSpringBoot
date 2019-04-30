package com.exemple.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface InterfaceCrud<T> extends JpaRepository<T, Long> {


}
