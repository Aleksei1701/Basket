public class Basket {
    private static String items = " ";
    public static void main(String[] args) {
        add("1кг тренаболона", 1300);
        add("1кг тестестерона", 300);
        add("Энергетик", 120);
        add("Шприц с асхабом тамаевом", 5300);
        add("Триамцинолон 5 пачек", 100);
        print("Содержимое корзины: ");
        clear();
        print("Содержимое корзины: ");
    }
    public static void add(String name, int price) {
        if(items.isEmpty()){
            items += name + " - " + price;
        } else {
            items += "\n" + name + " - " + price;
        }
    }
    public static void clear() {
        items = "";
    }
    public static void print(String title) {
        System.out.println(title);
        if(items.isEmpty()){
            System.out.println("Корзина пуста!");
        } else {
            System.out.println(items);
        }
    }
}
