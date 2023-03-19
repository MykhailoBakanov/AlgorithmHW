

//Найти индекс заданного числа в массиве: {3, 6, 4, 7, 2, 1, 9}
// Алгоритм на вход должен получать любой массив и одну цифру, индекс которой требуется найти.

package Task1;

class Main {
    public static void main(String[] args) {

        System.out.println("Array of random numbers: ");

        int[] intArray = {3, 5, 10, 22, 7, 9};


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        int index = -1;

        int numberToFind = 9;
        System.out.println("Numbers to search index: " + numberToFind);

        for (int i = 0; i < intArray.length; i++)
            if (intArray[i] == numberToFind) {
                index = i;
                break;
            }

        System.out.println(index < 0
                ? "Array do not have element with value: " + numberToFind
                : "Number '" + numberToFind + "' was found at index '" + index + "'");
    }
}