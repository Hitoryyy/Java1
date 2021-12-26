package lesson2;

public class MethodApp {

    public static final String TEMPLATE = "int = %d string = %s\n";

    public static void main(String[] args) {

        int v1 = multiplication(4, 10);
        int v2 = multiplication(5, 6.8);


        System.out.println("v1 = " + v1 + " v2 = " + v2 + " v3 = " + multiplication(v1,v2));

        //PrintUtil.printFormantted();
    }

    public static int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public static int multiplication(int n1, double n2){
        return (int) (n1 * n2);
    }

    public static int multiplication(double n1, int n2){
        return (int) (n1 * n2);
    }


    //модификатор доступа + тип значения + имя + набор параметров

    //naming - ClassName MyClassName
    //methods, variables - loaerCaseUperCase methodName variableName

    //CONSTANTS - UPPER_CASE (snake_case)

    //type - void / real type

    //public - protected - (nno modifier) default - privat(только внутри класса)

}
