package home_work_6;

//наследный класс животных - коты.
class Cat extends Animal {
    protected boolean sweem;

    public Cat(String name, int run, boolean sweem) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;

    }

    public void catInfo() {
        System.out.println("Имя: " + name + " максимальная дистанция: " + run+ " м " + "  максимальная дистанция по плаванью: " + sweem);
    }
}
