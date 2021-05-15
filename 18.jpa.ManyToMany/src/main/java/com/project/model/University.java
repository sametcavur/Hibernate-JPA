package com.project.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class University {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uniId;
	
	private String Uniname;
	
	private String uniBolum;
	
	@ManyToMany(mappedBy = "universities" ,cascade = CascadeType.PERSIST)
	private List<Student> students = new ArrayList<Student>();
	
	public University() {
		// TODO Auto-generated constructor stub
	}

	public University(String uniname, String uniBolum) {
		Uniname = uniname;
		this.uniBolum = uniBolum;
	}

	public int getUniId() {
		return uniId;
	}

	public void setUniId(int uniId) {
		this.uniId = uniId;
	}

	public String getUniname() {
		return Uniname;
	}

	public void setUniname(String uniname) {
		Uniname = uniname;
	}

	public String getUniBolum() {
		return uniBolum;
	}

	public void setUniBolum(String uniBolum) {
		this.uniBolum = uniBolum;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "University [uniId=" + uniId + ", Uniname=" + Uniname + ", uniBolum=" + uniBolum + ", students="
				+ students + "]";
	}
	
	
	
	
	

}
