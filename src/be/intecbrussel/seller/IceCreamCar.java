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
    }

    @Override
    public Cone orderCone(Cone.Flavor[] balls) throws NoMoreIceCreamException {
       // Cone prepareCone = new Cone(balls);
        return prepareCone(balls);

    }

    // return prepareRocket
    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        //IceRocket iceRocket= new IceRocket();
        return prepareRocket( );
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamException {
       //Magnum magnum= new Magnum( magnumType);
        return prepareMagnum(magnumType);
    }


    private IceRocket prepareRocket() {
        if (stock.getIceRockets( ) > 1) {
            profit += stock.getIceRockets( ) * priceList.getRocketPrice( );
            return new IceRocket( );
        } else {
            throw new NoMoreIceCreamException(" No more Rocket in the stock");
        }
    }

    private Magnum prepareMagnum(Magnum.MagnumType magnumType) {
        if (stock.getMagni( ) > 0) {
            profit += priceList.getMagnumStandardPrice(magnumType);
            return new Magnum(magnumType);
        } else {
            throw new NoMoreIceCreamException(" No more Magnum in the stock");

        }
    }

    private Cone prepareCone(Cone.Flavor[] balls) {
        if (stock.getCones( ) > 1 && stock.getBalls( ) > 1) {
            profit += stock.getBalls( ) * priceList.getBallPrice( );
            return new Cone(balls);
        } else {
            throw new NoMoreIceCreamException("No more balls/Cone in the stock");
        }
    }

    @Override
    public double getProfit() {
        if (profit >= 0) {
            return profit;
        } else
            throw new NoMoreIceCreamException( );

    }

    public Stock getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return String.format("This is my IceCreamCar because\n" +
                " of the covid19\nwe didn't sell a lot of ice cream but\n" +
                " we hope the situation\n will become normal and by the way\n" +
                " our ice cream are delicious and\nthank you for ordering from us" + "");
    }

}


