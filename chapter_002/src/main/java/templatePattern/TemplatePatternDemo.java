package templatePattern;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket("dsfs");
        new Game("sdsf") {

            @Override
            void initialize() {

            }

            @Override
            void startPlay() {

            }

            @Override
            void endPlay() {

            }
        };
        game.play();
        System.out.println("");
        //game = new Football();
        game.play();
    }
}
