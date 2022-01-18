package home_work_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTakToe {

    //метод рисующий игровое поле, представляя его в виде двумерного массива
    public static char[][] map;

    //метод для определения размера поля
    public static final int SIZE = 3;

    //определение победителя
    public static final int DOTS_TO_WIN = 3;

    //определение точек
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOX_0 = '0';

    //Сканер, ввод значений с клавиатуры
    public static final Scanner SCANNER = new Scanner(System.in);
    //Рандом
    public static final Random RANDOM = new Random();

    /**
     * Инициализация поля.
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    /**
     * Вывод игрового поля на экран.
     */
    public static void printMap() {
        //нумерауция верхнего ряда
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //строки поля
        for (int i = 0; i < map.length; i++) {
            //вывод номера строки
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Ход человека
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;

    }

    /**
     * Ход робота
     */
    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Робот ходит в " + (x + 1) + " " + (y + 1));
        map[y][x] = DOX_0;
    }

    /**
     * Проверка валидности значений поля
     *
     * @param x координата X
     * @param y координата Y
     * @return да/нет true/false
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            System.out.println("Введённые координаты находятся вне диапазона игрового поля");
            return false;
        }
        if (map[y][x] != DOT_EMPTY) {
            System.out.println("Точка с указанными координатами уже заполнено");
            return false;
        }
        return true;

    }

    /**
     * Проверка победы простыми условиями
     *
     * @param symbol Символ для которого принимаем. Крестик или нолик
     * @return true, если выиграл
     */

   /* public static boolean checkWin(char symbol) {
        //проверка строк
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) {
            return true;
        }
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) {
            return true;
        }
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) {
            return true;
        }

        //проверка столбцов
        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) {
            return true;
        }
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) {
            return true;
        }

        //проверка диагоналей
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) {
            return true;
        }
        if (map[2][0] == symbol && map[1][1] == symbol && map[0][2] == symbol) {
            return true;
        }
        return false;
    }*/
//-----------------------------------------------------------------------------------------//
    //Проверка (через логику)

    //строки и столбцы
    public static boolean checkWinSC(char symbol) {
        boolean stri, colj; // добавляем переменные логического типа
        for (int i = 0; i < map.length; i++) { //запускаем цикл, пробегаемся по всем элементам массива
            stri = true;// присваиваем значения истины (1)
            colj = true;// присваиваем значения истины (1)
            for (int j = 0; j < map.length; j++) {
                stri = stri & (map[j][i] == symbol); //в теле цикла присваиваем значения исходя из двоичной логики
                colj = colj & (map[i][j] == symbol); // 1&1 = 1 , 1&0 = 0
            }
            if (stri || colj) { //если какое либо из значений истинно возврщаем истину (true)
                return true;
            }
        }
        return false;//либо ложь (false), но в этом случае из метода ничего не вернётся и похоже победит робот ))
    }

    //диагонали
    public static boolean checkWinD(char symbol) {
        boolean rd = true;
        boolean ld = true;
        for (int i = 0; i < map.length; i++) {
            rd = rd & (map[i][i] == symbol);
            ld = ld & (map[3 - i - 1][i] == symbol);
        }
        if (rd || ld) {
            return true;
        }
        return false;
    }

//----------------------------------------------------------------------------------------//

    /**
     * Проверка если в поле все ячейки заполнены ( * )
     *
     * @return true, если нет свободных ( * )
     */
    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWinSC(DOT_X)) {
                System.out.println("Побеждает человек");
                break;
            }
            if (checkWinD(DOT_X)){
                System.out.println("Побеждает человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
            }
            aiTurn();
            printMap();
            if (checkWinSC(DOX_0)) {
                System.out.println("Побеждает робот");
                break;
            }
            if (checkWinD(DOX_0)){
                System.out.println("Побеждает робот");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
            }
        }
        System.out.println("Game over");
    }
}

