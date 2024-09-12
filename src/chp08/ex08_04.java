package chp08;

public class ex08_04 {
    public static void main(String[] args) {
        Avenger thor = new Avenger("토르", 150);
        Avenger thanos = new Avenger("타노스", 160);

        thor.punch(thanos);
        thanos.punch(thor);
    }
}

class Avenger {
    String name;
    private int hp;

    Avenger(String s, int i) {
        name = s;
        hp = i;
    }

    void punch(Avenger enemy) {
        System.out.println(name + "의 펀치를 날아갔다!");
        enemy.hp -= 10;
        System.out.printf(" -> %s의 채력: %d\n", enemy.name, enemy.hp);
    }
}