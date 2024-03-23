package objects;

import java.util.ArrayList;
import java.util.List;

public class Newsletter {
	private LetterPublisher name;
	private double cost;
	private ArrayList<User> subscribers;

	public Newsletter(LetterPublisher name, double cost) {
		this.name = name;
		this.cost = cost;
		this.subscribers = new ArrayList<>();
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

	public ArrayList<User> getSubscribers() {
		return subscribers;
	}

	public void subscribe(User user) {
		subscribers.add(user);
	}

	public void unsubscribe(User user) {
		subscribers.remove(user);
	}

	public boolean isSubscribed(User user) {
		return subscribers.contains(user);
	}

	public static enum LetterPublisher {
		NYTIMES, WASHINGTONPOST, USATODAY
	}

}
