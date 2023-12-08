// Implementing accessory classes

    public class DopeDrink implements Accessory {
        private String name;

        public DopeDrink(String name) {
            this.name = name;
        }

        @Override
        public void applyEffect(RPGCharacter character) { // บอกว่ามีการใช้  DopeDrink ที่สร้างรึยัง
            // Implement applyEffect logic for dope drink
            System.out.println("Applying " + name + " to " + character.getClass().getSimpleName());
        }
    }

public class DopeDrink implements Accessory {
    private String name;

    public DopeDrink(String name) {
        this.name = name;
    }
    // บอกว่ามีการใช้  DopeDrink ที่สร้างรึยัง
    @Override
    public void applyEffect(RPGCharacter character) {
        System.out.println("Applying " + name + " to " + character.getClass().getSimpleName());
    }
}

