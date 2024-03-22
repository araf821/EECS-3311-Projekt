package objects;

import java.util.Date;

public class OnTimePenaltyStrategy implements PenaltyStrategy{
	public double calculate(Date dueDate, Date returnDate) {
		double penalty = 0.0;
		LatePenaltyStrategy late = new LatePenaltyStrategy();
		
		if (returnDate.after(dueDate)) {
			penalty = late.calculate(dueDate, returnDate);
        }
		
		return penalty;
	}

}