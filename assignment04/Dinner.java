
public class Dinner extends ApptDecorator {
	public Dinner(ApptsForMonth next, String descriptionIn, double priceIn,
			int dayOfMonthIn, int timeSlotIn) {
		super(next);
		description = "Dinner: " + descriptionIn;
		price = priceIn;
		dayOfMonth = dayOfMonthIn;
		timeSlot = timeSlotIn;
	}
}
