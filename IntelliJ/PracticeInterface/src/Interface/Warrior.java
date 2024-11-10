package Interface;

public class Warrior extends Character{

    public Warrior(String name , int health){
        super(name, health);
    }
    @Override
    public void attack(Character character){
        character.health -= this.attackPower;
    }
    @Override
    public void defend(){
        this.health += 10;
    }
}
