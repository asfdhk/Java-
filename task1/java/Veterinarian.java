public class Veterinarian {
    private String name;

    public Veterinarian(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                '}';
    }

    public void treatment(Animal animal){
        System.out.println("Treatment " + animal );
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
