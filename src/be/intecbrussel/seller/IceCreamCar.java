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

        // Constructor with two a parameters
        public IceCreamCar(double profit, Stock stock) {
            this.profit = profit;
            this.stock = stock;

        }

        @Override
        public Cone orderCone(Cone.Flavor[] balls) throws NoMoreIceCreamException {
            if (stock.getBalls() >= balls.length && stock.getCones() > 0) {
                return prepareCone(balls);
            } else {
                throw new NoMoreIceCreamException("No more Cones or balls in stock");
            }
        }


        //private
        private Cone prepareCone(Cone.Flavor[] balls) throws NoMoreIceCreamException {
            return new Cone(balls);

        }

        //Override Methode
        @Override
        public IceRocket orderIceRocket() throws NoMoreIceCreamException {
            if (stock.getIceRockets() > 0) {
                return prepareRocket();
            } else
                throw new NoMoreIceCreamException("No more Rocket in the stock");
        }

        private IceRocket prepareRocket() {
            profit += priceList.getRocketPrice();
            stock.setIceRockets(1);
            return new IceRocket();
        }

        @Override
        public Magnum orderMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamException {
            if (stock.getMagni() > 0) {
                return prepareMagnum(magnumType);
            } else
                throw new NoMoreIceCreamException("No more Magnum in the stock");
        }

        private Magnum prepareMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamException {
            while (stock.getMagni( ) > 0) ;
            profit += priceList.getMagnumStandardPrice(magnumType);
            return new Magnum(magnumType);
        }

        @Override
        public double getProfit() {
            return this.profit;
        }


        }




