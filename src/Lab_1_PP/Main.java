package  Lab_1_PP;

import java.util.*;

/**
 * Головний клас
 * */
public class Main {

    /**
     * Головна функція
     * @param args значення командної строки
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Введіть к-сть чисел Фібоначчі: ");
        n = scanner.nextInt();

        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers(n);

        System.out.print("Числа Фібоначчі: ");
        System.out.println(fibonacciNumbers.getNumbers());
        System.out.print("Числа квадрати в даній послідовності: ");
        System.out.println(fibonacciNumbers.getSqrtNumbers());
    }
}