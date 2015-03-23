package com.vaannila.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tweet1")
public class Tweet {

	private Long tweet_id;
	private Long user_id;
	private String message;
	private String username;
	private String created;
	
	@Id
	@GeneratedValue
	@Column(name="Tweet_Id")
	public Long getTweet_id() {
		return tweet_id;
	}
	public void setTweet_id(Long tweet_id) {
		this.tweet_id = tweet_id;
	}
	
	@GeneratedValue
	@Column(name="created")
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	
	@Column(name="message")
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@GeneratedValue
	@Column(name="User_Id")
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	
	@Column(name="username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
