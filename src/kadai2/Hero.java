package kadai2;

public class Hero extends Character {

    /*public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }*/

    public void attack(Matango m) {
        System.out.println("敵に10のダメージを与えた");
        m.hp -= 10;
        if (m.hp < 0) m.hp = 0;
    }
}
