import java.util.Scanner;
import java.util.StringTokenizer;

public class Vocal{

    public static void main(String[]args){
        String sequence;
        Scanner keyboard = new Scanner(System.in);



        System.out.println("Introdu propozitia: ");
        sequence = keyboard.nextLine();

        MyString.StartEndMatching(sequence);
    }
}


