package OPP_projects.HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Zoo {

    List<Animal> animalList;

    public Zoo() {
        this.animalList = new ArrayList<>(Arrays.asList(new Geraffe(), new Tiger(), new Elephant()));
    }

    public Zoo(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public String toString() {
        String result = "";
        for (Animal animal : animalList) {
            result += animal.toString() + "\n"; 
        }
        return result;
    }

    public List<Animal> findByName(String name) {
        return finder(p->p.getName().equals(name));
    }

    private List<Animal> finder(Function<Animal, Boolean> f){
        List<Animal> result = new ArrayList<>();
        animalList.forEach(i -> {
            if (Boolean.TRUE.equals(f.apply(i)))
                result.add(i);
        });
        return result;
    }

}
