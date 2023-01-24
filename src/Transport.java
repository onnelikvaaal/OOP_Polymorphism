public abstract class Transport {

    /*В автогонках могут участвовать несколько видов авто. Для каждого из них нужно создать отдельный класс:

            «Легковые автомобили»,
            «Грузовые автомобили»,
            «Автобусы».
    Авто всех трех групп имеют параметры:

            «Марка»,
            «Модель»,
            «Объем двигателя».
    Также все авто имеют:

    метод «начать движение»,
    метод «закончить движение».*/

    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand,
                     String model,
                     double engineVolume) {
        this.brand = ValidateUtils.validateStringCarParameter(brand);
        this.model = ValidateUtils.validateStringCarParameter(model);
        this.engineVolume = ValidateUtils.validateDoubleCarParameter(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume() {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + engineVolume;
    }

    public void startMoving() {
        System.out.println("Start");
    }

    public void finishMoving() {
        System.out.println("Finish");
    }
}
