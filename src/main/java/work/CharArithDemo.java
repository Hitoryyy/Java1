package work;

public class CharArithDemo {
    //С символьными переменными можно обращаться, как с целочисленными
    public static void main(String[] args) {
        char ch;
        ch = 'x';
        System.out.println("ch содержит " + ch);

        ch++; //инкрементировать переменную ch
        System.out.println("теперь ch содержит " + ch);

        ch = 90; //присвоить переменной ch значение z
        System.out.println("теперь ch содержит " + ch);
    }
}
