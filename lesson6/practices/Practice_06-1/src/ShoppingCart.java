public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        item1.description = "description 1";
        item2.description = "description 2";


        item1 = item2;
        System.out.print(item1.description);
        System.out.print(item2.description);
    }
}
