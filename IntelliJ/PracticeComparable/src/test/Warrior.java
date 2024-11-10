package test;

import test.Attacker;

public class Warrior implements Attacker {
    private String name;
    private int damage;

    public Warrior(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return name;
    }

    // Implementation of getDamage to provide custom damage
    @Override
    public int getDamage() {
        return damage;
    }

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Aragorn", 30);
        System.out.println("Damage dealt: " + warrior.attack());
    }
}
