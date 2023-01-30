public abstract class Transport {

    /*В абстрактный класс  Transport
    добавьте абстрактный метод printType, который выводит в консоль либо значение типа транспортного средства,
    либо, если тип транспортного средства не указан,
    строку вида «Данных по транспортному средству недостаточно».*/

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

    public abstract void printType();

    public abstract void getDiagnostics() throws TransportTypeException;

}
