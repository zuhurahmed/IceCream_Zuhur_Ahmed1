package be.intecbrussel.application;

import java.util.Arrays;
import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.seller.*;

public class IceCreamAppV2 {
        public static void main(String[] args)   {
           
            
        new PriceList(2.0D, 1.5D, 2.5D);
        Stock stock = new Stock(4, 1, 3, 1);
        IceCreamSeller iceCreamCar = new IceCreamCar(100.0D, stock);
        System.out.println("This is my IceCreamCar because\n of the covid19\nwe didn't sell a lot of ice cream but\n we hope the situation\n will become normal and by the way\n our ice cream are delicious and\nthank you for ordering from us");
        System.out.println("  you can order some IceCream in here: ");
        System.out.println("ValueOfIceCream:Profit of the IceCreamCar: " + iceCreamCar.getProfit() + " €");
        System.out.println("value of the Ice rockets/magnum/balls in the stock: ");

        try {
            Eatable[] orders = new Eatable[]{iceCreamCar.orderCone(new Flavor[]{Flavor.BANANA, Flavor.CHOCOLATE, Flavor.MOKKA}), iceCreamCar.orderMagnum(MagnumType.ALPINENUTS), iceCreamCar.orderMagnum(MagnumType.MILKCHOCOLATE), iceCreamCar.orderIceRocket()};
            System.out.println(Arrays.toString(orders));
        } catch (Exception var5) {
            System.out.println(var5.getMessage());
        }

    }
                
                
                
                
      








