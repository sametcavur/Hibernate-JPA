package com.project.model;

import javax.persistence.Embeddable;

@Embeddable  // Book pojosuna gömdük
public class Author {
	private String authorName;
	private String authorSurname;
	private String authorAge;
	public Author() {
	}
	
	public Author(String authorName, String authorSurname, String authorAge) {
		this.authorName = authorName;
		this.authorSurname = authorSurname;
		this.authorAge = authorAge;
	}

	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorSurname() {
		return authorSurname;
	}
	public void setAuthorSurname(String authorSurname) {
		this.authorSurname = authorSurname;
	}
	public String getAuthorAge() {
		return authorAge;
	}
	public void setAuthorAge(String authorAge) {
		this.authorAge = authorAge;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", authorSurname=" + authorSurname + ", authorAge=" + authorAge
				+ "]";
	}
	
	

}
