
import java.util.Arrays;
import java.util.Scanner;

public class Array_Operation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");

        int n = input.nextInt();
        int arr[] = new int [n];

        System.out.println("Enter the elements:");

        for (int i = 0; i <arr.length ; i = i+1) {

            arr[i] = input.nextInt();

        }

         // sort in accending order

        Arrays.sort(arr);

       // Arrays.sort(arr, Collections.reverseOrder()); --for  decending order change int to Integer and use this method

        System.out.println("Maximum Value is:"+arr[n-1]);
        System.out.println("Minimum Value is:"+arr[0]);

        int Total = 0, Average = 0;

        for (int i = 0; i <arr.length ; i = i+1) {

             Total = Total + arr[i];

        }

        Average = Total / n;

        System.out.println("Average Value is:"+Average);
        System.out.println("Total value is:"+Total);

        for (int i = 0; i <arr.length ; i = i+1) {

            System.out.println("Sin Value of"+arr[i]+" is:"+Math.sin(arr[i]));

        }
    }
}
