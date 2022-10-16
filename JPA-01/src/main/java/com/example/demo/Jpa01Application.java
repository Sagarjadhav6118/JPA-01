package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.D1.Book_Store;
import com.example.demo.Service.BookStoreImpl;

@SpringBootApplication
public class Jpa01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Jpa01Application.class, args);
		 BookStoreImpl bean = context.getBean(BookStoreImpl.class);
	
	Book_Store bs = new Book_Store("One indian Girl",350,10);
	Book_Store bs1 = new Book_Store("Half girlfriend",200,1);
	Book_Store bs2 = new Book_Store("mahabhrata",100,2);
	
	
//	bean.saveBook(bs1);
//	bean.saveBook(bs2);
  //  bean.saveBook(bs);
	
//	Book_Store book = bean.findBybookedition(1);
//	book.setBookname("Shyamchi AAi");
//	bean.saveBook(book);
//	
	//bean.updateByname("Ramayan", 8);
	
	bean.DeleteByname("One indian Girl");
	
	
	
	
	
	}

}
