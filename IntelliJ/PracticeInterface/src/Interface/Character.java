package Interface;

public abstract class Character {
    protected   String name;
    protected int health;
    protected int attackPower;

    public Character(String name, int health){
        this.name = name;
        this.health = health;
        this.attackPower = 10;
    }

    abstract void attack(Character target);
    abstract void defend();

    public void useItem(Item item){
        item.use(this);
    }
    public String getStatus(){
        return this.name + "Health = " + this.health + ", attackPower = " + this.attackPower;
    }

}
