package objects;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class LatePenaltyStrategy implements PenaltyStrategy{
	@Override
	public double calculate(Date dueDate, Date returnDate) {
        long diffInMillies = returnDate.getTime() - dueDate.getTime();
        
        long daysBetween = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        double penalty = daysBetween * 0.5;
        
        return penalty;
	}

}
