import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && Objects.equals(mechanics, transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, mechanics);
    }
}
