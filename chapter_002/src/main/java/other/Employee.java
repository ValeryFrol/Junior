package other;

import java.util.Objects;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

//    public boolean equals(Object otherObject) {
//        if (otherObject == null) return false;
//        if (this == otherObject) return true;
//
//
//        if (getClass() != otherObject.getClass()) return false;
//        Employee other = (Employee) otherObject;
//        //Object.equals(a,b)
//        return Objects.equals(name,other.name)&&salary == other.salary;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,salary);
    }
//hashCode - это целое число, связанное с конкретным обектом
}
