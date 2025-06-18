package code11_17;

public class Fool extends Character implements Human {
    //Caracterからhpやnameなどのフィールドを継承している
    //Caracterから継承した抽象メソッドattack()を実装している

    int hp;

    public Fool(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void attack(Matango m) {
        System.out.println(this.name + "は戦わず遊んでいる");
    }

    public void talk() {
        System.out.println(this.name + "意味のないことを話した");
    }

    public void watch() {
        System.out.println(this.name + "は虚空を見つめている");
    }

    public void hear() {
        System.out.println(this.name + "は誰かの声を聴いた気がした");
    }

    public void run() {
        System.out.println(this.name + "は大笑いしながら逃げ出した！");
    }
}
