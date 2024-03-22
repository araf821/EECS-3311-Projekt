package objects;

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

	public static enum LetterPublisher {
		NYTIMES, WASHINGTONPOST, USATODAY
	}

}
