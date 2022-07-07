
package model;

public class Food {
 Macronutrients kcals;
 
 private double foodQuantity;
 private String foodName;
 
 private double totalCarb;
 private double totalFat;
 private double totalProt;
 private double totalCalories;
 
    
  
    public Food(String foodName, double qt,double carb, double protein, double fat){
        this.kcals = new Macronutrients(qt,carb,protein,fat);
    }
    
    private double proteinByQuantity ( double qt){
        return (qt/this.kcals.getQuantity())*(this.kcals.getProtein());
    }
    private double carbohydrateByQuantity( double qt){
        return (qt/this.kcals.getQuantity())*(this.kcals.getProtein());
    }
    private double fatByQuantity ( double qt){
        return (qt/this.kcals.getQuantity())*(this.kcals.getFat());
    }
    private double kcalByQuantity ( double qt){
        return (qt/this.kcals.getQuantity())*(this.kcals.getCalories());
    }
    public String getName(){
        return this.foodName;
   }
   public void setFoodQuantity(double qt){
        this.foodQuantity = qt;
        this.totalCalories = kcalByQuantity(qt);
        this.totalCarb = carbohydrateByQuantity(qt);
        this.totalFat = fatByQuantity(qt);
        this.totalProt = proteinByQuantity(qt);
   }
   
   public double getProtein(){
       return this.totalProt;
   }
   
   public double getFat(){
       return this.totalFat;
   }
   public double getCarb(){
       return this.totalCarb;
   }
   public double getCalories(){
       return this.totalCalories;
   }
   public double getFoodQuantity(){
       return this.foodQuantity;
   }

}
