

import java.lang.*;
import java.util.Scanner;

class Insert_String_array{

    // Function to insert string
    public static String insertString(
            String originalString,
            String stringToBeInserted,
            int index)
    {

        // Create a new StringBuffer
        StringBuffer newString
                = new StringBuffer(originalString);

        // Insert the strings to be inserted
        // using insert() method
        newString.insert(index + 1, stringToBeInserted);

        // return the modified String
        return newString.toString();
    }

    // Driver code
    public static void main(String[] args)
    {

        // Get the Strings
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter the string:");

        String originalString = input.nextLine();

        System.out.println("Enter the index number to add");

        int index = input.nextInt();

        System.out.println("Enter the insert String:");

        String stringToBeInserted = input.nextLine();



        System.out.println("Original String: "
                + originalString);
        System.out.println("String to be inserted: "
                + stringToBeInserted);
        System.out.println("String to be inserted at index: "
                + index);

        // Insert the String
        System.out.println("Modified String: "
                + insertString(originalString,
                stringToBeInserted,
                index));
    }
}
