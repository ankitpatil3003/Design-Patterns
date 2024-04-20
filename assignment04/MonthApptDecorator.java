
public abstract class MonthApptDecorator implements MonthAppt {
	protected MonthAppt delegate;
	protected String description;
	protected double price;
	protected int dayOfMonth;
	protected int timeSlot;

	public MonthApptDecorator(MonthAppt delegate) {
		this.delegate = delegate;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public int getDayOfMonth() {
		return dayOfMonth;
	}

	@Override
	public int getTimeSlot() {
		return timeSlot;
	}

	@Override
	public double getTotalPayments() {
		return price + delegate.getTotalPayments();
	}

	public int dayTimeCount(int day, int slot) {
		// TODO
		/*
		 * adds 1 to the dayTimeCount of delegate if day,
		 * slot match the fields dayOfMonth and timeSlot
		 * and otherwise adds nothing. The resulting value
		 * is the return value.
		 * Hence the value returned by any appointment decorator
		 * will be a count of how many appointments have already
		 * been added to the linked list of appointments that
		 * are on the same day and at the same time as this one,
		 * i.e. how many appointments have been added that
		 * conflict with this one.
		 */
		return (day == dayOfMonth && slot == timeSlot) ? 1 + delegate.dayTimeCount(day, slot)
				: delegate.dayTimeCount(day, slot);
	}

	@Override
	public String timeConlict() {
		if (dayTimeCount(dayOfMonth, timeSlot) > 1)
			return "Time Conflict: " + toString() + "\n" +
					delegate.timeConlict();
		return delegate.timeConlict();
	}

	@Override
	public void printAppointments() {
		delegate.printAppointments();
		System.out.println(toString());
	}

	@Override
	public void printAppointments(int day) {
		// TODO
		/*
		 * which only prints anything for this decorator if
		 * day matches the field dayOfMonth.
		 * Hence calling this method will only print the
		 * 
		 * appointments on this day. See the output at the end of
		 * ApptDriver.java
		 */
		delegate.printAppointments(day);

		if (day == dayOfMonth) {
			System.out.println(toString());
		}
	}

	@Override
	public String toString() {
		return "On day " + dayOfMonth + " at "
				+ timeSlot + ":00, appt. is for " + description;
	}
}
