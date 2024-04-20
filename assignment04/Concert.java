
public class Concert extends MonthApptDecorator {
	public Concert(MonthAppt delegate, String descriptionIn, double priceIn,
			int dayOfMonthIn, int timeSlotIn) {
		super(delegate);
		description = "Concert: " + descriptionIn;
		price = priceIn;
		dayOfMonth = dayOfMonthIn;
		timeSlot = timeSlotIn;
	}
}
