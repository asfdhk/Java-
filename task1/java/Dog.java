public class Dog extends Animal{

    private String name ;

    public Dog(String name,int weight, String color, String ration) {
        super(weight, color, ration);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + getWeight() +
                ", color='" + getColor() + '\'' +
                ", ration='" + getRation() + '\'' +
                '}';
    }

    @Override
    public void getVoice() {
        System.out.println("huhuhuhu");
    }

    @Override
    public void eat() {
        System.out.println("Dog " + getName() + " go to eat:" +getRation());
    }

    @Override
    public void sleep() {
        System.out.println("Dog" + getName()+" go to sleep");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
