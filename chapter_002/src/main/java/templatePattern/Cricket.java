package templatePattern;

public class Cricket extends Game {

    public Cricket(String name) {
        super(name);
    }

    @Override
    void initialize() {
        System.out.println("initialize");
    }

    @Override
    void startPlay() {
        System.out.println("game started");
    }

    @Override
    void endPlay() {
        System.out.println("game ended");
    }
}
