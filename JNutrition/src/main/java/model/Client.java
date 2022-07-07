
package model;


public class Client {
    String name;
    String id;

    public Client(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString(){
            return this.name;
    }
}
