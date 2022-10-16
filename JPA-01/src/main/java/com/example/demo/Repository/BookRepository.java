package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.D1.Book_Store;
@Repository

public interface BookRepository extends JpaRepository<Book_Store, Integer >{
	
	
	@Query("from Book_Store where bookid=?1")
	public Book_Store findBybookid(Integer id);
	
	@Query("from Book_Store")
	public List<Book_Store> getAllBook(String name );
	
	@Query("from Book_Store")
	public Book_Store findBybookname(String name);
	
	@Query("from Book_Store where edition=?1")
	public Book_Store findByedition(Integer edition);
	
	@Query("from Book_Store")
	public List<Book_Store> getAllBooks(String name);
	
	@Query("from Book_Store")
	public Book_Store findByprice(Integer price);
	
	@Query("from Book_Store where bookname=?1")
	public Book_Store deleteByname(String name);
	
	@Query("from Book_Store where bookname =?1")
	public void updateByname(String name,Integer id);
	
	
	
	
	
	

}
