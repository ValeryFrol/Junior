package ducks;

public class MallardDuck extends Ducks {
    public MallardDuck(){
        quackBehavior = new Quacky();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("i'm a real mallard Duck");
    }
}
