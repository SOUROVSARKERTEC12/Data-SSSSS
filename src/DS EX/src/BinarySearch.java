import java.util.Scanner;

// Java implementation of iterative Binary Search
class BinarySearch {
    // Returns index of x if it is present in arr[],
    // else return -1
    int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x) {
                return m;
            }

            // If x greater, ignore left half
            if (arr[m] < x) {
                l = m + 1;
            }

                // If x is smaller, ignore right half
            else {
                r = m - 1;
            }
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {

        BinarySearch ob = new BinarySearch();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");

        int a = input.nextInt();

        int arr[] = new int[a];

        System.out.println("Enter all the elements:");

        for (int i = 0; i < a; i++) {

            arr[i] = input.nextInt();
        }

        System.out.println("Enter the data that you want to found:");

        int x = input.nextInt();

        int result = ob.binarySearch(arr, x);

        if (result == -1) {
            System.out.println("Element not present");
        }
        else {
            System.out.println("Element found at " + "index " + result);
        }
    }
} 
