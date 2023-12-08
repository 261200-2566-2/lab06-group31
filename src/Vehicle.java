class Vehicle implements Accessory {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public void applyEffect(RPGCharacter character) {    // บอกว่ามีการใช้ vehicle ที่สร้างรึยัง
        // Implement applyEffect logic for vehicle
        System.out.println("Applying " + name + " to " + character.getClass().getSimpleName());
    }
}