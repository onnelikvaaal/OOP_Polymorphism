public class Main {

   /* Для каждого вида авто (легковые, грузовые и автобусы) создайте по 4 объекта с произвольными параметрами.*/
    public static void main(String[] args) {
        Car ladaCar = new Car("Lada", "Granta", 1.8);
        Car toyotaCar = new Car("Toyota", "Land Cruiser", 4.0);
        Car kiaCar = new Car("Kia", "Sportage", 2.4);
        Car renaultCar = new Car("Renault", "Symbol", 1.5);

        Truck ivecoTruck = new Truck("Iveco", "AMT", 6.0);
        Truck kamazTruck = new Truck("Kamaz", "6520", 5.0);
        Truck scaniaTruck = new Truck("Scania", "S730", 6.0);
        Truck fordTruck = new Truck("Ford", "Cargo", 5.0);

        Bus nefazBus = new Bus("Nefaz", "5299-0000011-52", 4.0);
        Bus scaniaBus = new Bus("Scania", "OmniLink", 4.5);
        Bus daewooBus = new Bus("Daewoo", "Royal Cruiser", 4.5);
        Bus kiaBus = new Bus("Kia", "Grandbird Silkroad", 4.2);

        DriverB<Car> ivanov = new DriverB<>("Иванов Иван Иванович", true, 5);
        DriverC<Truck> petrov = new DriverC<>("Петров Пётр Петрович", true, 10);
        DriverD<Bus> sidorov = new DriverD<>("Сидоров Сидор Сидорович", true, 15);

        System.out.println(ivanov.getCarMessage(kiaCar));
        System.out.println(petrov.getTruckMessage(ivecoTruck));
        System.out.println(sidorov.getBusMessage(daewooBus));
    }
}