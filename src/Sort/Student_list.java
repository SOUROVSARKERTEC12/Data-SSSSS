package Sort;

import java.io.*;
import java.util.Scanner;

public class Student_list {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 Show all student");
        System.out.println("Press 2 Count number of students");
        System.out.println("Press 3 for Add student");
        System.out.println("Press 4 Find student");
        System.out.println("Enter between 1-5 :");
        int a = scanner.nextInt();
        switch (a){
            case (1):
                {
                try {
                    BufferedReader in = new BufferedReader(new FileReader("G:\\Data_structure\\src\\Sort\\Student_list.txt"));
                    String str;

                    while ((str = in.readLine()) != null) {
                        System.out.println(str);
                    }
                    //System.out.println(str);
                } catch (IOException e) {
                    System.out.println(e);
                }

                break;
                }
            case (2):{
                File f1=new File("G:\\Data_structure\\src\\Sort\\Student_list.txt");      //Creation of File Descriptor for input file
                int linecount=0;                        //Intializing linecount as zero
                FileReader fr=new FileReader(f1);       //Creation of File Reader object
                BufferedReader br = new BufferedReader(fr);    //Creation of File Reader object
                String s;
                while((s=br.readLine())!=null)    //Reading Content from the file line by line
                {
                    linecount++;               //For each line increment linecount by one

                }
                fr.close();
                System.out.println("Number of lines in the Files:"+linecount); //Print the line count

                break;
            }
            case (3):{

                String textToAppend ;
                textToAppend = scanner.next();
                BufferedWriter writer = new BufferedWriter(new FileWriter("G:\\Data_structure\\src\\Sort\\Student_list.txt", true)  //Set true for append mode
                );
                writer.newLine();   //Add new line
                writer.write(textToAppend);
                writer.close();

                break;
            }

            case (4):
            {
                break;
            }

            case (5):
        }

    }
}
