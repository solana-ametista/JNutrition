
package model;


public class Macronutrients {
    
    // Every food has specific macronutrients in certain quantity.
    
    private double protein;
    private double carbohydrate;
    private double fat;
    private double quantity;
    private double calories;
    
   public Macronutrients(double qt,double c, double p, double f){
       this.quantity = qt;
       this.protein = p;
       this.carbohydrate = c;
       this.fat = f;
       calculateTotalKcal();
      
   }
    private void calculateTotalKcal(){
        //ACETO, Chris. Championship Bodybuilding. ASL Publications, 2001.
        this.calories = this.carbohydrate*4 + this.fat*9 + this.protein*4;
    }
    
    public double getCalories(){
        return this.calories;
    }
    public double getProtein(){
        return this.protein;
    }
    public double getCarb(){
        return this.carbohydrate;
    }
    public double getFat(){
        return this.fat;
    }
    public double getQuantity(){
        return this.quantity;
    }
}
