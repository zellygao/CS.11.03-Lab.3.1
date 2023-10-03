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
        System.out.println("Now that you have your list, you can go to the supermarket to buy the ingredients. You will be asked to estimate the price of each ingredient, and in the end you will find out if you successfully purchased all the ingredients for dinner! Enter 1 to proceed.");
        int proceed = scanner.nextInt();
        if(proceed==1){
            int es= scanner
            asianguess(cusine,scanner.nextInt());
        }
        }


    public static void ingredients (int cusine){
        if (cusine == 1){
            System.out.println( "You will be making sushi tonight. Here is your ingredients list:" + "\n1 nori sheet" + "\n50g fresh salmon" + "\n50g sushi rice" + "\n1 cucumber" );
        }
        else if (cusine == 2){
            System.out.println("You will making spaghetti bolognese tonight. Here is your ingredients list:" + "\n 100g minced beef" + "\n 1 can tomato puree" + "\n 100g dried spaghetti" + "\n 1 onion");
        }
        else if (cusine != 1 || cusine !=2) {
            System.out.println("Sorry, you must input either 1 or 2");
        }
    }

    public static String ask (String food){
        return "How much do you think" + food + "costs?";
    }

    public static String pricecheck (int estimate, int real, String food){
        if (estimate == real){
            return "Correct!" + food + "costs" + real + "dollars!";
        }
        else if(Math.abs(estimate - real) <= 10){
            return "You were close!" + food + "costs" + real + "dollars!";
            //
        }
        return "Uhoh, you were not close."+ food + "costs" + real + "dollars.";
    }

    public static void asianguess(int cusine, Scanner scanner){
        int nori = 200;
        int rice = 60;
        int salmon = 50;
        int cucumber = 5;

        if(cusine ==1){
            ask("1 pack of nori");
            int total = scanner.nextInt();
            pricecheck(scanner.nextInt(), nori, "1 pack of nori");

            ask ("a 1kg pack of japanese rice");
            total = total + scanner.nextInt();
            pricecheck(scanner.nextInt(),rice,"a 1kg pack of japanese rice");

            ask ("1 pack of salmon");
            total = total + scanner.nextInt();
            pricecheck(scanner.nextInt(),salmon,"1 pack of salmon");

            ask ("1 cucumber");
            total = total + scanner.nextInt();
            pricecheck(scanner.nextInt(),cucumber,"1 cucumber");
        }
    }
    public static void result () {
        // tell them if they successfully

    }

}

// use * for multiplying number of ppl and ingredients for dinner
// use / for ?
// use % for ?
// use - for ?
