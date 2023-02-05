import java.util.List;

public class Truck extends Transport implements Competitive {

    private LoadCapacity loadCapacity;

    public Truck (String brand,
                  String model,
                  double engineVolume, List<Mechanic> mechanics,
                  LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, mechanics);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Truck " + getBrand() + " starts");
    }

    @Override
    public void finishMoving() {
        System.out.println("Truck " + getBrand() + " finished");
    }

    @Override
    public void pitStop() {
        System.out.println("Truck " + getBrand() + " goes to pit-stop!");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Лучшее время круга: " + 10 / getEngineVolume() + " минут");
    }

    @Override
    public void topSpeed() {
        System.out.println("Максимальная скорость: " + getEngineVolume() * 15 + "км/ч");
    }

    @Override
    public void printType(){
        if (loadCapacity != null) {
            System.out.println(loadCapacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно!");
        }
    }

    @Override
    public void getDiagnostics() {
        System.out.println("Грузовик прошёл диагностику");
    }
}
