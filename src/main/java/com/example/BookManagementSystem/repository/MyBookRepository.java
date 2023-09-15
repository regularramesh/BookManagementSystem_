package com.example.BookManagementSystem.repository;

import com.example.BookManagementSystem.model.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,Integer>{

}
