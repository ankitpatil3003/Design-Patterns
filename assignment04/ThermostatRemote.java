public class ThermostatRemote {
    private Thermostat stat;

    public ThermostatRemote(Thermostat statIn) {
        stat = statIn;

        // TODO
        // make calls to stat.cooler() to set the temperature to the minimum
        // notice the test driver raises the temp before connecting the remote.
        while (statIn.getTemperature() != stat.MIN_TEMPERATURE) {
            stat.cooler();
        }
    }

    public void setTemperature(int newTemp) {
        // TODO
        // write this method using multiple calls to stat.warmer() or
        // stat.cooler() as appropriate
        if (newTemp < stat.MIN_TEMPERATURE) {
            newTemp = stat.MIN_TEMPERATURE;
        }
        if (newTemp > stat.MAX_TEMPERATURE) {
            newTemp = stat.MAX_TEMPERATURE;
        }

        while (stat.getTemperature() != newTemp) {
            Runnable adjustTemperature = (stat.getTemperature() > newTemp) ? stat::cooler : stat::warmer;
            adjustTemperature.run();
        }
    }
}