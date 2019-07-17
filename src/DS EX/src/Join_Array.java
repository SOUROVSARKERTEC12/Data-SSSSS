import java.util.Scanner;

public class Join_Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of two array:");

        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of first array:");

        for (int i = 0; i < arr.length; i = i + 1) {

            arr[i] = input.nextInt();
        }


        int[] arr1 = new int[n];

        System.out.println("Enter the elements of second:");

        for (int i = 0; i < arr1.length; i = i + 1) {

            arr1[i] = input.nextInt();

        }

        int[] c = new int[arr.length + arr1.length];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            c[i] = arr[i];
            count++;
        }
        for (int j = 0; j < arr1.length; j++) {
            c[count++] = arr1[j];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
