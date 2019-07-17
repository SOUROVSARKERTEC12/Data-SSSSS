import java.util.Scanner;

public class Romove_locstringarray {

    public static void main(String[] args)
    {

        Scanner input = new  Scanner(System.in);
        System.out.println("Enter the string:");
        String str = input.nextLine();
        StringBuffer sbf = new StringBuffer(str);

        System.out.println("string buffer = " + sbf);

        // Deleting characters from index 2
        sbf.delete(2, 3);
        System.out.println("After deletion string buffer is = " + sbf);
    }
}
