public class Cat extends Animal{

    private String name;

    public Cat(String name ,int weight, String color, String ration) {
        super(weight, color, ration);
        this.name =name;
    }

    @Override
    public void getVoice() {
        System.out.println("mymymymymyymym");
    }

    @Override
    public void eat() {
        System.out.println("Cat" + getName() +" go to eat: " + getRation());
    }

    @Override
    public void sleep() {
        System.out.println("Cat" + getName()+" go to sleep");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
