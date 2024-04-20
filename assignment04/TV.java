
public class TV {
	public final int MAX_CHANNELS = 500;
	private int channel;

	public void up() {
		// Note that the TV channel is limited to MAX_CHANNELS
		channel = Math.min(MAX_CHANNELS, channel + 1);
	}

	public void down() {
		// Note that the TV channel cannot go below 2
		channel = Math.max(2, channel - 1);
	}

	public int getChannel() {
		return channel;
	}
}
