public class TVRemote {
	private TV tv;

	public TVRemote(TV tvIn) {
		tv = tvIn;

		// TODO
		// make calls to tv.down() to set the TV channel to 2; notice that
		// this test driver raises the channel before connecting the remote.
		while (tv.getChannel() != 2) {
			tv.down();
		}
	}

	public void setChannel(int newChannel) {
		// TODO
		// write this method using multiple calls to tv.up() or
		// tv.down() as appropriate
		if (newChannel < 2) {
			newChannel = 2;
		}
		if (newChannel > tv.MAX_CHANNELS) {
			newChannel = tv.MAX_CHANNELS;
		}

		while (tv.getChannel() != newChannel) {
			Runnable adjustChannel = (tv.getChannel() > newChannel) ? tv::down : tv::up;
			adjustChannel.run();
		}
	}
}
