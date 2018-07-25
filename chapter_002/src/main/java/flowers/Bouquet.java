package flowers;

import java.util.Scanner;

public class Bouquet {
    public static void main(String[] args) {
        Lilly lilly = new Lilly("white", 200,"lilly");
        Roses rose = new Roses("red", 120,"rose");
        Tulip tulip = new Tulip("yellow", 100,"tulip");
        Flowers flower = new Flowers();
        System.out.println("which flowers to add to the buoquet: roses, lilly or tulip?");
        System.out.println("press exit for exit");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            switch (sc.nextLine()) {
                case "roses":
                    flower.getBuoquet(rose, 10);
                    System.out.println("which flowers to add to the buoquet: roses, lilly or tulip?");
                    break;
                case "lilly":
                    flower.getBuoquet(lilly, 15);
                    System.out.println("which flowers to add to the buoquet: roses, lilly or tulip?");
                    break;
                case "tulip":
                    flower.getBuoquet(tulip, 2);
                    System.out.println("which flowers to add to the buoquet: roses, lilly or tulip?");
                    break;
                case "exit": flower.showBuoquet();
                    break;
                default: System.out.println("Wrong entry");
            }


        }
        flower.showBuoquet();


    }
}
