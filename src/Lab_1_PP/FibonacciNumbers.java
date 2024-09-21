package Lab_1_PP;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас для генерації чисел Фібоначчі та перевірки на ідеальні квадрати
 */
public class FibonacciNumbers {

    private List<Integer> numbers = new ArrayList<>();

    /**
     * Конструктор, який генерує послідовність Фібоначчі
     * @param numbersCount Кількість чисел Фбоначчі
     */
    public FibonacciNumbers(int numbersCount) {
        initialize(numbersCount);
    }

    /**
     * Метод для генерації чисел Фібоначчі
     * */
    private void initialize(int numberCount) {
        int firstNumber = 1, secondNumber = 1, thirdNumber;

        if (numberCount > 0) {
            numbers.add(firstNumber);
        }
        if (numberCount > 1) {
            numbers.add(secondNumber);
        }
        if (numberCount > 2) {
            for (int i = 2; i < numberCount; i++) {
                thirdNumber = firstNumber + secondNumber;
                numbers.add(thirdNumber);
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
            }
        }
    }

    /**
     * Метод для отримання всіх чисел Фібоначчі
     * */
    public List<Integer> getNumbers() {
        return numbers;
    }

    /**
     * Метод для отримання чисел Фібоначчі, які є ідеальними квадратами
     * @return Значення, яке повертає числа, що є квадратами
     */
    public List<Integer> getSqrtNumbers() {
        List<Integer> sqrtNumbers = new ArrayList<>();

        for (int number : numbers) {
            int sqrtRoot = (int) Math.round(Math.sqrt(number));
            if (sqrtRoot * sqrtRoot == number) {
                sqrtNumbers.add(number);
            }
        }

        return sqrtNumbers;
    }
}
