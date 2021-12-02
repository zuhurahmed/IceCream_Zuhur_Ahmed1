package be.intecbrussel.seller;


import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

    public class IceCreamCar implements IceCreamSeller {
        private PriceList priceList;
        private Stock stock;
        private double profit;

        public IceCreamCar(PriceList priceList) {
            this.priceList = priceList;
        }

        // Constructor with two parameters
        public IceCreamCar(double profit, Stock stock) {
            this.profit = profit;
            this.stock = stock;

       public Cone orderCone(Flavor[] balls) throws NoMoreIceCreamException {
        if (this.stock.getBalls() >= balls.length && this.stock.getCones() > 0) {
            return this.prepareCone(balls);
        } else {
            throw new NoMoreIceCreamException("No more Cones or balls in stock");
        }
    }

    private Cone prepareCone(Flavor[] balls) throws NoMoreIceCreamException {
        return new Cone(balls);
    }

    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        if (this.stock.getIceRockets() > 0) {
            return this.prepareRocket();
        } else {
            throw new NoMoreIceCreamException("No more Rocket in the stock");
        }
    }

    private IceRocket prepareRocket() {
        this.profit += this.priceList.getRocketPrice();
        this.stock.setIceRockets(1);
        return new IceRocket();
    }

    public Magnum orderMagnum(MagnumType magnumType) throws NoMoreIceCreamException {
        if (this.stock.getMagni() > 0) {
            return this.prepareMagnum(magnumType);
        } else {
            throw new NoMoreIceCreamException("No more Magnum in the stock");
        }
    }

    private Magnum prepareMagnum(MagnumType magnumType) throws NoMoreIceCreamException {
        while(this.stock.getMagni() > 0) {
        }

        this.profit += this.priceList.getMagnumStandardPrice(magnumType);
        return new Magnum(magnumType);
    }

    public double getProfit() {
        return this.profit;
    }

    public String toString() {
        return "IceCreamCar{priceList=" + this.priceList + ", stock=" + this.stock + ", profit=" + this.profit + "}";
    }

        }




