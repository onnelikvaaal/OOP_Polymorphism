import java.util.ArrayList;
import java.util.List;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;

    private List<Mechanic> mechanics = new ArrayList<>();

    public Transport (String brand, String model, double engineVolume, List<Mechanic> mechanics) {
        this.brand = ValidateUtils.validateStringCarParameter(brand);
        this.model = ValidateUtils.validateStringCarParameter(model);
        this.engineVolume = ValidateUtils.validateDoubleCarParameter(engineVolume);
        this.mechanics = mechanics;
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

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
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

    public void getMechanicsInfo() {
        for (Mechanic mechanic : mechanics) {
            System.out.println("Механик: " + mechanic);
        }
    }




}
