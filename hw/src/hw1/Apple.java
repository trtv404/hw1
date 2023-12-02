package hw1;

public class Apple extends Product {
    public Apple(int id, String type, double price) {
        super(id, type, price);
    }

    @Override
    public String toString() {
        return String.format("у яблока: %s, %s", getName(), getPrice());
    }
}