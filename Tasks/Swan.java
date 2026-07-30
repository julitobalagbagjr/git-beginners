public class Swan {
    int numberOfEggs;
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberOfEggs = 1;
        System.out.println("The swan has " + mother.numberOfEggs + " egg(s).");
    }
}

class Name {
    String firstName;
    String lastName;
    String fullName = firstName + " " + lastName;
    public static void main(String[] args) {
        Name name1 = new Name();
        Soutr.println("The name is " + name1.fullName);
        name1.firstName = "John";
        name1.lastName = "Doe";
        name1.fullName = name1.firstName + " " + name1.lastName;
        System.out.println("The name is " + name1.fullName);
    }
}