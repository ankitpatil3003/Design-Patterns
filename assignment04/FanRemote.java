public class FanRemote {
    private Fan fan;

    public FanRemote(Fan fanIn) {
        fan = fanIn;

        // TODO
        // make calls to fan.slower() to set the fan speed to 0; notice that
        // the test driver sets the fan to maximum before connecting the remote.
        while (fan.getSpeed() != 0) {
            fan.slower();
        }
    }

    public void setSpeed(int newSpeed) {
        // TODO
        // write this method using multiple calls to fan.faster() or
        // fan.slower() as appropriate
        if (newSpeed < 0) {
            newSpeed = 0;
        }
        if (newSpeed > 10) {
            newSpeed = 10;
        }

        while (fan.getSpeed() != newSpeed) {
            Runnable adjustSpeed = (fan.getSpeed() > newSpeed) ? fan::slower : fan::faster;
            adjustSpeed.run();
        }
    }
}
