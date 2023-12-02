//Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
//        1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//        2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
//        реализовать перегруженный метод getProduct(String name, int volume, int temperature),
//        выдающий продукт соответствующий имени, объёму и температуре
//        3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
//        воспроизвести логику, заложенную в программе
//        4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
package hw1;

public class Main {
    public static void main(String[] args) {
        Vending vending = new FruitVending();
        Vending new_vending = new HotDrinkVending();

        Product product1 = new Apple(1, "Apple", 20);
        Product product2 = new Orange(2, "Orange", 30);
        Product product3 = new Banana(3, "Banana", 25);

        vending.addProduct(product1);
        vending.addProduct(product2);
        vending.addProduct(product3);
        System.out.println("--фрукты с семинара--");

        Product drink1 = new HotDrink("Капучино", 99.99, 350, 100);
        Product drink2 = new HotDrink("Капучино", 59.99, 180, 100);
        Product drink3 = new HotDrink("Американо", 59.99, 350, 85);
        Product drink4 = new HotDrink("Эспрессо", 69.99, 80, 95);

        new_vending.addProduct(drink1);
        new_vending.addProduct(drink2);
        new_vending.addProduct(drink3);
        new_vending.addProduct(drink4);

        System.out.println(vending.getProduct("Apple"));
        System.out.println(vending.getProduct(5));
        System.out.println("---напитки----");
        System.out.println(new_vending.getProduct("Американо"));
        System.out.println(new_vending.getProduct("Капучино", 100));
        System.out.println(new_vending.getProduct("Капучино", 350));

    }
}

