// Implementing accessory classes

    public class DopeDrink implements Accessory {
        private String name;

        public DopeDrink(String name) {
            this.name = name;
        }

        @Override
        public void applyEffect(RPGCharacter character) { // บอกว่ามีการใช้  DopeDrink ที่สร้างรึยัง

            System.out.println("Applying " + name + " to " + character.getClass().getSimpleName());
        }
    }


