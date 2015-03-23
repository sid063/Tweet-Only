package com.vaannila.dao;

import java.util.List;
import com.vaannila.domain.Tweet;

public interface TweetDAO {

	public void saveTweet(Tweet tweet);
	public List<Tweet> listTweet();
}
