public class Car extends Transport implements Competitive {

    private CarBody carBody;

    public Car(String brand,
               String model,
               double engineVolume,
               CarBody carBody) {
        super(brand, model, engineVolume);
        this.carBody = carBody;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    @Override
    public void startMoving() {
        System.out.println("Car " + getBrand() + " starts");
    }

    @Override
    public void finishMoving() {
        System.out.println("Car " + getBrand() + " finished");
    }

    @Override
    public void pitStop() {
        System.out.println("Car " + getBrand() + " goes to pit-stop!");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Лучшее время круга: " + 10 / getEngineVolume() + " минут");
    }

    @Override
    public void topSpeed() {
        System.out.println("Максимальная скорость: " + getEngineVolume() * 20 + "км/ч");
    }

    @Override
    public void printType(){
        if (carBody != null) {
            System.out.println(carBody);
        } else {
            System.out.println("Данных по транспортному средству недостаточно!");
        }
    }
}
