package interfaces;

public class Peer implements Info {
    public String name;

    public Peer(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + this.name);
    }
}