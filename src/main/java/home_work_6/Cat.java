package home_work_6;

public class Cat extends Animals {

    public Cat(String name) {
        this.name = name;
    }

    public void catInfo() {
        System.out.println("Кот по имени: " + name);
    }
}
