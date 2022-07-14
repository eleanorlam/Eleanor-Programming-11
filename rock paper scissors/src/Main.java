import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ask for user choice
        System.out.println("Welcome to rock, paper, scissors. Choose a, b, or c: ");
        System.out.println("a.) rock");
        System.out.println("b.) paper");
        System.out.println("c.) scissors");

        //user choice
        String choice = scanner.nextLine();
        //printing to check what user chose is correct and vetting out invalid answers
        if (choice.equals("a") || choice.equals("b") || choice.equals("c")){
            System.out.println(" ");
        } else {
            System.out.println("Invalid selection please play again. ");
        }

        int random = (int)(Math.random()* 3 + 1);
        //System.out.println(random);
        //rock = 1, paper = 2, scissors = 3

        //string sentences - variables instead of repeated strings
        String end = "Thanks for playing. ";
        String rock = "Computer choice: rock";
        String paper = "Computer choice: paper";
        String scissors = "Computer choice: scissors";
        String plrock = "\tPlayer choice: rock";
        String plpaper = "\tPlayer choice: paper";
        String plscissors = "\tPlayer choice: scissors";
        String win = "You won";
        String lose = "You lost!";
        String draw = "The game is tied.";

        //determining outcome
        if (random == 1){
            //if computer chooses rock
            if (choice.equals("a")){
                System.out.println(draw);
                System.out.println(rock + plrock);
            } else if (choice.equals("b")) {
                System.out.println(win);
                System.out.println(rock + plpaper);
            } else if (choice.equals("c")){
                System.out.println(lose);
                System.out.println(rock + plscissors);
            }
        } else if (random == 2){
            //if computer chooses paper
            if (choice.equals("a")){
                System.out.println(lose);
                System.out.println(paper + plrock);
            } else if (choice.equals("b")) {
                System.out.println(draw);
                System.out.println(paper + plpaper);
            } else if (choice.equals("c")){
                System.out.println(win);
                System.out.println(paper + plscissors);
            }
        } else if (random == 3){
            //if computer chooses scissors
            if (choice.equals("a")){
                System.out.println(win);
                System.out.println(scissors + plrock);
            } else if (choice.equals("b")) {
                System.out.println(lose);
                System.out.println(scissors + plpaper);
            } else if (choice.equals("c")){
                System.out.println(draw);
                System.out.println(scissors + plscissors);
            }
        }
    }
}
