package test;

public class Test {
    public static void main(String[] args) {
        School jony = new Jony();
        School serg = new Serg();

        say(jony);
        say(serg);
        song(serg);
        song(jony);
    }

    public static void say(School peer) {
        peer.learn();
    }
    public static void song(School peer) {
        peer.sing();
    }
}
