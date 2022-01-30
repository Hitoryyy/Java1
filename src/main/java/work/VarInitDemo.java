package work;
//Демонстрация времени жизни переменной
public class VarInitDemo {
    public static void main(String[] args) {
        int x;

        for(x = 0; x < 3; x++){
            int y = -1; //переменная y не инициализируется при каждом входе в блок
            System.out.println("y: " + y);//всегда выводится значение -1
            y = 100;
            System.out.println("Изменённое значение y: " + y);
        }
    }
}
