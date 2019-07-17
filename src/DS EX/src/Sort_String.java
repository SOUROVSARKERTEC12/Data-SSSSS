import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_String {

    public static String sortString(String inputString)
    {
        // convert input string to Character array
        Character tempArray[] = new Character[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            tempArray[i] = inputString.charAt(i);
        }


        // Sort, ignoring case during sorting
        Arrays.sort(tempArray, new Comparator<Character>(){

            @Override
            public int compare(Character c1, Character c2)
            {
                // ignoring case
                return Character.compare(Character.toLowerCase(c1),
                        Character.toLowerCase(c2));
            }
        });

        // using StringBuilder to convert Character array to String
        StringBuilder sb = new StringBuilder(tempArray.length);
        for (Character c : tempArray) {
            sb.append(c.charValue());
        }

        return sb.toString();
    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");

        String inputString = input.nextLine();

        String outputString = sortString(inputString);

        System.out.println("Input String : " + inputString);

        char arr[] = outputString.toCharArray();

        for (int i = 0; i <arr.length ; i = i+1) {

            System.out.println(arr[i]);

        }
    }
}
