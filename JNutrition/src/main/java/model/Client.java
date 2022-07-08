
package model;
import java.util.Locale;


public class Client {
    String name;
    String id;
    int age;
    double height, weight, lArm, rArm,lTight,rTight, waist;

    public Client(String name, String id, int age, double height, double weight, double lArm, double rArm, double lTight, double rTight, double waist) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.lArm = lArm;
        this.rArm = rArm;
        this.lTight = lTight;
        this.rTight = rTight;
        this.waist = waist;
    }

   
    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getlArm() {
        return lArm;
    }

    public void setlArm(double lArm) {
        this.lArm = lArm;
    }

    public double getrArm() {
        return rArm;
    }

    public void setrArm(double rArm) {
        this.rArm = rArm;
    }

    public double getlTight() {
        return lTight;
    }

    public void setlTight(double lTight) {
        this.lTight = lTight;
    }

    public double getrTight() {
        return rTight;
    }

    public void setrTight(double rTight) {
        this.rTight = rTight;
    }

    public double getWaist() {
        return waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }
    
    @Override
    public String toString(){
        return "Nome: " + name + "      ID: " + id + "       Idade: " + age +
                "\nAltura: " + String.format("%.2f",height) + "       Peso: " + String.format("%.2f",weight) + 
                "\nBraço esquerdo: " + String.format("%.2f",lArm) + "    Braço direito: " + String.format("%.2f",rArm) +
                "   Coxa esquerda: " + String.format("%.2f",lTight) + "     Coxa direita: " + String.format("%.2f",rTight) +
                "   Quadril: " + String.format("%.2f",waist);
    }
}
