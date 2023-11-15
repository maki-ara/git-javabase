// Player.java (package1に保存)
package package1;

import java.util.Random;

public class Player {
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int agility;
    private int defense;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void generateRandomStats() {
        Random random = new Random();
        this.hp = random.nextInt(1000) + 1;
        this.mp = random.nextInt(1000) + 1;
        this.attack = random.nextInt(500) + 1;
        this.agility = random.nextInt(1000) + 1;
        this.defense = random.nextInt(50) + 1;
    }
}