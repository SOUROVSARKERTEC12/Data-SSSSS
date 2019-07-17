import java.util.Scanner;

public class Bubble_Short {
    static void bubbleSort(int[] arr) {
        //int n = arr.length;

        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j + 1] < arr[j]) {

                    temp = arr[j + 1];

                    arr[j + 1] = arr[j];

                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String... args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");

        int n = s.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter all the elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = s.nextInt();
        }
        //int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

        System.out.println("Array Before Bubble Sort");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();

        bubbleSort(arr);

        System.out.println("Array After Bubble Sort");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}