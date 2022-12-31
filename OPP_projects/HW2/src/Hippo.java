package OPP_projects.HW2.src;

public class Hippo extends Animal implements Speakable,Runable, Swimmable {

    public Hippo(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String toString() {
        return "Hippo" + super.toString();
    }

    @Override
    public String speak() {
        return "Hippo's voice: Rrrrrrr";
    }

    @Override
    public int runSpeed() {
        return 30;
    }


    @Override
    public int swimSpeed() {
        return 10;
    }
}
