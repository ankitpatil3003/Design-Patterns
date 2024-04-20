
public class Hairdresser extends ApptDecorator {
	public Hairdresser(ApptsForMonth next, String descriptionIn, double priceIn,
			int dayOfMonthIn, int timeSlotIn) {
		super(next);
		description = "Hairdresser: " + descriptionIn;
		price = priceIn;
		dayOfMonth = dayOfMonthIn;
		timeSlot = timeSlotIn;
	}
}
