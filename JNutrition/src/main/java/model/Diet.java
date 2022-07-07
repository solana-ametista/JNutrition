
package model;

import java.util.ArrayList;
import java.util.List;


public class Diet {
    private List<Meal> meals;
    private double dietCarb;
    private double dietFat;
    private double dietProt;
    private double dietKcals;
    
    
    public Diet(){
        this.meals = new ArrayList<Meal>();
        this.dietCarb = 0;
        this.dietFat = 0;
        this.dietProt = 0;
        this.dietKcals = 0;
    }
    public void addMeal(Meal m){
        this.meals.add(m);
    }
    public List getMeals(){
        return this.meals;
    }
    
    private void calculateDietComposition(){
        for(Meal m : meals){
            this.dietCarb += m.getMealCarb();
            this.dietFat += m.getMealFat();
            this.dietProt += m.getMealProtein();
            this.dietKcals += m.getMealCalories();
        }
    }
}
