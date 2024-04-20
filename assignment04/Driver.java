
public class Driver {
	public static void main(String[] args) {
		ApptsForMonth p = new Person2("Person One");
		p = new Hairdresser(p, "First", 40.00, 3, 10);
		p = new Doctor(p, "Second", 50.00, 1, 10);
		p = new Doctor(p, "Third", 30.00, 29, 15);
		p = new Dinner(p, "Applebee's", 15.00, 18, 17);
		p.printAppointments();
		System.out.println(p.timeConlict());
		p = new Doctor(p, "Fourth", 25.00, 29, 15);
		p = new Dinner(p, "Downtown", 12.00, 18, 17);
		p.printAppointments();
		p.printAppointments(29);
		System.out.println(p.timeConlict());
	}
}
/*
 * Appointments for Person One:
 * On day 3 at 10:00, appt. is for Hairdresser: First
 * On day 1 at 10:00, appt. is for Doctor: Second
 * On day 29 at 15:00, appt. is for Doctor: Third
 * On day 18 at 17:00, appt. is for Dinner: Applebee's
 * no (other) conflicts
 * Appointments for Person One:
 * On day 3 at 10:00, appt. is for Hairdresser: First
 * On day 1 at 10:00, appt. is for Doctor: Second
 * On day 29 at 15:00, appt. is for Doctor: Third
 * On day 18 at 17:00, appt. is for Dinner: Applebee's
 * On day 29 at 15:00, appt. is for Doctor: Fourth
 * On day 18 at 17:00, appt. is for Dinner: Downtown
 * Appointments for Person One On Day 29:
 * On day 29 at 15:00, appt. is for Doctor: Third
 * On day 29 at 15:00, appt. is for Doctor: Fourth
 * Time Conflict: On day 18 at 17:00, appt. is for Dinner: Downtown
 * Time Conflict: On day 29 at 15:00, appt. is for Doctor: Fourth
 * no (other) conflicts
 */