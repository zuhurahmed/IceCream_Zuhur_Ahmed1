package be.intecbrussel.seller;

import be.intecbrussel.eatables.Magnum;

public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    // Constructors
    public PriceList() {
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    //Getters
    public double getBallPrice() {
        return ballPrice;
    }

    //setters
    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;

    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;

    }

    public double getMagnumStandardPrice(Magnum.MagnumType magnumType) {
        return magnumStandardPrice * (magnumType != null ? 1 : magnumType.getPriceMultiplierByMagnumType());
    }
}
