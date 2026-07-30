package foodmartFolder;


public class foodmart {
    public static void main(String[] args) {
        wetFoods wetFood1 = new wetFoods();
        wetFoods wetFood2 = new wetFoods();
        dryFoods dryFood1 = new dryFoods();
        dryFoods dryFood2 = new dryFoods();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        wetFood1.wetFoods("Salmon", 15.99, 10);
        wetFood2.wetFoods("Tuna", 12.99, 15);
        dryFood1.dryFoods("Rice", 2.99, 50);
        dryFood2.dryFoods("Beans", 1.99, 30);

        System.out.println("FoodMart Inventory:"    );
        System.out.println("Wet Foods:");
        System.out.println("- " + wetFood1.name + ": $" + wetFood1.price + " (Quantity: " + wetFood1.quantity + ")");
        System.out.println("- " + wetFood2.name + ": $" + wetFood2.price + " (Quantity: " + wetFood2.quantity + ")");
        System.out.println("Dry Foods:");
        System.out.println("- " + dryFood1.name + ": $" + dryFood1.price + " (Quantity: " + dryFood1.quantity + ")");
        System.out.println("- " + dryFood2.name + ": $" + dryFood2.price + " (Quantity: " + dryFood2.quantity + ")");
    }
}
