public class Bus extends Transport implements Competitive {

    public Bus (String brand,
                String model,
                double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Bus " + getBrand() + " starts");
    }

    @Override
    public void finishMoving() {
        System.out.println("Bus " + getBrand() + " finished");
    }

    @Override
    public void pitStop() {
        System.out.println("Bus " + getBrand() + " goes to pit-stop!");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Лучшее время круга: " + 10 / getEngineVolume() + " минут");
    }

    @Override
    public void topSpeed() {
        System.out.println("Максимальная скорость: " + getEngineVolume() * 10 + "км/ч");
    }
}
