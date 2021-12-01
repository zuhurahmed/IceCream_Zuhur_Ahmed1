package be.intecbrussel.seller;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller extends Profitable {
        Cone orderCone(Cone.Flavor[] balls) throws NoMoreIceCreamException;

        IceRocket orderIceRocket() throws NoMoreIceCreamException;

        Magnum orderMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamException;
    }
