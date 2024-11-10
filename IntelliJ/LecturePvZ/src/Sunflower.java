class Sunflower extends Plant {
    int sunCounter = 0;

    Sunflower(int x, int y) {
        super(x, y);
        this.symbol = 'S';
    }

    void generateSun() {
        sunCounter++;
        if (sunCounter >= 3) {
            sunCounter = 0;
            return; // In a full game, we would add sun to the player's resources here
        }
    }
}