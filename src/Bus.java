import java.util.List;

public class Bus extends Transport implements Competitive {

    private PassengerCapacity passengerCapacity;

    public Bus (String brand,
                String model,
                double engineVolume, List<Mechanic> mechanics,
                PassengerCapacity passengerCapacity) {
        super(brand, model, engineVolume, mechanics);
        this.passengerCapacity = passengerCapacity;
    }

    public PassengerCapacity getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(PassengerCapacity passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
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

    @Override
    public void printType(){
        if (passengerCapacity != null) {
            System.out.println(passengerCapacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно!");
        }
    }

    @Override
    public void getDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("Автобусы не должны проходить диагностику!");
    }
}
