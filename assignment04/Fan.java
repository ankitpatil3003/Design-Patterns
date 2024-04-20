
public class Fan {
	public final int MAX_SPEED = 10;
	private int fanspeed;

	public void faster() {
		// Note that the fan speed is limited to MAX_SPEED
		fanspeed = Math.min(MAX_SPEED, fanspeed + 1);
	}

	public void slower() {
		// Note that the fan speed cannot go below 0
		fanspeed = Math.max(0, fanspeed - 1);
	}

	public int getSpeed() {
		return fanspeed;
	}
}
