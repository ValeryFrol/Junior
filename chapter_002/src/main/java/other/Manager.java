package other;

public class Manager extends Employee {
    private int bonus;

    public Manager(int bonus, String name, int salary) {
        super(name, salary);
        this.bonus = bonus;
    }

    public boolean equals(Object otherObject) {
        if(!super.equals(otherObject))return false;
        Manager other =(Manager) otherObject;
        return bonus == other.bonus;
    }
}
