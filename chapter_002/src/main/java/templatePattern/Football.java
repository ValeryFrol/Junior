package templatePattern;

public class Football extends Game {
    public Football(String name) {
        super(name);
    }

    @Override
    void initialize() {
        System.out.println("initialize");
    }

    @Override
    void startPlay() {
        System.out.println("play started");
    }

    @Override
    void endPlay() {
        System.out.println("play ended");
    }
}
