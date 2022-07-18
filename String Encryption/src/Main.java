import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompt for word
        System.out.println("type a word to encrypt");
        String word = scanner.nextLine();

        //creating list, putting user word into array
        char[] ch = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
        }

        //putting last letter of the word to the front
        int end = word.length() - 1;
        String[] list = new String[end + 3];
        //first position of array is the value of the letter at the end of the word
        list[0] = String.valueOf(word.charAt(end));
        //System.out.println(list[0]);

        //putting the rest of the word into the array
        for (int i = 1; i < word.length(); i++){
            list[i] = String.valueOf(word.charAt(i-1));
            //System.out.println("before ay: " + list[i]);
        }

        //adding "ay" to the end of the word
        list[list.length -2] = "a";
        list[list.length-1] = "y";

        //result of encrypted word
        System.out.println("Encrypted word:");
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i]);
        }

        System.out.println("\nDecrypted:");
        //new list to store decrypted word
        String[] list1 = new String[list.length-2];

        //starting from 1st position, taking the letters except "ay" at the end
        for (int i = 0; i < list1.length-1; i++){
            list1[i] = list[i+1];
            //System.out.print(list1[i]);
        }

        //putting the last letter back into original position
        list1[list1.length-1] = list[0];

        //result of decrypted word
        for (int i = 0; i < list1.length; i++){
          System.out.print(list1[i]);
        }

        //StringBuilder sb = new StringBuilder("");
        //sb.append(list1);
        //System.out.println(list1);



    }
}