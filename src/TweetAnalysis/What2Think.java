package TweetAnalysis;

import java.util.ArrayList;

public class What2Think {

	public static void main(String[] args) {
		String topic = "Bird Scooter";
		ArrayList<String> tweets = TweetManager.getTweets(topic);
		NLP.init();
		for(String tweet : tweets) {
			System.out.println(tweet + " : " + NLP.findSentiment(tweet));
		}
	}
}
