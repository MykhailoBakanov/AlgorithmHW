

//Реализовать алгоритм, который будет находить сумму квадратов всех элементов массива!  {3, 6, 4, 7, 2, 1, 9}

package Task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Array of random numbers: ");

        int[] intArray = {1, 2, 3, 4, 5, 6};


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        int sumSquared = 0;

        for (int i = 0; i < intArray.length; i++) {
            sumSquared = sumSquared + intArray[i] * intArray[i];
        }
        System.out.println("Sum of squares of all array elements: " + sumSquared);
    }
}
