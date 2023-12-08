class Weapon implements Accessory {
    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    @Override
    public void applyEffect(RPGCharacter character) { // บอกว่ามีการใช้  Weapon ที่สร้างรึยัง
        // Implement applyEffect logic for weapon
        System.out.println("Applying " + name + " to " + character.getClass().getSimpleName());
    }
}