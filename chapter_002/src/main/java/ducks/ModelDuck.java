package ducks;

public class ModelDuck extends Ducks {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quacky();
    }
    public void display(){
        System.out.println("i'm a model duck");
    }
}
