import java.util.ArrayList;
import java.util.List;

public class Main {

   /* Для каждого вида авто (легковые, грузовые и автобусы) создайте по 4 объекта с произвольными параметрами.*/
    public static void main(String[] args) {
        Car ladaCar = new Car("Lada", "Granta", 1.8, CarBody.SEDAN);
        Car toyotaCar = new Car("Toyota", "Land Cruiser", 4.0, CarBody.JEEP);
        Car kiaCar = new Car("Kia", "Sportage", 2.4, CarBody.CROSSOVER);
        Car renaultCar = new Car("Renault", "Symbol", 1.5, CarBody.SEDAN);

        Truck ivecoTruck = new Truck("Iveco", "AMT", 6.0, LoadCapacity.N2);
        Truck kamazTruck = new Truck("Kamaz", "6520", 5.0, LoadCapacity.N2);
        Truck scaniaTruck = new Truck("Scania", "S730", 6.0, LoadCapacity.N3);
        Truck fordTruck = new Truck("Ford", "Cargo", 5.0, LoadCapacity.N3);

        Bus nefazBus = new Bus("Nefaz", "5299-0000011-52", 4.0, PassengerCapacity.M);
        Bus scaniaBus = new Bus("Scania", "OmniLink", 4.5, PassengerCapacity.M);
        Bus daewooBus = new Bus("Daewoo", "Royal Cruiser", 4.5, PassengerCapacity.L);
        Bus kiaBus = new Bus("Kia", "Grandbird Silkroad", 4.2, PassengerCapacity.XL);

        DriverB<Car> ivanov = new DriverB<>("Иванов Иван Иванович", true, 5);
        DriverC<Truck> petrov = new DriverC<>("Петров Пётр Петрович", true, 10);
        DriverD<Bus> sidorov = new DriverD<>("Сидоров Сидор Сидорович", true, 15);

        System.out.println(ivanov.getCarMessage(kiaCar));
        System.out.println(petrov.getTruckMessage(ivecoTruck));
        System.out.println(sidorov.getBusMessage(daewooBus));

        System.out.println();
        System.out.println(CarBody.SEDAN);
        System.out.println();
        System.out.println(LoadCapacity.N2);
        System.out.println();
        System.out.println(PassengerCapacity.S);

       /* List<Transport> list = new ArrayList<>();
        list.add(renaultCar); list.add(ivecoTruck); list.add(kiaBus);
        for (Transport transport : list) {
            if (transport instanceof Car || transport instanceof Truck) {
                transport.getDiagnostics();
            } else {
                throw new TransportTypeException("Автобусы не должны проходить диагностику!");
            }
        }*/

        /*Transport[] transports = new Transport[] {ladaCar, kiaCar, ivecoTruck, daewooBus, nefazBus, scaniaBus};
        for (Transport t : transports) {
            try {
                t.getDiagnostics();
            } catch (TransportTypeException e) {
                System.err.println(e.getMessage());
            }
        }*/

        toyotaCar.getDiagnostics();
        ivecoTruck.getDiagnostics();

        try {
            daewooBus.getDiagnostics();
        } catch (TransportTypeException e) {
            System.err.println(e.getMessage());
        }

    }
}