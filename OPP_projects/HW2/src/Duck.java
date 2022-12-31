package OPP_projects.HW2.src;

public class Duck extends Animal implements Speakable,Runable,Flyable, Swimmable {

    public Duck(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 40;
    }

    @Override
    public int runSpeed() {
        return 5;
    }

    @Override
    public String speak() {
        return "Duck's voice: Krya";
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }

    @Override
    public int swimSpeed() {
        return 5;
    }
}
