package home_work_6;


public class AnimalsApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Кошки");
        Cat cat = new Cat("Tom", 200, false);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal danimal = new Animal("Собаки");
        Dog dog = new Dog("Lebron", 500, 10);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();
    }
}
