import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Mechanic alekseev = new Mechanic("Алексеев Алексей Алексеевич", "Тополёк");
        Mechanic borisov = new Mechanic("Борисов Борис Борисович", "Ключик");
        Mechanic sergeev = new Mechanic("Сергеев Сергей Сергеевич", "Ключик");
        Mechanic romanov = new Mechanic("Романов Роман Романович", "Ключик");

        ArrayList<Mechanic> mechanicsList = new ArrayList<>();
        mechanicsList.add(alekseev);
        mechanicsList.add(borisov);
        mechanicsList.add(sergeev);
        mechanicsList.add(romanov);

        Car ladaCar = new Car("Lada", "Granta", 1.8, mechanicsList, CarBody.SEDAN);
        Car toyotaCar = new Car("Toyota", "Land Cruiser", 4.0, mechanicsList, CarBody.JEEP);
        Car kiaCar = new Car("Kia", "Sportage", 2.4, mechanicsList, CarBody.CROSSOVER);
        Car renaultCar = new Car("Renault", "Symbol", 1.5, mechanicsList, CarBody.SEDAN);

        Truck ivecoTruck = new Truck("Iveco", "AMT", 6.0, mechanicsList, LoadCapacity.N2);
        Truck kamazTruck = new Truck("Kamaz", "6520", 5.0, mechanicsList, LoadCapacity.N2);
        Truck scaniaTruck = new Truck("Scania", "S730", 6.0, mechanicsList, LoadCapacity.N3);
        Truck fordTruck = new Truck("Ford", "Cargo", 5.0, mechanicsList, LoadCapacity.N3);

        Bus nefazBus = new Bus("Nefaz", "5299-0000011-52", 4.0, mechanicsList, PassengerCapacity.M);
        Bus scaniaBus = new Bus("Scania", "OmniLink", 4.5, mechanicsList, PassengerCapacity.M);
        Bus daewooBus = new Bus("Daewoo", "Royal Cruiser", 4.5, mechanicsList, PassengerCapacity.L);
        Bus kiaBus = new Bus("Kia", "Grandbird Silkroad", 4.2, mechanicsList, PassengerCapacity.XL);

        DriverB<Car> ivanov = new DriverB<>("Иванов Иван Иванович", true, 5);
        DriverC<Truck> petrov = new DriverC<>("Петров Пётр Петрович", true, 10);
        DriverD<Bus> sidorov = new DriverD<>("Сидоров Сидор Сидорович", true, 15);

        List<Transport> transportList = Arrays.asList(ladaCar, toyotaCar, kiaCar, renaultCar, ivecoTruck, kamazTruck,
                                                        scaniaTruck, fordTruck, nefazBus, scaniaBus, daewooBus, kiaBus);

        for (Transport transport : transportList) {
            transport.startMoving();
        }



        System.out.println(ivanov.getCarMessage(kiaCar));
        System.out.println(petrov.getTruckMessage(ivecoTruck));
        System.out.println(sidorov.getBusMessage(daewooBus));

        System.out.println();
        System.out.println(CarBody.SEDAN);
        System.out.println();
        System.out.println(LoadCapacity.N2);
        System.out.println();
        System.out.println(PassengerCapacity.S);

        toyotaCar.getDiagnostics();
        ivecoTruck.getDiagnostics();

        try {
            daewooBus.getDiagnostics();
        } catch (TransportTypeException e) {
            System.err.println(e.getMessage());
        }

        sergeev.techService(kamazTruck);
        romanov.repair(nefazBus);

        kiaBus.getMechanicsInfo();

        ServiceStation station = new ServiceStation();
        station.addToServiceQueue(kiaCar);
        station.addToServiceQueue(kamazTruck);
        station.addToServiceQueue(kiaBus);

        station.service();
        station.service();

    }
}