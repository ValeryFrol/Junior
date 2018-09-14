package templatePattern;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    String name;
    public final void play(){ //определяем скелет алгоритма
        initialize();
        startPlay();
        endPlay();
    }
    //
    public Game(String name){
        this.name = name;
    }


}
