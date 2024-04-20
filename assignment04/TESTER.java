
public class TESTER {

	public static void main(String[] args) {
		System.out.println("Running ApptDriver");
		ApptDriver.main(args);
		System.out.println("==============================");
		System.out.println("Running Driver");
		Driver.main(args);
		System.out.println("==============================");
		System.out.println("Running TVdriver");
		TVdriver.main(args);
		System.out.println("==============================");
		System.out.println("Running Thermostatdriver");
		Thermostatdriver.main(args);
		System.out.println("==============================");
		System.out.println("Running Fandriver");
		Fandriver.main(args);
	}

}
