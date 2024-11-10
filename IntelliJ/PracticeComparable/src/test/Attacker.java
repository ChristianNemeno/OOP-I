package test;

public interface Attacker {
    // Generic attack method that should not be overridden
    default int attack() {
        // Print the object and "attacks"
        System.out.print(this + " attacks ");
        // Return the damage provided by getDamage method
        return getDamage();
    }

    // Method that the implementing classes will have to provide
    int getDamage();
}
