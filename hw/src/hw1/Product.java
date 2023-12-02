package hw1;



public abstract class Product {
    private int id; // желательно использовать Long
    private String type;
    private double price;
    private int temperature;
    private int volume;
    // Для цены желательно использовать BigDecimal, он считает без каких-либо ограничений на максимальное число,
    // а так же считает без округление. Работает с числами как с массивом чисел.

    public Product(int id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public Product(String type, double price, int volume, int temperature) {
        this.type = type;
        this.price = price;
        this.volume = volume;
        this.temperature = temperature;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return type;
    }

    public void setName(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}