
package model;
import java.util.Locale;
import javax.swing.JOptionPane;


public class Client {
    private String name, id;
    private int age;
    private Measurements m1;

    public Client(String name, String id, int age, Measurements m1) {
        if (validar(name, id, age)) {
            this.name = "Inválido";
            this.id = "Inválido";
            this.age = 0;
            this.m1 = new Measurements (1,1,1,1,1,1,1);
            JOptionPane.showMessageDialog(null, "Dados invalidos");
    }
        else {
            this.name = name;
            this.id = id;
            this.age = age;
            this.m1 = m1;
        }
    }
    
    private boolean validar(String name, String id, int age) {
        return name.isBlank() || id.isBlank()  || age < 0;
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

    @Override
    public String toString(){
        return "Nome: " + name + "      ID: " + id + "       Idade: " + age + "\n" + m1.toString();
    }
}
