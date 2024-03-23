package objects;

import java.util.Date;

public interface PenaltyStrategy {
	public double calculate(Date dueDate, Date returnDate);
}
