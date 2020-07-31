package ru.geekbrains.java_one.lesson_second.online;
import java.util.Arrays;

public class HomeWorkJ1L2 {

    /* Задание 1.
    Задать целочисленный массив, состоящий из элементов 0 и 1.
    Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
     */
    private static void сheckNumbers(int[] binary) {

        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 0) {
                binary[i] = 1;
            } else binary[i] = 0;
        }
    }

    /* Задание 2.
    Задать пустой целочисленный массив размером 8.
    Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
     */
    private static void addingValues(int[] integerArray) {
        int numbers = 1;
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = numbers;
            numbers = numbers + 3;
        }
    }

    /* Задание 3.
     Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
     написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
      */

    private static void multiplication(int[] longArray) {
        for (int i = 0; i < longArray.length; i++) {
            if (longArray[i] < 6) {
                longArray[i] *= 2;
            }
        }
    }

    /* Задание 4.
    Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    */

    private static int[] minAndMax(int[] oneArray) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < oneArray.length; i++) {
            if (oneArray[i] < max) {
                max = oneArray[i];
            } else if (oneArray[i] > min) {
                min = oneArray[i];
            }
        }
        return new int[]{min, max};
    }

    /* Задание 6.
    Написать метод,
    в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true если в массиве есть место,
    в котором сумма левой и правой части массива равны.
    */

    private static boolean matcher(int[] inter) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < inter.length; i++) {
            if (i < 3) {
                leftSum = leftSum + inter[i];
            } else {
                rightSum = rightSum + inter[i];
            }
        }
        return leftSum == rightSum;
    }

    public static void main(String[] args) {
        //1
        int[] binary = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        сheckNumbers(binary);
        System.out.println("Задание 1: " + Arrays.toString(binary));
        //2
        int[] integerArray;
        integerArray = new int[8];
        addingValues(integerArray);
        System.out.println("Задание 2: " + Arrays.toString(integerArray));
        //3
        int[] longArray = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplication(longArray);
        System.out.println("Задание 3: " + Arrays.toString(longArray));
        //4
        int[] oneArray = new int[]{-1, 2, 5, 10, 44, -26, 0};
        //6**
        int[] xx = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(matcher(xx));

        int[] yy = new int[]{1, 2, 1, 2, 1, 1};
        System.out.println(matcher(yy));

        int[] zz = new int[]{2, 2, 1, 1, 3, 2};
        System.out.println(matcher(zz));

        int[] cc = new int[]{1, 1, 5, 1, 2, 1};
        System.out.println(matcher(cc));
    }
}
