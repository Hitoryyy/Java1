package work;

public class Inches {
    /*
        Расчёт числа кубических дюймов в кубе объёмом 1 куб. милю
     */
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;

        System.out.println("В одной кубической миле содержится " + ci + " кубических дюймов");
    }
}
