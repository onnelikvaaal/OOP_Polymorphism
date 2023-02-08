public class DriverB<T extends Car> extends Driver {

    public DriverB (String name,
                    boolean hasDrivingLicense,
                    int drivingExperience) {
        super(name, hasDrivingLicense, drivingExperience);
    }

    @Override
    public void start() {
        System.out.println("Driver B " + getName() + " starts moving");
    }

    @Override
    public void stop() {
        System.out.println("Driver B " + getName() + " finished");
    }

    @Override
    public void refuel() {
        System.out.println("Driver B " + getName() + " fuels the car");
    }

    public String getCarMessage(Car car) {
        return "Driver " + getName() + " is driving car " + car.getBrand() + " " + car.getModel() + " and will join the race!";
    }
}
