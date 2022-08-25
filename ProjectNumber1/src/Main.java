import java.util.Scanner;
import java.util.*;

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        //return vowels
        //creating list, putting  word into array
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        //checking character list
        //System.out.println(ch);

        //vowel count
        int vowels = 0;

        //possible values/vowels to detect
        Character a = 'a';
        Character e = 'e';
        Character l = 'i';
        Character o = 'o';
        Character u = 'u';

        //traversing list to check for vowels
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == a || ch[i] == e || ch[i] == l || ch[i] == o || ch[i] == u){
                vowels++;
            }
        }
        System.out.println("Number of vowels: " +  vowels);
        //return -1;
        return vowels;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        char[] ch = new char[s.length()];
        //putting string into character list
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        //to identify if character is bob through letters
        Character b = 'b';
        Character o = 'o';

        int bob = 0;
        //traversing array to look for bob
        for (int i = 0; i < s.length() && i+2 < s.length(); i++) {
            //making sure i isn't out of index
            if (ch[i] == b && ch[i+1] == o && ch[i+2] == b){
                bob++;
            }
        }
        System.out.println("Number of times bob occurs: " + bob);
        return bob;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //System.out.println('a'< 'l' );
        //convert string into character array
        char[] strList = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            strList[i] = s.charAt(i);
            //System.out.println(strList[i]);
        }

        //declare an array or arraylist (grows) to store all the substrings - see next lesson
        List<String> resList = new ArrayList<String>();
        //traverse and compare each char to next char while storing the chars to another ArrayList . find all the substrings
        //declare another Arraylist to store each substring in the beginning, inside for loop
        //if prev is not before current alphabetically, clear arraylist

        char prev = strList[0];
        //setting previous character
        List<Character> subList = new ArrayList<Character>();
        subList.add(prev);
        //System.out.println("start - subList: " + subList);
        for (int i = 1; i < strList.length; i++) {
            //comparing to see if in alphabetical order
            if ( prev <= strList[i]) {
                subList.add(strList[i]);
            } else {
                //find a way to convert an ArrayList of char to a String - or google
                //if substring isn't alphabetical, turn into string, add to list and clear
                String listString = subList.toString().replaceAll("[,\\s\\[\\]]", "");
                resList.add(listString);
                subList.clear();
                subList.add(strList[i]);
            }
            //for next loop
            prev = strList[i];
            //System.out.println("resList: " + resList);
        }
        //for final iteration/item
        String listString = subList.toString().replaceAll("[,\\s\\[\\]]", "");
        resList.add(listString);
        //System.out.println("resList: " + resList);

        //converting to string to get length to compare and return longest
        String maxString = resList.get(0).toString();

        //traverse the result list of all the substrings and find/return the substring with max length
        for (int i = 1; i < resList.size(); i++) {
            //only if greater, to return first substring if longest is a tie
            if(resList.get(i).length() > maxString.length()){
                maxString = resList.get(i).toString();
            }
        }
        System.out.println("Longest substring in alphabetical order: " + maxString);

        return maxString;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        problemOne("iueuaondjmhoiuxj");
        problemTwo("azcbobobegghakl");
        problemThree("iueuaondjmhoiuxj");


    }
}
