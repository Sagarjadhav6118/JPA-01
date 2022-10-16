package com.example.demo.D1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book_Store")
public class Book_Store {
	@Column
	String bookname;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	Integer bookid;
	@Column
	Integer price;
	@Column
	Integer edition;

	public Book_Store() {

	}

	public Book_Store(String bookname, Integer price, Integer edition) {
		super();
		this.bookname = bookname;
		this.price = price;
		this.edition = edition;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getEdition() {
		return edition;
	}

	public void setEdition(Integer edition) {
		this.edition = edition;
	}

}
