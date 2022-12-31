package OPP_projects.HW2.src;

public class Cat extends Animal implements Speakable,Runable {

    public Cat(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }

    @Override
    public String speak() {
        return "Cat's voice: Meow";
    }

    @Override
    public int runSpeed() {
        return 50;
    }


}
