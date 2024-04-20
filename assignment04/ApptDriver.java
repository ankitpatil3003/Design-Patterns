public class ApptDriver {
	public static void main(String[] args) {
		MonthAppt p = new Person1("Person One");
		p = new Movie(p, "One", 40.00, 30, 19);
		p = new Concert(p, "Two", 50.00, 21, 20);
		p = new Concert(p, "Three", 30.00, 29, 19);
		p = new Lunch(p, "Chenango Room", 9.00, 18, 12);
		p.printAppointments();
		System.out.println(p.timeConlict());
		p = new Concert(p, "Four", 25.00, 30, 19);
		p = new Lunch(p, "Mall", 10.00, 18, 12);
		p.printAppointments();
		p.printAppointments(30);
		System.out.println(p.timeConlict());
	}
}
/*
 * OUTPUT
 * Appointments for Person One:
 * On day 30 at 19:00, appt. is for Movie: One
 * On day 21 at 20:00, appt. is for Concert: Two
 * On day 29 at 19:00, appt. is for Concert: Three
 * On day 18 at 12:00, appt. is for Lunch: Chenango Room
 * no (other) conflicts
 * Appointments for Person One:
 * On day 30 at 19:00, appt. is for Movie: One
 * On day 21 at 20:00, appt. is for Concert: Two
 * On day 29 at 19:00, appt. is for Concert: Three
 * On day 18 at 12:00, appt. is for Lunch: Chenango Room
 * On day 30 at 19:00, appt. is for Concert: Four
 * On day 18 at 12:00, appt. is for Lunch: Mall
 * Appointments for Person One On Day 30:
 * On day 30 at 19:00, appt. is for Movie: One
 * On day 30 at 19:00, appt. is for Concert: Four
 * Time Conflict: On day 18 at 12:00, appt. is for Lunch: Mall
 * Time Conflict: On day 30 at 19:00, appt. is for Concert: Four
 * no (other) conflicts
 */
