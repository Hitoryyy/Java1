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

    //Ход робота
    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Робот ходит в "+ (x + 1) + " " + (y + 1));
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

    public static void main(String[] args) {
        initMap();
        printMap();
        humanTurn();
        aiTurn();
        printMap();
        humanTurn();
        printMap();
    }
}

