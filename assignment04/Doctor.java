
public class Doctor extends ApptDecorator {
	public Doctor(ApptsForMonth next, String descriptionIn, double priceIn,
			int dayOfMonthIn, int timeSlotIn) {
		super(next);
		description = "Doctor: " + descriptionIn;
		price = priceIn;
		dayOfMonth = dayOfMonthIn;
		timeSlot = timeSlotIn;
	}
}
