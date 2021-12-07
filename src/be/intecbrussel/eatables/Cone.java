package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {
    private Flavor[] balls;

    //Constructors
    public Cone() {
        this.balls[0] = Flavor.MOKKA;
    }

    public Cone(Flavor[] flavors) {
        this.balls = flavors;
    }

    //Override methode//StringBuilders text
    @Override
    public void eat() {
        StringBuilder sb = new StringBuilder("I am eating cone with flavors; ");
        sb.append(sb);
        for (Flavor flavor : balls) {
            sb.append(flavor).append(" , ");

        }

        System.out.println(sb.toString( ));
    }

    //Enums
    public enum Flavor {
        STRAWBERRY,BANANA,CHOCOLATE,VANILLA,LEMON,STRACIATELLA,MOKKA,PISTACHE;

    }

    @Override
    public String toString() {
        return "Cone{" +
                "balls=" + Arrays.toString(balls) +
                '}';
    }
}