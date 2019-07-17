import java.util.Arrays;
import java.util.Scanner;

 class Binary_Search {

     static int min = 0;

     static int mid;


     public static void main(String[] args) {



         String[] a = { "AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG" };
         int max = a.length - 1;
         String key = "CCC";

         System.out.println("Key Found at : " + stringBinarySearch(a,max,key) + " position");

     }
     public static int stringBinarySearch(String a[], int max,String key) {
         while (min <= max) {
             mid = (min + max) / 2;
             if (a[mid].compareTo(key) < 0) { min = mid + 1; } else if (a[mid].compareTo(key) > 0) {
                 max = mid - 1;
             } else {
                 return mid;
             }
         }
         return -1;
     }
 }

