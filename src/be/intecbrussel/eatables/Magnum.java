package be.intecbrussel.eatables;

import be.intecbrussel.seller.NoMoreIceCreamException;

public class Magnum implements Eatable {
    private MagnumType magnumType;

    //Constructor
    public Magnum() {
    }

    //With 1 parameter
    public Magnum(MagnumType magnumType) {
        this.magnumType = magnumType;

    }

    //Override Methode
    @Override
    public void eat() {
        System.out.println(" I am eating Magnum" + "-" + this.magnumType);

    }

    // Getter Methode
    public MagnumType getType() {
        this.magnumType = magnumType;
        return magnumType;
    }

    //ENUM class + Value
    public enum MagnumType {
        MILKCHOCOLATE(1.2),
        WHITECHOCOLATE(1.3),
        BlACKCHOCOLATE(1.5),
        ALPINENUTS(1.5),
        ROMZNTICSTRAWBERRIES(1.1);

        private double priceMultiplierByMagnumType;

        MagnumType(double priceMultiplierByStandard) {
            this.priceMultiplierByMagnumType = priceMultiplierByStandard;

        }

        public double getPriceMultiplierByMagnumType() {
            if (priceMultiplierByMagnumType > 0) {
                return priceMultiplierByMagnumType;
            } else
                throw new NoMoreIceCreamException( );


        }
    }

    @Override
    public String toString() {
        return super.toString( );
    }
}

