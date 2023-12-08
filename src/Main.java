import java.util.Scanner;

interface RPGCharacter {
    void attacked();
    void run();
    void useBuff();
    void calculateDistance();
    int getHP();
    String getName();
    int getPosition();
}
interface Accessory {
    void applyEffect(RPGCharacter character);
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RPGCharacter p = new Police("Officer Smith", 100, 10, 15, 0);
        RPGCharacter t = new Thief("Sneaky Pete", 80, 15, 20, 10);

        // 1st decision : character
        System.out.println("Choose character: P for Police, T for Thief");
        String choice = scanner.nextLine();
        RPGCharacter selectedCharacter = (choice.equalsIgnoreCase("P")) ? p : t;

        // create Accessory in the game
        Accessory weapon = new Weapon("Gun");
        Accessory vehicle = new Vehicle("Scooter");
        Accessory dopeDrink = new DopeDrink("M150");

        // 2nd decision : accessory
        System.out.println("Choose accessory: W for Weapon, V for Vehicle, D for Dope Drink");
        choice = scanner.nextLine();
        Accessory selectedAccessory = switch (choice.toUpperCase()) {
            case "W" -> weapon;
            case "V" -> vehicle;
            case "D" -> dopeDrink;
            default -> null;
        };


        System.out.println("***************************");

        System.out.println("You wins!");

    }
}
