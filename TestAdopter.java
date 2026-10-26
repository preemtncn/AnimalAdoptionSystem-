
public class TestAdopter {
    public static void main(String[] args) {
        Adopter adopter1 =
            new Adopter("A001", "Preem", "0812345678");

        adopter1.displayInfo();

        System.out.println("Name using getter: " + adopter1.getName());
    }
}
