public class Task3 {

        public static void main(String[] args) {
            Person[] people = {
                    new Person("Mikhail", 25),
                    new Person("Andrei", 30),
                    new Person("Oleg", 20),
                    new Person("Vanya", 35),
                    new Person("Anton",19)
            };

            System.out.println("array before sort:");
            for (Person person : people) {
                System.out.println(person.name + " " + person.age);
            }

            System.out.println("=====================================================");

            mergeSort(people, 0, people.length - 1);

            System.out.println("array after sort:");
            for (Person person : people) {
                System.out.println(person.name + " " + person.age);
            }
        }

        public static void mergeSort(Person[] arr, int left, int right) {
            if (left < right) {
                int mid = left + (right - left) / 2;
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }

        public static void merge(Person[] arr, int left, int mid, int right) {
            Person[] temp = new Person[arr.length];
            for (int i = left; i <= right; i++) {
                temp[i] = arr[i];
            }

            int i = left;
            int j = mid + 1;
            int k = left;
            while (i <= mid && j <= right) {
                if (temp[i].age >= temp[j].age) {
                    arr[k++] = temp[i++];
                } else {
                    arr[k++] = temp[j++];
                }
            }

            while (i <= mid) {
                arr[k++] = temp[i++];
            }

            while (j <= right) {
                arr[k++] = temp[j++];
            }
        }
    }


