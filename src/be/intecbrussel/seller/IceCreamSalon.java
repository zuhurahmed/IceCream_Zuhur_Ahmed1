package be.intecbrussel.seller;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

    public class IceCreamSalon implements IceCreamSeller {
        private PriceList priceList;
        private double totalProfit;



        public IceCreamSalon(PriceList priceList) {
            this.priceList = priceList;
        }

        //Not Equal (!=)
        @Override
        public Cone orderCone(Cone.Flavor[] balls) {
            if (balls != null && priceList != null) {
                totalProfit += balls.length * priceList.getBallPrice();

            }
            return new Cone(balls);
        }
        //+=increment value of variable by more than 1
        //order new ice rocket
        @Override
        public IceRocket orderIceRocket() throws NoMoreIceCreamException {
            totalProfit += priceList.getRocketPrice();
            return new IceRocket();
        }

        @Override
        public Magnum orderMagnum(Magnum.MagnumType magnumType) {
            totalProfit += priceList.getMagnumStandardPrice(magnumType);
            return new Magnum(magnumType);
        }

        @Override
        public double getProfit() {
            return this.totalProfit;
        }

        @Override
        public String toString() {
            return String.format("hello everyone i would like \" +\n" +
                    "                    \" welcome you\\n to my IceCream Salon\\nwe have different \" +\n" +
                    "                    \"flavors \\n in our IceCream Salon so\\n you can choose \" +\n" +
                    "                    \"to your liking btw our ice cream are delicious and\\nthank you for ordering from us\")\n" +
                    "                    \"IceCreamSalon"+ "");
        }
    }

