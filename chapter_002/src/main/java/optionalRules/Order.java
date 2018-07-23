package optionalRules;

import java.util.Optional;

public class Order {
    static Thing[] things = new Thing[50];
    private int position = 0;

    public Order(Thing... things) {
        for (int i = 0; i < things.length; i++) {
            Optional<Thing> opt = Optional.ofNullable(things[i]);
            opt.ifPresent(x -> this.things[this.position++] = x);
            // this.things[this.position++] = things[i];
        }

    }

    public Thing addThing(Thing thing) {
        things[position++] = thing;
        return thing;
    }

    public void showThings() {

        for (int i = 0; i < position; i++) {
            System.out.println(things[i].getName());
        }
    }
}
