package test.job4j.icecrem;

import test.job4j.icecrem.IceCream;

public class IceCreamPlusJam extends IceCream {
    private static final int JAM_PRICE = 50; // константа цены джема


    public IceCreamPlusJam(int weight) {
        super(weight);
    }

    @Override
    public int price() { // подсчет мороженого с джемом
        return JAM_PRICE + super.price();
    }
}
