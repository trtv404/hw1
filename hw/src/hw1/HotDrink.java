package hw1;

public class HotDrink extends Product {
    public HotDrink(String type, double price, int volume, int temperature){
        super(type, price, volume, temperature);
    }
    @Override
    public String toString() {
        return String.format("напиток: %s, %s", getName(), getVolume());
    }
}
