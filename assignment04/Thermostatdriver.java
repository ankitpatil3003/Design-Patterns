public class Thermostatdriver {

	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		// set Thermostat to be running at maximum temperature connecting remote.
		for (int i = stat.MIN_TEMPERATURE; i < stat.MAX_TEMPERATURE; i++)
			stat.warmer();
		System.out.println(stat.getTemperature()); // prints 90
		ThermostatRemote remote = new ThermostatRemote(stat);
		System.out.println(stat.getTemperature()); // prints 50
		remote.setTemperature(75);
		System.out.println(stat.getTemperature()); // prints 75
		remote.setTemperature(60);
		System.out.println(stat.getTemperature()); // prints 60
		remote.setTemperature(40);
		System.out.println(stat.getTemperature()); // prints 50
		remote.setTemperature(100);
		System.out.println(stat.getTemperature()); // prints 90
		remote.setTemperature(-10);
		System.out.println(stat.getTemperature()); // prints 50
	}
}
