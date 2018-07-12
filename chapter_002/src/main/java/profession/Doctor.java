package profession;

public class Doctor extends Profession {
    public void cure() {

    }

    public String getDiagnosis() {
        return null;
    }
}

//чтобы запретить наследование класса, нужно сделать приватный конструктор или сам класс родителя объявить final
