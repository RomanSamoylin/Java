package OPP_projects.HW2.src;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Dimka",4,"Oleg"))
                .addAnimal(new Dog("Tuzik",4,"Petya"))
                .addAnimal(new Duck("Donald",2,"Ivan"))
                .addAnimal(new Eagle("Trut",2,"Sasha"))
                .addAnimal(new Crocodile("Gena", 4, "Pasha")).addAnimal(new Hippo("Totosha", 4, "Nikolay"));
        System.out.println(zoo);
        System.out.println("----------------------------------------");
        System.out.println("Animals voices:\n" + zoo.talk());
        System.out.println("----------------------------------------");
        System.out.println("Runnables speeds:");
        for (Runable i: zoo.getRunnable()) {
            System.out.println(i.runSpeed() + "km/h");
        }
        System.out.println(zoo.getChampionRunSpeed());
        System.out.println("--------------------------------------------");
        for (Flyable i: zoo.getFlyable())
        {
            System.out.println("Flyables speeds:\n" + i.flySpeed() + " km/h");
        }
        System.out.println("----------------------------------------");

        for (Swimmable item: zoo.getSwimmable()){
            System.out.println("Swimmables speeds:\n" + item.swimSpeed() + " km/h");
        }
        System.out.println("----------------------------------------");
        SaveManagerAnimals saveManagerAnimals = new SaveManagerAnimals();
        saveManagerAnimals.save(zoo.getAnimals());
    }
}
