package soloTasks;

import java.util.ArrayList;
import java.util.Objects;

public final class Cat {
    final private String name, color;
    final private int age;
    final private ArrayList<Kitten> kittens;

    public Cat(String name, String color, int age, ArrayList<Kitten> kittens) {
        this.name = name;
        this.color = color;
        this.age = age;
        ArrayList<Kitten> temp = new ArrayList<>();
        for (Kitten k : kittens
                ) {
            temp.add(k);
        }
        this.kittens = temp;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return this.getAge() == cat.getAge() &&
                this.getName().equals(cat.getName()) &&
                this.getColor().equals(cat.getColor()) &&
                this.getKittens().equals(cat.getKittens());
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        int counter = 0;
        if (this.getKittens().size() == cat.getKittens().size()) {
            for (int i = 0; i < this.getKittens().size(); i++) {
                for (int j = 0; j < this.getKittens().size(); j++) {
                    if (this.getKittens().get(i).equals(cat.getKittens().get(j))) counter += 1;
                }
            }
        } else return false;

        return this.getAge() == cat.getAge() &&
                this.getName().equals(cat.getName()) &&
                this.getColor().equals(cat.getColor()) &&
                counter == this.getKittens().size();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (this.getColor() == null ? 0 : this.getColor().hashCode());
        return hash;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Kitten> getKittens() {
        return (ArrayList<Kitten>) kittens.clone();
    }

    public static void main(String[] args) {
        ArrayList<Kitten> kittens = new ArrayList<>();
        kittens.add(new Kitten("Kitty", 1, "red"));
        kittens.add(new Kitten("Tom", 2, "black"));
        kittens.add(new Kitten("Tima", 1, "white"));
        Cat cat = new Cat("Martha", "grey", 7, kittens);
        kittens.add(new Kitten("Garik", 2, "black"));
        for (Kitten k : cat.getKittens()
                ) {
            System.out.println(k.toString());
        }
        System.out.println(cat);
    }
}

class Kitten {
    private String name, color;
    private int age;

    public Kitten(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kitten kitten = (Kitten) o;
        return this.age == kitten.age &&
                this.name.equals(kitten.name) &&
                this.color.equals(kitten.color);
    }

    @Override
    public String toString() {
        return "Kitten{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
