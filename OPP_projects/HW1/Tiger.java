package OPP_projects.HW1;

public class Tiger extends Animal {

    private String type;

    public Tiger() {
        super();
        type = "DefaultType";

    }

    public Tiger(String name) {
        super(name);
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%s Type: %s",super.toString(),type);
    }

    @Override
    public void voice() {
        System.out.println("Tiger's voice: Roar roar");
    }
}
