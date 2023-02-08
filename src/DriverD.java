public class DriverD<T extends Bus> extends Driver {

    public DriverD (String name,
                    boolean hasDrivingLicense,
                    int drivingExperience) {
        super(name, hasDrivingLicense, drivingExperience);
    }

    @Override
    public void start() {
        System.out.println("Driver D " + getName() + " starts moving");
    }

    @Override
    public void stop() {
        System.out.println("Driver D " + getName() + " finished");
    }

    @Override
    public void refuel() {
        System.out.println("Driver D " + getName() + " fuels the bus");
    }

    public String getBusMessage(Bus bus) {
        return "Driver " + getName() + " is driving bus " + bus.getBrand() + " " + bus.getModel() + " and will join the race!";
    }
}
