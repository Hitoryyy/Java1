package home_work_6;

public class Dog extends Animals {

    public Dog(String name) {
        this.name = name;
    }

    public void dogInfo() {
        System.out.println("Собака по имени: " + name);
    }
}
