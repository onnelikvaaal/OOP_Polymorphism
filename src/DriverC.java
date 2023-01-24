public class DriverC<T extends Truck> extends Driver {

    public DriverC (String name,
                    boolean hasDrivingLicense,
                    int drivingExperience) {
        super(name, hasDrivingLicense, drivingExperience);
    }

    @Override
    public void start() {
        System.out.println("Driver C " + getName() + " starts moving");
    }

    @Override
    public void stop() {
        System.out.println("Driver C " + getName() + " finished");
    }

    @Override
    public void refuel() {
        System.out.println("Driver C " + getName() + " fuels the bus");
    }

    public String getTruckMessage(Truck truck) {
        return "Driver " + getName() + " is driving truck " + truck.getBrand() + " " + truck.getModel() + " and will join the race!";
    }
}
