
package model;


public class Client {
    String name;
    public Client(String n){
        this.name = n;
    }
    @Override
    public String toString(){
            return this.name;
    }
}
