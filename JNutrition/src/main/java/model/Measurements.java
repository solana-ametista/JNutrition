package model;

import javax.swing.JOptionPane;

public class Measurements {
    private double height, weight, lArm, rArm,lTight,rTight, waist;

    public Measurements(double height, double weight, double lArm, double rArm, double lTight, double rTight, double waist) {
        if (verificar(height, weight, lArm, rArm,lTight,rTight, waist)){
            this.height = 0;
            this.weight = 0;
            this.lArm = 0;
            this.rArm = 0;
            this.lTight = 0;
            this.rTight = 0;
            this.waist = 0;
            JOptionPane.showMessageDialog(null, "Dados invalidos");
        }
        else {
            this.height = height;
            this.weight = weight;
            this.lArm = lArm;
            this.rArm = rArm;
            this.lTight = lTight;
            this.rTight = rTight;
            this.waist = waist;
        }
    }
    
    private boolean verificar(double height, double weight, double lArm, double rArm, double lTight, double rTight, double waist){
        return Double.compare(height, 0) == 0 || Double.compare(weight, 0) == 0 || Double.compare(lArm, 0) == 0 || Double.compare(rArm, 0) == 0 ||
                Double.compare(lTight, 0) == 0 || Double.compare(rTight, 0) == 0 || Double.compare(waist, 0) == 0;
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
        return  "\nAltura: " + String.format("%.2f",height) + "     Peso: " + String.format("%.2f",weight) + 
                "\nBraço esquerdo: " + String.format("%.2f",lArm) + "     Braço direito: " + String.format("%.2f",rArm) +
                "   Coxa esquerda: " + String.format("%.2f",lTight) + "     Coxa direita: " + String.format("%.2f",rTight) +
                "   Quadril: " + String.format("%.2f",waist);
    }

}
