class Zombie extends Entity {
    float speed;

    Zombie(int y) {
        super(8, y, 10, 'Z');
        this.speed = 0.5f;
    }

    void move() {
        if (Math.random() < speed) {
            x--;
        }
    }
}