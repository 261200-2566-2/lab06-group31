// [1.1]Implementing Police character classes
public class Police implements RPGCharacter {

    String name;
    int HP;
    int speed;
    int attack;
    int position;

    /*
     * @param name : รับชื่อของผู้เล่นที่เป็นโจร
     * @param HP : ระดับพลังชีวิต เมื่อเลือกอาชีพนี้
     * @param speed : ความเร็วของอาชีพนี้
     * @param attack : พลังโจมตีเมื่อเลิอกอาชีพนี้
     * @param position : ตำเเหน่งที่จะเริ่ม action โดยจะ default เป็นจุดเริ่มต้นก่อน
     */


    public Police(String name, int HP, int speed, int attack, int position) {
        this.name = name;
        this.HP = HP;
        this.speed = speed;
        this.attack = attack;
        this.position = position;
    }


    public int getHP(){
        return HP;
    }

    public int getPosition(){
        return position;
    }

    public String getName(){
        return name;
    }

    @Override
    public void attacked() {
        speed -= 5;
        HP -= 10;
        System.out.println(name + " attacks!");
    }

    @Override
    public void run() {
        position += 10;
        System.out.println(name + " is running.");
    }

    @Override
    public void useBuff() {
        attack += 10;
        System.out.println(name + " uses a buff.");
    }

    //----------------------------------------------


    @Override
    public void calculateDistance() {
        position += speed;
        System.out.println(name + " calculates distance.");
    }

}

