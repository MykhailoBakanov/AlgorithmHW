//Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
//        Операцией возведения в степень пользоваться нельзя!
//        Ввод 8: Вывод: YES
//        Ввод 3: Вывод: NO

public class Task1 {
    public static void main(String[] args) {

        int number = 8;

        if (isPowerOfTwo(number)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }
}