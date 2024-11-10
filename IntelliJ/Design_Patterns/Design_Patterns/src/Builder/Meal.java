package Builder;

public class Meal {
    private final String mainDish;
    private final String sideDish;
    private final String Drink;
    private final String Dessert;

    public Meal(MealBuilder builder){
        this.mainDish = builder.mainDish;
        this.sideDish = builder.sideDish;
        this.Drink = builder.Drink;
        this.Dessert = builder.Dessert;
    }
    public String getSideDish(){return this.sideDish;}
    public String getMainDish(){return this.mainDish;}
    public String getDrink(){return this.Drink;}
    public String getDessert(){return this.Dessert;}



    public static class MealBuilder {
        private String mainDish;
        private String sideDish;
        private String Drink;
        private String Dessert;


        public MealBuilder(String mainDish){
            if(mainDish == null || mainDish.isEmpty()){
                throw new IllegalArgumentException("Main dish is required.");
            }
            this.mainDish = mainDish;
        }

        public MealBuilder setSideDish(String sideDish){
            this.sideDish = sideDish;
            return this;
        }


        public MealBuilder setDrink(String Drink){
            this.Drink = Drink;
            return this;
        }

        public MealBuilder setDessert(String Dessert){
            this.Dessert = Dessert;
            return this;
        }

        public Meal build(){
            return new Meal(this);
        }



    }


}
