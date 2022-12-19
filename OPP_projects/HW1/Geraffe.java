package OPP_projects.HW1;

public class Geraffe extends Animal {

    private int neckLength;

    public Geraffe() {
        super();
        neckLength = 3;

    }

    public Geraffe(String name) {
        super(name);
        this.neckLength = 3;

    }

    public int getNeckLength() {
        return neckLength;
    }

    @Override
    public String toString() {
        return String.format("%s NeckLength: %d",super.toString(), neckLength);
    }

    @Override
    public void voice() {
        System.out.println("Geraffe's voice: Hoow hoow");
    }

}
