package Interface;

public class HealingPotion implements  Item{

    public void use(Character character){
        character.health += 20;

    }
}
