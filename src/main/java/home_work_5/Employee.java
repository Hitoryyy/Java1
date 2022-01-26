package home_work_5;

//Создаём класс сотрудник с полями: ФИО, должность, электронная почта, телефон, зарплата, возраст
public class Employee {
    private String full_name;
    private String position;
    private String mail;
    private String telephone;
    private double salary;
    private int age;

    //Создаём конструктор заполнения полей при создании объекта
    public Employee(String full_name, String position, String mail, String telephone, double salary, int age) {
        this.full_name = full_name;
        this.position = position;
        this.mail = mail;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    //геттеры и сеттеры для каждого поля объекта
    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //вывод информации об объекте в консоль
    public void info() {
        System.out.println("ФИО: " + full_name + "\n" + " Должность: " + position + "\n" + " E-mail: " + mail +
                "\n" + " Телефон: " + telephone + "\n" + " Зарплата: " + salary + "\n" + " Возраст: " + age);
    }
    //печатаем поле age объекта Employee
    public int printAge() {
        return age;
    }
}
//
