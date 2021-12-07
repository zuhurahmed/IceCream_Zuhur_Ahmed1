package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.seller.IceCreamSalon;
import be.intecbrussel.seller.IceCreamSeller;
import be.intecbrussel.seller.NoMoreIceCreamException;
import be.intecbrussel.seller.PriceList;

public class IceCreamApp {

    public static void main(String[] args) throws NoMoreIceCreamException, Exception {
//IceCreamSalon
        PriceList priceList = new PriceList(1.2, 1.5, 2.5);
        IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);
        System.out.println(iceCreamSeller.toString() );

        // Eatable in Array+ orders Methode
        Cone.Flavor[] balls = {Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.MOKKA, Cone.Flavor.LEMON};
        Eatable orderOne = iceCreamSeller.orderCone(balls);
        Eatable orderTwo = iceCreamSeller.orderIceRocket( );
        Eatable orderThird = iceCreamSeller.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE);

        Eatable[] orders = new Eatable[]{orderOne, orderTwo, orderThird};
//Call eat methode 
// run through..
        for (Eatable iceCream : orders) {
            iceCream.eat( );
            //System.out.println(orders);
        }
            //total profit

            System.out.println("Total Profit: " + "€" + iceCreamSeller.getProfit( ));



        }
    }


