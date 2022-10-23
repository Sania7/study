package test.job4j.icecrem;

public class IceCream {
    private int weight;  // вес мороженого

    public IceCream(int weight) { // конструктор
        this.weight = weight;
    }

    public int price() { // подсчет цены мороженого
        return weight * 100;
    }
}
