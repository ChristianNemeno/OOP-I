import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PlantsVsZombies {
    static final int ROWS = 5;
    static final int COLS = 9;
    static List<Plant> plants = new ArrayList<>();
    static List<Zombie> zombies = new ArrayList<>();
    static char[][] grid = new char[ROWS][COLS];
    static boolean gameOver = false;

    public static void main(String[] args) {
        initializeGame();

        while (!gameOver) {
            updateGame();
            renderGame();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Game Over!");
    }

    static void initializeGame() {
        plants.add(new Plant(4, 2));
        plants.add(new Plant(0, 1));
        plants.add(new Plant(0, 3));
        plants.add(new Plant(0, 4));

        plants.add(new Sunflower(1, 1));
        zombies.add(new Zombie(2));
        zombies.add(new Zombie(2));
        zombies.add(new Zombie(2));
        zombies.add(new Zombie(2));
        zombies.add(new Zombie(2));
    }

    static void updateGame() {
        // Move zombies
        for (Zombie zombie : zombies) {
            zombie.move();
            if (zombie.x < 0) {
                gameOver = true;
                return;
            }
        }

        // Plants attack
        for (Plant plant : plants) {
            if (plant instanceof Sunflower) {
                ((Sunflower) plant).generateSun();
            } else {
                for (Zombie zombie : zombies) {
                    if (plant.y == zombie.y && plant.x < zombie.x) {
                        zombie.hp--;
                        break;
                    }
                }
            }
        }

        // Zombies attack
        for (Zombie zombie : zombies) {
            for (Plant plant : plants) {
                if (zombie.x == plant.x && zombie.y == plant.y) {
                    plant.hp--;
                    break;
                }
            }
        }

        // Remove dead entities
        plants.removeIf(plant -> plant.hp <= 0);
        zombies.removeIf(zombie -> zombie.hp <= 0);

        // Spawn new zombie
        if (Math.random() < 0.1) {
            zombies.add(new Zombie((int) (Math.random() * ROWS)));
        }

        // Check if all plants are dead
        if (plants.isEmpty()) {
            gameOver = true;
        }
    }

    static void renderGame() {
        // Clear grid
        for (int i = 0; i < ROWS; i++) {
            Arrays.fill(grid[i], '.');
        }

        // Place entities on grid
        for (Plant plant : plants) {
            grid[plant.y][plant.x] = plant.symbol;
        }
        for (Zombie zombie : zombies) {
            if (zombie.x >= 0 && zombie.x < COLS) {
                grid[zombie.y][zombie.x] = zombie.symbol;
            }
        }

        // Print grid
        System.out.println("\033[H\033[2J"); // Clear console
        for (int i = 0; i < ROWS; i++) {
            System.out.println(new String(grid[i]));
        }
        System.out.println("Plants: " + plants.size() + " Zombies: " + zombies.size());
    }
}