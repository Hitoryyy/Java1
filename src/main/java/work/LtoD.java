package work;
//Демонстрация автоматического преобразования типа long в тип double
public class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L и D: " + L + " " + D);
    }
}
