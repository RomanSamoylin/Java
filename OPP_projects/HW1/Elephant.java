package OPP_projects.HW1;

public class Elephant extends Animal {

    private int trunkLength;

    public Elephant() {
        super();
        trunkLength = 2;
    }

    public Elephant(String name) {
        super(name);
    }

    public int getBreed() {
        return trunkLength;
    }

    @Override
    public String toString() {
        return String.format("%s Trunk Length: %d",super.toString(),trunkLength);
    }

    @Override
    public void voice() {
        System.out.println("Elephant's voice: Snorts snorts");
    }

}
    

