package com.library.springbootlibrary.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.Data;

@Entity
@Table(name="review")
@Data
@CrossOrigin(origins = "http://localhost:3000")
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Long id;
	
	@Column(name="user_email")
	public String userEmail;
	
	@Column(name="date")
	@CreationTimestamp
	public Date date;
	
	@Column(name="rating")
	public double rating;
	
	@Column(name="book_id")
	public Long bookId;
	
	@Column(name="review_description")
	public String reviewDescription;
	
	

}
