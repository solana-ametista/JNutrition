
package model;
import java.util.List;
import java.util.ArrayList;

public class Meal {
    List<Food> foods;
    private double mealFat;
    private double mealCarb;
    private double mealProt;
    private double mealKcal;
    public Meal(){
        this.foods = new ArrayList<>();
        this.mealProt = 0;
        this.mealCarb = 0;
        this.mealFat = 0;
    }
    
    public void addFood(Food f){
        this.foods.add(f);
        calculateMealComposition();
    }
    
    private void calculateMealComposition(){
        
        for(Food f : foods){
            this.mealCarb += f.getCarb();
            this.mealFat += f.getFat();
            this.mealKcal += f.getCalories();
            this.mealProt += f.getProtein();
            
        }
        
    }
    
    public double getMealProtein(){
        return this.mealProt;
    }
    public double getMealFat(){
        return this.mealFat;
    }
    public double getMealCarb(){
        return this.mealCarb;
    }
    public double getMealCalories(){
        return this.mealKcal;
    }
    
}
