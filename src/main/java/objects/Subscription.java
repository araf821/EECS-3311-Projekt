package objects;

import java.time.LocalDate;
import java.util.Date;

import userHandling.SubscriptionHandling;

public class Subscription {
	private User user;
	private Newsletter newsletter;
	private PaymentOption paymentOption;

	public Subscription(User user, Newsletter news, PaymentOption paymentOption) {
		this.user = user;
		this.newsletter = news;
		this.paymentOption = paymentOption;
	}
	
	public Subscription(User user, Newsletter news) {
		this.user = user;
		this.newsletter = news;
		this.paymentOption = new PaymentOption(user.getId(), 0, PaymentType.OTHER);
	}


	public User getUser() {
		return this.user;
	}

	public Newsletter getNewsletter() {
		return this.newsletter;
	}

	public String toCSVString() {
		String csvString = (SubscriptionHandling.getLastId() + 1) + "," + this.user.getId() + ","
				+ this.newsletter.getName() + "," + this.newsletter.getCost() + ","
				+ this.paymentOption.getPaymentType();
		return csvString;
	}

	public void pay() {
		if (paymentOption.getBalance() >= newsletter.getCost()) {
			paymentOption.withdraw(newsletter.getCost());

			String message = "Your subscription has been renewed; withdrew " + newsletter.getCost()
					+ " from your account";
			LocalDate date = LocalDate.now();
			Notification SubRenewal = new Notification(101, this.getUser().getId(), message, date);
		} else {
			String message = "Insufficent funds";
			LocalDate date = LocalDate.now();
			Notification insufficentFunds = new Notification(102, this.getUser().getId(), message, date);
		}

	}

}
