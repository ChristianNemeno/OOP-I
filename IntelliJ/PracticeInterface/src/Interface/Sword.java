package Interface;

public class Sword implements Item{

    @Override
    public void use(Character character){
        character.attackPower += 15;
    }
}
