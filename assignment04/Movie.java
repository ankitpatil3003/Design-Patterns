
public class Movie extends MonthApptDecorator {
	public Movie(MonthAppt delegate, String descriptionIn, double priceIn,
			int dayOfMonthIn, int timeSlotIn) {
		super(delegate);
		description = "Movie: " + descriptionIn;
		price = priceIn;
		dayOfMonth = dayOfMonthIn;
		timeSlot = timeSlotIn;
	}
}
