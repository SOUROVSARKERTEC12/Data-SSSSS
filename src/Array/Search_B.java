package Array;

import java.util.Scanner;

class Search_B {
    static int binarySearch(int arr[], int low, int high, int key){
        if (high < low)
            return -1;

        int mid = (low + high)/2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid+1), high, key);
        return binarySearch(arr, low, (mid-1), key);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of size of array");
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the array element");
        //For reading the element
        for(int i=0;i<size;i++) {
            a[i] = sc.nextInt();
        }

        int n,key;
        n = a.length;
        System.out.println("Enter the search element :");
        key = sc.nextInt();
        System.out.println("Index : "+binarySearch(a,0,n,key));
    }
}
