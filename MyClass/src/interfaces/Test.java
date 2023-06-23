package interfaces;

public class Test {
    public static void main(String[] args) {
        Animal pet = new Animal(12);
        Peer person = new Peer("Jony");
        outputInfo(pet);
        outputInfo(person);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
