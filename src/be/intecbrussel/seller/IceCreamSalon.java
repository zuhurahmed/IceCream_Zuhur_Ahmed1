package be.intecbrussel.seller;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

    public class IceCreamSalon implements IceCreamSeller {
        private PriceList priceList;
        private double totalProfit;

// Constructor
        public IceCreamSalon(PriceList priceList) {
            this.priceList = priceList;
        }

        //Not Equal (!=)
        // balls/ priceList > 0
        @Override
        public Cone orderCone(Cone.Flavor[] balls) {
            if (balls != null && priceList != null) {
                totalProfit += balls.length * priceList.getBallPrice( );
            }
            return new Cone(balls);
        }

        //+=increment value of variable by more than 1
        //order new ice rocket
        @Override
        public IceRocket orderIceRocket() throws NoMoreIceCreamException {
            if (totalProfit > 0) {
                totalProfit += priceList.getRocketPrice( );
                return new IceRocket( );
            } else
                throw new NoMoreIceCreamException( );

        }

        @Override
        public Magnum orderMagnum(Magnum.MagnumType magnumType) {
            if (magnumType.getPriceMultiplierByMagnumType( ) > 0) {
                totalProfit += priceList.getMagnumStandardPrice(magnumType);
            }
                return new Magnum(magnumType);
        }

        @Override
        public double getProfit() {
            if (totalProfit >= 0) {
                return this.totalProfit;
            }else
                throw new NoMoreIceCreamException( " TotalProfit > 0 " );
        }
        @Override
        public String toString() {
            return String.format("hello everyone i would like welcome you\n to my IceCream Salon we have different flavors:" +
                            " in our IceCream Salon so you can choose \nto your liking btw our ice cream are delicious and\n " +
                            "thank you for ordering from us\n"+ "IceCreamSalon", "");
        }
    }

