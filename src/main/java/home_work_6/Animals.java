package home_work_6;

public class Animals {
    String name;

    public Animals() {
    }

    public void AnimalName(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }
}
