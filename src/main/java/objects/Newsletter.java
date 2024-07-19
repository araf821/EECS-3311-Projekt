package objects;

import java.util.ArrayList;
import java.util.List;

public class Newsletter {
	private LetterPublisher name;
	private double cost;

	public Newsletter(LetterPublisher name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public LetterPublisher getName() {
		return name;
	}

	public void setName(LetterPublisher name) {
		this.name = name;
	}

	public void accept(User user) {
		user.visit(this);
	}

	public void displayNews() {
		// implementation
	}

	public String getUrl() {
		if (this.name == LetterPublisher.NYTIMES) {
			return "https://www.nytimes.com/";
		}
		else if (this.name == LetterPublisher.WASHINGTONPOST) {
			return "https://www.washingtonpost.com/";
		}
		else{
			return "https://www.usatoday.com/";
		}
	}

	public void subscribe(User user) {
		userHandling.SubscriptionHandling.writeSubscription(new Subscription(user, this));
	}

	public void unsubscribe(User user) {
		userHandling.SubscriptionHandling.cancelSubscription(user.getId(), this.getName());
	}

	public boolean isSubscribed(User user) {
		return userHandling.SubscriptionHandling.isSubscribed(user, this);
	}

	public static enum LetterPublisher {
		NYTIMES, WASHINGTONPOST, USATODAY
	}

}
