package com.vaannila.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.vaannila.domain.Tweet;

public class TweetDAOImpl implements TweetDAO {

	@SessionTarget
	Session session;
	@TransactionTarget
	Transaction transaction;

	@SuppressWarnings("unchecked")
	@Override
	public List<Tweet> listTweet() {	
		List<Tweet> courses = null;
		try {
			courses = session.createQuery("from Tweet").list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return courses;
	}

	@Override
	public void saveTweet(Tweet tweet) {
		try {
			session.save(tweet);
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} 
	}

}
