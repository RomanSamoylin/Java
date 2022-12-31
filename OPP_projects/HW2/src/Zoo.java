package OPP_projects.HW2.src;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<Animal> animals = new ArrayList<>();

    public List<Animal> getAnimals() {
        return animals;
    }

    public Zoo addAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    @Override
    public String toString() {
        String result = "\nZoo members: \n";
        for (Animal animal : animals) {
            result += animal.toString() + "\n";
        }
        return result;
    }

    public String talk() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Speakable item : getSpeakable()) {
            stringBuilder.append(item.speak() + "\n");
        }
        return stringBuilder.toString();
    }

    private List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Speakable) {
                result.add((Speakable) item);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<Runable> getRunnable() {
        List<Runable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Runable) {
                result.add((Runable) item);
            }

        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> flyables = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Flyable) {
                flyables.add((Flyable) item);
            }
        }
        return flyables;
    }

    public List<Swimmable> getSwimmable() {
        List<Swimmable> swimmables = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Swimmable) {
                swimmables.add((Swimmable) item);
            }
        }
        return swimmables;
    }

    public String getChampionRunSpeed() {
        int max = 0;
        Runable maxRunSpeedAnimal = null;
        for (Runable item : getRunnable()) {
            if (item.runSpeed() > max) {
                max = item.runSpeed();
                maxRunSpeedAnimal = item;
            }
        }
        assert maxRunSpeedAnimal != null;
        return "Max run speed of " + maxRunSpeedAnimal.getClass().getName() + " is " + max + " km/h";
    }

}


