package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.D1.Book_Store;
import com.example.demo.Repository.BookRepository;

@Service
public class BookStoreImpl implements IstoreService {

	@Autowired
	BookRepository repository;

	public BookStoreImpl(BookRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Book_Store findBybookid(Integer id) {
		Book_Store book = repository.findBybookid(id);
		return book;
	}

	@Override
	public List<Book_Store> findAllBook(String name) {
		List<Book_Store> list = repository.findAll();
		return list;
	}

	@Override
	public Book_Store findBybookname(String name) {
		Book_Store name2 = repository.findBybookname(name);

		return name2;
	}

	@Override
	public void DeleteByname(String name) {
		Book_Store deleteByname = repository.deleteByname(name);

	}

	@Override
	public Book_Store findBybookedition(Integer edition) {
		Book_Store byedition = repository.findByedition(edition);

		return byedition;
	}

	@Override
	public Book_Store findBybookprice(Integer price) {

		Book_Store byprice = repository.findByprice(price);

		return byprice;
	}

	@Override
	public void saveBook(Book_Store boook) {
		repository.save(boook);
	}

	@Override
	public void updateByname(String name, Integer bookid) {
		Book_Store book = repository.findBybookid(bookid);
		book.setBookname(name);
		repository.save(book);
	}

}
