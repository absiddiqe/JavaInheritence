package E9_1;

public class Manager extends Employee{
    private double bonus;
    public Manager(double baseSalary, String name, double bonus){
        super(baseSalary, name);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getTotalSalary(){
        return getBaseSalary() + getBonus();
    }
}
