
public class Thermostat {
	public final int MAX_TEMPERATURE = 90;
	public final int MIN_TEMPERATURE = 50;
	private int temperature = MIN_TEMPERATURE;

	public void warmer() {
		// Note that the Thermostat temperature cannot go above MAX_TEMPERATURE
		temperature = Math.min(MAX_TEMPERATURE, temperature + 1);
	}

	public void cooler() {
		// Note that the Thermostat temperature cannot go below MIN_TEMPERATURE
		temperature = Math.max(MIN_TEMPERATURE, temperature - 1);
	}

	public int getTemperature() {
		return temperature;
	}
}
