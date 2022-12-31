package OPP_projects.HW2.src;

public class Dog extends Animal implements Speakable,Runable, Swimmable {

    public Dog(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }

    @Override
    public String speak() {
        return "Dog's voice: Bark";
    }

    @Override
    public int runSpeed() {
        return 65;
    }

    @Override
    public int swimSpeed() {
        return 3;
    }
}
