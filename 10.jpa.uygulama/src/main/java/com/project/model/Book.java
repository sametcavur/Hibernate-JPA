package com.project.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Book{
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY) //ID deðeri otomatik artacak dedik
	private int bookId;
	private String name;
	private int pageCount;
	private String topic;
	@Embedded  //Assocation iliþkisi olan bir pojoyuda dahil edip o pojonun deðiþkenleriylede sql de column açma özelliði
	@AttributeOverrides({  //embedded pojonun içerisindeki deðiþken isimlerinden farklý isimlerde column açma özelliði
		@AttributeOverride(name = "authorName" ,column = @Column(name ="yazarAdi",length = 25 ))  ,
		@AttributeOverride(name = "authorSurname" ,column = @Column(name ="yazarSoyadi",length = 25 ))
		//yalnýzca bir tane column deðiþtiriceksek eðer atrtributeOverrides içine almaya gerek yok,üstteki anotasyonu tek yazsak yeterli olur.
	}) 
	private Author author;
	
	@Temporal(TemporalType.TIMESTAMP)//Zaman anotasyonu,main classta manuel olarak Calendar açarakta verebiliriz.Direk new Date(); yazarakta verebiliriz.
	private Date publisherDate;
	
	
	public Book() {
		
	}
	public Book( String name, int pageCount, String topic, Author author, Date publisherDate) {
		this.name = name;
		this.pageCount = pageCount;
		this.topic = topic;
		this.author = author;
		this.publisherDate = publisherDate;
	}

	public int getBookId() {
		return bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Author getAuthorName() {
		return author;
	}

	public void setAuthorName(Author author) {
		this.author = author;
	}

	public Date getPublisherDate() {
		return publisherDate;
	}

	public void setPublisherDate(Date publisherDate) {
		this.publisherDate = publisherDate;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", pageCount=" + pageCount + ", topic=" + topic
				+ ", author=" + author + ", publisherDate=" + publisherDate + "]";
	}
	
}
