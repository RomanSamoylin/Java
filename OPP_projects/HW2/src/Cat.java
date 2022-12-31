package OPP_projects.HW2.src;

import java.io.IOException;
import java.nio.CharBuffer;

public class Cat extends Animal implements Speakable,Readable {

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

    @Override
    public int read(CharBuffer cb) throws IOException {
        // TODO Auto-generated method stub
        return 0;
    }


}
