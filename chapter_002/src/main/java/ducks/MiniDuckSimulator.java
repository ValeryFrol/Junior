package ducks;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Ducks mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        Ducks model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
