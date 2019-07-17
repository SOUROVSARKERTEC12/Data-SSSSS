import java.util.Scanner;

public class Remove_Stringarray {

    public static String removeWord(String string, String word) {

        // Check if the word is present in string
        // If found, remove it using removeAll()
        if (string.contains(word)) {

            // To cover the case
            // if the word is at the
            // beginning of the string
            // or anywhere in the middle
            String tempWord = word + " ";
            string = string.replaceAll(tempWord, "");

            // To cover the edge case
            // if the word is at the
            // end of the string
            tempWord = " " + word;
            string = string.replaceAll(tempWord, "");
        }

        // Return the resultant string
        return string;
    }

    public static void main(String args[]) {

        // Test Case 1:
        // If the word is in the middle
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter the string:");

        String string1 = input.nextLine();
        System.out.println("Enter the delete String:");

        String word1 = input.nextLine();


        // Test case 1
        System.out.println("String: " + string1
                + "\nWord: " + word1
                + "\nResult String: "
                + removeWord(string1, word1));


    }
}
