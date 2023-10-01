import java.sql.SQLOutput;
import java.util.Scanner;

public class TextBasedGame {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Elly's Supermarket Guesser! What is your name?");
        String name = scanner.next();
        System.out.println("Welcome " + name + "! You will be cooking dinner tonight, what would you like? Enter 1 for Asian, or 2 for Western.");
        int cusine = scanner.nextInt();
        System.out.println("How many people will you be cooking for?");
        int quota = scanner.nextInt();
        System.out.println("What is your budget for dinner?");
        int budget = scanner.nextInt();
        ingredients(cusine);
        System.out.println("Now that you have your list, you can go to the supermarket to buy the ingredients. You will be asked to estimate the price of each ingredient, and in the end you will find out if you successfully purchased all the ingredients for dinner tonight! Enter 1 if you would like to proceed.");

        if(scanner.nextInt() == 1){

        }

        String nori = "1 pack of nori";
        String salmon = "50grams of salmon";
        String rice = "1kg pack of rice";
        String cucumber = "1 small cucumber";

        int estimate;
    }
    public static void ingredients (int cusine){
        if (cusine == 1){
            System.out.println("You will be making sushi tonight. Here is your ingredients list:" + "\nnori sheet" + "\n50g fresh salmon" + "\n50g sushi rice" + "\n1 cucumber" );
        }
        else if (cusine == 2){
            System.out.println("You will making spaghetti bolognese tonight. Here is your ingredients list:" + "\n 100g minced beef" + "\n 1 can tomato puree" + "\n 100g dried spaghetti" + "\n 1 onion");
        }
        //else if (cusine != 1 || cusine !=2){
            //System.out.println("Sorry, you must input either 1 or 2");
        //}
    }

    public static pricecheck(int estimate){
        if(estimate <= scanner.nextInt() )
    }
    public static void ask (String food){
        System.out.println("How much do you think" + food + "costs?");
    }
}
