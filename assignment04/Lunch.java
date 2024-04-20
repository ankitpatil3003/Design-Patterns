
public class Lunch extends MonthApptDecorator {
	public Lunch(MonthAppt delegate, String descriptionIn, double priceIn,
			int dayOfMonthIn, int timeSlotIn) {
		super(delegate);
		description = "Lunch: " + descriptionIn;
		price = priceIn;
		dayOfMonth = dayOfMonthIn;
		timeSlot = timeSlotIn;
	}
}
