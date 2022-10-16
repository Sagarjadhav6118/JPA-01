package com.example.demo.Service;

import java.util.List;

import com.example.demo.D1.Book_Store;

public interface IstoreService {

	public Book_Store findBybookid(Integer id);

	public List<Book_Store> findAllBook(String name);

	public Book_Store findBybookname(String name);

	public void DeleteByname(String name);           //this method does not give any retuen value

	public Book_Store findBybookedition(Integer edition);

	public Book_Store findBybookprice(Integer price);
	
	public void saveBook(Book_Store boook);
	
	public void updateByname(String name, Integer id);

}
