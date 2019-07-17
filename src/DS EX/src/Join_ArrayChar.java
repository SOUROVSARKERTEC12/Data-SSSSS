import java.io.IOException;
import java.util.Scanner;

public class Join_ArrayChar {

       public static void main(String args[]) throws IOException {
           Scanner input = new Scanner(System.in);



           System.out.println("Enter the size of two array:");

           int n = input.nextInt();

           char[] arr = new char[n];

           System.out.println("Enter the elements of first array:");

           for (int i = 0; i < arr.length; i = i + 1) {

               arr[i] = (char)System.in.read();
           }


           char[] arr1 = new char[n];

           System.out.println("Enter the elements of second array:");

           for (int i = 0; i < arr1.length; i = i + 1) {

               arr1[i] = (char)System.in.read();

           }

           char[] c = new char[arr.length + arr1.length];

           int count = 0;

           for (int i = 0; i < arr.length; i++) {
               c[i] = arr[i];

               count++;
           }
           for (int j = 0; j < arr1.length; j++) {

               c[count++] = arr1[j];
           }
           for (int i = 0; i < c.length; i++) {

               System.out.println(c[i] +" ");
           }


        }
    }

