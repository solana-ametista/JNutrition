
package model;


public class Client {
    String name;
    String id;

    public Client(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public Client(String name) {
        this.name = name;
        this.id = "0000";
    }
    
    @Override
    public String toString(){
            return this.name;
    }
}
