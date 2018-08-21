package ducks;

public class Ducks {
    Fly flyBehavior;
    Quack quackBehavior;
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void swim(){
        System.out.println("All ducks can swim");
    }
    public void display(){
        System.out.println("I'm a duck");
    }
    public void setFlyBehavior(Fly flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(Quack quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
