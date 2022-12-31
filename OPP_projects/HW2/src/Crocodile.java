package OPP_projects.HW2.src;

public class Crocodile extends Animal implements Speakable,Swimmable {

    public Crocodile(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "Crocodile's voice: Grunt";
    }

    @Override
    public String toString() {
        return "Crocodile" + super.toString();
    }

    @Override
    public int swimSpeed() {
        return 20;
    }
}
