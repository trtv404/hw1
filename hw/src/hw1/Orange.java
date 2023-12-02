package hw1;

public class Orange extends Product {
    public Orange(int id, String type, double price) {
        super(id, type, price);
    }
    @Override
    public String toString() {
        return String.format("у апельсина: %s, %s", getName(), getPrice());
    }
}
