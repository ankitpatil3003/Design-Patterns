
public class TVdriver {

	public static void main(String[] args) {
		TV tv = new TV();
		// set TV to be at maximum channel connecting remote.
		for (int i = 0; i < tv.MAX_CHANNELS; i++)
			tv.up();
		System.out.println(tv.getChannel()); // prints 500
		TVRemote remote = new TVRemote(tv);
		System.out.println(tv.getChannel()); // prints 2
		remote.setChannel(101);
		System.out.println(tv.getChannel()); // prints 101
		remote.setChannel(96);
		System.out.println(tv.getChannel()); // prints 96
		remote.setChannel(0);
		System.out.println(tv.getChannel()); // prints 2
		remote.setChannel(600);
		System.out.println(tv.getChannel()); // prints 500
		remote.setChannel(-10);
		System.out.println(tv.getChannel()); // prints 2
	}
}
