
public interface ApptsForMonth {
	String getDescription();

	double getPrice();

	int getDayOfMonth();

	int getTimeSlot();

	double getTotalPayments();

	void printAppointments();

	void printAppointments(int day);

	int dayTimeCount(int day, int slot);

	String timeConlict();
}
