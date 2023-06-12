public class Main {
    public static void main(String[] args) {

        Cat lolo = new Cat("lolo",7,"black","fish");
        Dog lana = new Dog("lana",16,"white","meat");
        lana.eat();
        lolo.getVoice();
        lana.sleep();
        Veterinarian veterinarian = new Veterinarian("Bob");
        veterinarian.treatment(lolo);
    }
}