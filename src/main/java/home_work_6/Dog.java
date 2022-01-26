package home_work_6;

//наследный класс животных - собаки
class Dog extends Animal {

    public int sweem;

    public Dog(String name, int run, int sweem) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
    }
    public void dogInfo() {
        System.out.println("Имя: " + name  + " максимальная дистанция: " + run+ " м " + " максимальная дистанция по плаванью: " + sweem);
    }
}
