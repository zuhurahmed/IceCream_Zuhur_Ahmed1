package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.seller.*;

import java.util.Arrays;

public class IceCreamApp {

    public static void main(String[] args) throws NoMoreIceCreamException, Exception {
//IceCreamSalon
            PriceList priceList = new PriceList(1.2, 1.5, 2.5);
         IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);
         
            /// Eatable in Array+ orders Methode
            Cone.Flavor[] balls = {Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.MOKKA, Cone.Flavor.LEMON};
            Eatable orderOne = iceCreamSeller.orderCone(balls);
            Eatable orderTwo = iceCreamSeller.orderIceRocket();
            Eatable orderThird = iceCreamSeller.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE);
        
            Eatable[] orders = new Eatable[]{orderOne, orderTwo, orderThird};
//Call eat methode 

            for (Eatable iceCream : orders) {
                iceCream.eat();
              

            //total profit
         //System.out.println(Arrays.toString(balls));
        //System.out.println("Total Profit: " + "€" + iceCreamSeller.getProfit());
        
        System.out.println("hello everyone i would like  welcome you\n to my IceCream Salon\nwe have different flavors \n in our IceCream Salon so\n you can choose to your liking btw our ice cream are delicious and\nthank you for ordering from us");
                

        }
    }
}

