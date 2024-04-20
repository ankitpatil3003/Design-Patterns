
public class Fandriver {

	public static void main(String[] args) {
		Fan fan = new Fan();
		// set fan to be running at maximum before connecting remote.
		for (int i = 0; i < fan.MAX_SPEED; i++)
			fan.faster();
		System.out.println(fan.getSpeed()); // prints 10
		FanRemote remote = new FanRemote(fan);
		System.out.println(fan.getSpeed()); // prints 0
		remote.setSpeed(8);
		System.out.println(fan.getSpeed()); // prints 8
		remote.setSpeed(4);
		System.out.println(fan.getSpeed()); // prints 4
		remote.setSpeed(0);
		System.out.println(fan.getSpeed()); // prints 0
		remote.setSpeed(12);
		System.out.println(fan.getSpeed()); // prints 10
		remote.setSpeed(-1);
		System.out.println(fan.getSpeed()); // prints 0
	}
}
