package Builder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MealBuilderTest {

    @Test
    void testMainDishOnly() {
        Meal meal = new Meal.MealBuilder("Burger").build();
        assertEquals("Burger", meal.getMainDish());
        assertNull(meal.getSideDish());
        assertNull(meal.getDrink());
        assertNull(meal.getDessert());
    }

    @Test
    void testCompleteMeal() {
        Meal meal = new Meal.MealBuilder("Pizza")
                .setSideDish("Fries")
                .setDrink("Soda")
                .setDessert("Cake")
                .build();
        assertEquals("Pizza", meal.getMainDish());
        assertEquals("Fries", meal.getSideDish());
        assertEquals("Soda", meal.getDrink());
        assertEquals("Cake", meal.getDessert());
    }

    @Test
    void testMealWithSideDishOnly() {
        Meal meal = new Meal.MealBuilder("Pasta")
                .setSideDish("Salad")
                .build();
        assertEquals("Pasta", meal.getMainDish());
        assertEquals("Salad", meal.getSideDish());
        assertNull(meal.getDrink());
        assertNull(meal.getDessert());
    }

    @Test
    void testMealWithDrinkOnly() {
        Meal meal = new Meal.MealBuilder("Burger")
                .setDrink("Juice")
                .build();
        assertEquals("Burger", meal.getMainDish());
        assertEquals("Juice", meal.getDrink());
        assertNull(meal.getSideDish());
        assertNull(meal.getDessert());
    }

    @Test
    void testMealWithDessertOnly() {
        Meal meal = new Meal.MealBuilder("Pizza")
                .setDessert("Ice Cream")
                .build();
        assertEquals("Pizza", meal.getMainDish());
        assertEquals("Ice Cream", meal.getDessert());
        assertNull(meal.getSideDish());
        assertNull(meal.getDrink());
    }

    @Test
    void testMainDishRequirement() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Meal.MealBuilder("").build();
        });
        assertEquals("Main dish is required.", exception.getMessage());
    }

    @Test
    void testSideDishModification() {
        Meal meal = new Meal.MealBuilder("Pasta")
                .setSideDish("Fries")
                .build();
        assertEquals("Fries", meal.getSideDish());
    }

    @Test
    void testDrinkModification() {
        Meal meal = new Meal.MealBuilder("Burger")
                .setDrink("Soda")
                .build();
        assertEquals("Soda", meal.getDrink());
    }

    @Test
    void testDessertModification() {
        Meal meal = new Meal.MealBuilder("Pizza")
                .setDessert("Cake")
                .build();
        assertEquals("Cake", meal.getDessert());
    }

    @Test
    void testInvalidMainDish() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Meal.MealBuilder(null).build();
        });
        assertEquals("Main dish is required.", exception.getMessage());
    }
}
