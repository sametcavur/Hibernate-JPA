package com.project.main;

import java.util.Calendar;
import java.util.Date;

import com.project.model.Author;
import com.project.model.Book;
import com.project.repository.BookRepository;
import com.project.repositoryImp.BookRepositoryImp;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 //Save-Persist// 
		 Date harryPotterDate = createDate(27, 8, 1997); 
		 Author author = new Author("J.K.","Rowling","53");
		 Book book =new Book("HarryPotter",500,"BilimKurgu",author,harryPotterDate);
		 BookRepository saveBook = new BookRepositoryImp(); 
		 saveBook.save(book);
//		  
//		 //Find//
//		 BookRepository findBook = new BookRepositoryImp(); 
//		 Book bo =findBook.find(3);
//		 System.out.println(bo);
//		  
//		 //Update//
//		 BookRepository updateBook = new BookRepositoryImp(); 
//		 Book b = updateBook.find(3); 
//		 b.setName("Yüd"); 
//		 updateBook.update(b);
//		  
//		 //Delete// 
//		 BookRepository deleteBook = new BookRepositoryImp(); 
//		 Book dbook =deleteBook.find(3); 
//		 deleteBook.delete(dbook);

	}
	public static Date createDate(int day, int month, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.YEAR, year);
		return calendar.getTime();

	}
}
