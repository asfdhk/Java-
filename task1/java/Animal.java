abstract public class Animal {

    private  int weight;
    private String color;
    private String ration;

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", ration='" + ration + '\'' +
                '}';
    }

    public Animal(int weight,String color,String ration){
        this.weight = weight;
        this.color = color;
        this.ration = ration;
    }

    public abstract void getVoice();

    public abstract void eat();

    public abstract void sleep();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }
}
