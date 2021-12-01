package be.intecbrussel.eatables;

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
            StringBuilder text = new StringBuilder( );
            text.append("I am eating cone with flavors; ");
            for (Flavor flavor : balls) {
                text.append(flavor).append(", ");
            }

            System.out.println(text.toString( ));
        }

        //Enums
        public enum Flavor {
            STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE;
        }
    }




