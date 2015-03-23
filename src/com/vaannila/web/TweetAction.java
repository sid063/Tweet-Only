package com.vaannila.web;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vaannila.dao.TweetDAO;
import com.vaannila.dao.TweetDAOImpl;
import com.vaannila.domain.Tweet;

public class TweetAction extends ActionSupport implements ModelDriven<Tweet> {

	private static final long serialVersionUID = -6659925652584240539L;

	private Tweet tweet = new Tweet();
	private List<Tweet> tweetList = new ArrayList<Tweet>();
	private TweetDAO tweetDAO = new TweetDAOImpl();
	
	@Override
	public Tweet getModel() {
		return tweet;
	}
	
	public String add()
	{
		tweetDAO.saveTweet(tweet);
		return SUCCESS;
	}
	
	public String list()
	{
		tweetList = tweetDAO.listTweet();
		return SUCCESS;
	}
		
	public Tweet getTweet() {
		return tweet;
	}

	public void setTweet(Tweet tweet) {
		this.tweet = tweet;
	}

	public List<Tweet> getTweetList() {
		return tweetList;
	}

	public void setTweetList(List<Tweet> tweetList) {
		this.tweetList = tweetList;
	}

}
