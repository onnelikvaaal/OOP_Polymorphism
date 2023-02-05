public class Driver {
    /*Создайте общий класс «Водитель», который будет иметь следующие параметры:

            «ФИО» водителя,
            «Наличие водительских прав»,
            «Стаж».
    Создайте еще три класса для водителей с разными типами водительских правам:

    для легковых авто нужна категория В;
    для грузовых нужна категория С;
    для автобусов — D.
    Все водители должны иметь:

    метод «начать движение»,
    метод «остановиться»,
    метод «заправить авто».*/

    private String name;
    private boolean hasDrivingLicense;
    private int drivingExperience;

    public Driver(String name,
                  boolean hasDrivingLicense,
                  int drivingExperience) {
        this.name = name;
        this.hasDrivingLicense = hasDrivingLicense;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public void start() {
        System.out.println("Start");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void refuel() {
        System.out.println("Refuel");
    }
}
