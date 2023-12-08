// [1.2]Implementing Thief character classes

public class Thief implements RPGCharacter {
    String name;
    int HP;
    int speed;
    int attack;
    int position;

    public int getHP(){   // postcondition : HP ของตัวละคร
        return HP;
    }
    public int getPosition(){   // postcondition : position ของตัวละคร
        return position;
    }
    public String getName(){   // postcondition :name ของตัวละคร
        return name;
    }


    /**
     *
     * @param name : รับชื่อของผู้เล่นที่เป็นโจร
     * @param HP : ระดับพลังชีวิต เมื่อเลือกอาชีพนี้
     * @param speed : ความเร็วของอาชีพนี้
     * @param attack : พลังโจมตีเมื่อเลิอกอาชีพนี้
     * @param position : ตำเเหน่งที่จะเริ่ม action โดยจะ default เป็นจุดเริ่มต้นก่อน
     */
    public Thief(String name, int HP, int speed, int attack, int position) {
        this.name = name;
        this.HP = HP;
        this.speed = speed;
        this.attack = attack;
        this.position = position;
    }


    @Override
    public void attacked() {   // เมื่อเรียกใช้จะลดค่า speed เเละ HP ของตัวละครลดลง
        speed -= 5;
        HP -= 10;
        System.out.println(name + " attacks!");
    }

    @Override
    public void run() {   // เมื่อเรียกใช้จะลดค่า speed เเละ HP ของตัวละครลดลง
        position += 10;
        System.out.println(name + " is running.");
    }

    @Override
    public void useBuff() {// เมื่อเรียกใช้เพิ่มค่า attack ของตัวละคร
        attack += 10;
        System.out.println(name + " uses a buff.");
    }

    @Override
    public void calculateDistance() {// เมื่อเรียกใช้จะเพิ่มขยับ position ของตัวละคร
        position += speed;
        System.out.println(name + " calculates distance.");
    }
}