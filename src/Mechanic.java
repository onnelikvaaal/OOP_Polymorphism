public class Mechanic {

    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = ValidateUtils.validateStringMechanicParameter(name);
        this.company = ValidateUtils.validateStringMechanicParameter(company);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return name + " " + company;
    }

    public void techService(Transport transport) {
        System.out.println(name + " производит обслуживание " + transport.getBrand() + transport.getModel());
    }

    public void repair(Transport transport) {
        System.out.println(name + " чинит " + transport.getBrand() + transport.getModel());
    }
}
