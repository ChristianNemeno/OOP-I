package Interface;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Create characters
        Character warrior = new Warrior("Conan", 100);
        Character mage = new Mage("Gandalf", 80);

        // Create items
        Item sword = new Sword();
        Item potion = new HealingPotion();

        // Characters perform actions
        warrior.attack(mage);  // Conan attacks Gandalf
        mage.defend();          // Gandalf defends
        mage.useItem(potion);   // Gandalf uses healing potion

        warrior.useItem(sword); // Conan uses a sword to increase attack
        warrior.attack(mage);   // Conan attacks again with the sword

        // Print their health
        System.out.println(warrior.getStatus());
        System.out.println(mage.getStatus());
    }
}