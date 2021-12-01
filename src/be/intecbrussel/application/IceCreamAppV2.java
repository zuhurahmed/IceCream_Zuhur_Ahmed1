package be.intecbrussel.application;

import java.util.Arrays;
import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.seller.*;

public class IceCreamAppV2 {
        public static void main(String[] args)   {
            // Use IceCreamCar instantie-- C-salon
            PriceList priceList = new PriceList(2, 1.5, 2.5);
            Stock stock = new Stock(4, 1, 3, 1);
            IceCreamSeller iceCreamCar = new IceCreamCar(100, stock);



            //
            var iceCreamSeller = iceCreamCar;
            Eatable[] orders = new Eatable[]{};
            try {
                Eatable[] orders1 =
                        {iceCreamSeller.orderCone( new Cone.Flavor[]{Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.MOKKA}),
                                iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINENUTS),
                                iceCreamSeller.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE), iceCreamSeller.orderIceRocket()};
                orders =orders1;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }


            System.out.println("ValueOfIceCream");
            System.out.println("Profit of the IceCreamCar: " + iceCreamCar.getProfit() + " €");
            System.out.println("Value of the balls in the stock: " + iceCreamCar);
            System.out.println("Value of the cones in the stock: " + iceCreamCar.orderCone(Cone.Flavor.values()));
            System.out.println("value of the Ice rockets in the stock: " + iceCreamCar.orderIceRocket());
            System.out.println("value of the Magnums in the stock: " + iceCreamCar.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE));
        }


    }








