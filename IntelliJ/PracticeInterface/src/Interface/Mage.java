package Interface;

public class Mage extends Character{

    public Mage(String name, int health){
        super(name,health);
    }

    @Override
    public void attack(Character character){
        character.health -= this.attackPower;
    }
    @Override
    public void defend(){
        this.health += 5;

    }

}
