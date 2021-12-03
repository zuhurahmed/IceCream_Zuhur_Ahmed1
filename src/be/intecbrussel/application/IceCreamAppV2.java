package be.intecbrussel.application;

import java.util.Arrays;
import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.seller.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {


        new PriceList(2.0, 1.5, 2.5);
        Stock stock = new Stock(4, 1, 3, 1);
        IceCreamSeller iceCreamCar = new IceCreamCar(100.0D, stock);
        System.out.println("  you can order some IceCream in here: ");
        System.out.println("ValueOfIceCream:Profit of the IceCreamCar: " + iceCreamCar.getProfit( ) + " €");
        System.out.println("value of the Ice rockets/magnum/balls in the stock: ");

        try {
            Eatable[] orders = new Eatable[]{iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE,
                    Cone.Flavor.MOKKA}),
                    iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS.MILKCHOCOLATE),
                    iceCreamCar.orderIceRocket( )};
            //System.out.println(Arrays.toString(orders));
        } catch (Exception e) {
            System.out.println(e.getMessage( ));
        }


    }

}
