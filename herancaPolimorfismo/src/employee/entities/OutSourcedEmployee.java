package employee.entities;

public class OutSourcedEmployee extends Employee {
    private double addtionalCharge;

    public OutSourcedEmployee() {
        super();
    }

    public OutSourcedEmployee(String name, int hours, double valuePerHours, double addtionalCharge) {
        super(name, hours, valuePerHours);
        this.addtionalCharge = addtionalCharge;
    }

    public double getAddtionalCharge() {
        return addtionalCharge;
    }

    public void setAddtionalCharge(double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + addtionalCharge * 1.1;
    }
}
