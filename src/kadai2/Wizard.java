package kadai2;

public class Wizard extends Character {


    /*public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }*/


    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("魔法使いは火の玉を放った！");
        System.out.println("敵に7のダメージを与えた");
        m.hp -= 7;
        if (m.hp < 0) m.hp = 0;
    }
}
