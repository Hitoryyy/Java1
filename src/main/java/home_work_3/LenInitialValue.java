package home_work_3;

public class LenInitialValue {
    public static void main(String[] args) {

        arrInt(10, 11 ); /*вызов метода возвращающего массив по заданным аргументам:
                                        len - количество эл. в массиве, initialValue - значение элемента массива*/
    }

    public static int[] arrInt(int len, int initialValue) { //инициализируем метод arrInt для возврата в основной метод программы
        int arr[] = new int[len]; /*инициализируем одномерный целочисленный массив, с помощью оператора new выделяем
                                    место в памяти соответствующее количеству элементов*/
        for (int i = 0; i < arr.length; i++) { //запускаем цикл для обхода и заполнения элементами нашего массива
            arr[i] = initialValue;
            System.out.print(arr[i] + " "); //вывод в строку через пробел элементов массива
        }
        return arr; //возврат массива в основной метод программы
    }
}
