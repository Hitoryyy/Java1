package home_work_5;

import java.util.Arrays;

public class DemoEmployeeApp {
    public static void main(String[] args) {
        /*Employee employee1 = new Employee("Иванов Иван Иванович",  "Инженер", "ivanov@mail.ru",
                "89192418488", 60000, 45);
        employee1.info();*/

        //Создаём массив из 5-и сотрудников
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "Инженер", "ivanov@mail.ru",
                "89192418488", 60000, 45);
        employees[1] = new Employee("Петров Пётр Петрович", "Экономист", "petrov@mail.ru",
                "82301234582", 50000, 50);
        employees[2] = new Employee("Васильев Василий Васильевич", "Программист", "vasiliev@mail.ru",
                "89124307188", 140000, 30);
        employees[3] = new Employee("Фёдорова Елена Сергеевна", "Директор", "fedorova@mail.ru",
                "83241427730", 500000, 49);
        employees[4] = new Employee("Александрова Анна Александровна", "Менеджер", "aleksandrova@mail.ru",
                "89448537212", 50000, 29);

        //С помощью цикла for и метода printAge выбираем сотрудников старше 40 лет, а затем вывод в консоль
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].printAge() > 40) {
                employees[i].info();
            }
        }
    }
}
