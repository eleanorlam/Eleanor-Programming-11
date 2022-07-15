import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //setting variables - for strings and print sentences to
        String border = "********************************************";
        int wins = 0;
        int losses = 0;
        String end = "Thanks for playing!";
        String rock = "Computer choice: rock";
        String paper = "Computer choice: paper";
        String scissors = "Computer choice: scissors";
        String plrock = "\tPlayer choice: rock";
        String plpaper = "\tPlayer choice: paper";
        String plscissors = "\tPlayer choice: scissors";

        //intro and exit opportunity for while loop
        System.out.println("Welcome to rock, paper, scissors. Press any letter to continue, or 'x' to exit");
        Scanner scannerin = new Scanner(System.in);
        String tocontinue = scannerin.nextLine();

        //while loop, as long as input isn't x
        while (!tocontinue.equals("x")){
            System.out.println(border);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wins: " + wins + " \tLosses: " + losses);
            System.out.println("Players Choice:");
            System.out.println("a.) rock");
            System.out.println("b.) paper");
            System.out.println("c.) scissors");
            System.out.println("x.) to exit");

            //int choice = scanner.nextInt();
            String choice = scanner.nextLine();

            //checking for exit and confirming user choice
            if (choice.equals("a") || choice.equals("b") || choice.equals("c")){
                System.out.println(" ");
            } else if (choice.equals("x")){
                //displaying final score when exiting
                System.out.println("You chose to exit. ");
                System.out.println("Final score:");
                System.out.println("Wins: " + wins + "\tLosses: " + losses);
                System.out.println(end);
                break;
            } else {
                System.out.println("Sorry, the answer you chose is invalid. Please try again. ");
            }

            //computer choice via random number generator
            int random = (int)(Math.random()* 3 + 1);
            //rock = 1, paper = 2, scissors = 3

            //determining outcome
            if (random == 1){
                //if computer chooses rock
                if (choice.equals("a")){
                    System.out.println("Draw!");
                    System.out.println(rock + plrock);
                } else if (choice.equals("b")) {
                    System.out.println("You win!");
                    System.out.println(rock + plpaper);
                    wins = wins + 1;
                } else if (choice.equals("c")){
                    System.out.println("You lost!");
                    System.out.println(rock + plscissors);
                    losses = losses + 1;
                }
            } else if (random == 2){
                //if computer chooses paper
                if (choice.equals("a")){
                    System.out.println("You lost!");
                    System.out.println(paper + plrock);
                    losses = losses + 1;
                } else if (choice.equals("b")) {
                    System.out.println("Draw!");
                    System.out.println(paper + plpaper);
                } else if (choice.equals("c")){
                    System.out.println("You win!");
                    System.out.println(paper + plscissors);
                    wins = wins + 1;
                }
            } else if (random == 3){
                //if computer chooses scissors
                if (choice.equals("a")){
                    System.out.println("You win!");
                    System.out.println(scissors + plrock);
                    wins = wins + 1;
                } else if (choice.equals("b")) {
                    System.out.println("You lost!");
                    System.out.println(scissors + plpaper);
                    losses = losses + 1;
                } else if (choice.equals("c")){
                    System.out.println("Draw!");
                    System.out.println(scissors + plscissors);
                }
            }
        }
    }
}

