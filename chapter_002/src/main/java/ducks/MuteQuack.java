package ducks;

public class MuteQuack implements Quack {
    @Override
    public void quack() {
        System.out.println("i can't quack");
    }
}
