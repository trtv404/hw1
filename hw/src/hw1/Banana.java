package hw1;

public class Banana extends Product {
    public Banana(int id, String type, double price) {
        super(id, type, price);
    }
    @Override
    public String toString() {
        return String.format("У банана: %s, %s", getName(), getPrice());
    }
}
