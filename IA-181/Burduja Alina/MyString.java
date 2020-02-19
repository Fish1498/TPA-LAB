import java.util.StringTokenizer;

public class MyString {
    public static void StartEndMatching(String sequence){
        String word;

        StringTokenizer tokenizer = new StringTokenizer(sequence, " ");
        while(tokenizer.hasMoreTokens()){
            //
            word = tokenizer.nextToken();
            //System.out.println(word);
            if(word.length() >= 2) {
                if (word.charAt(0) == word.charAt(word.length()-1)){
                    System.out.println("Cuvantul "+word+" incepe si se termina cu acelasi caracter "+word.charAt(0));
                }
            }
            //            else{
            //                System.out.println("Propozitia "+word+" incepe cu "+word.charAt(0)+" si se termina "+   word.charAt(word.length()-1)+", aceste caractere sunt diferite.");
            //            }


        }

    }
}
