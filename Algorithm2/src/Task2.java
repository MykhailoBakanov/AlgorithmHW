//Дано натуральное число N. Вычислите сумму его цифр.
//        При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
//        Ввод: 179
//        Вывод: 17

public class Task2 {
    public static void main(String[] args) {
        int number = 179;
        System.out.println(sumOfDigits(number));
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            int digit = n % 10;
            int remaining = n / 10;
            return digit + sumOfDigits(remaining);
        }
    }
}
