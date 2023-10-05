import java.sql.SQLOutput;
import java.util.Scanner;

public class TextBasedGame {
    static int score = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Elly's Supermarket Guesser! What is your name?");
        String name = scanner.next();
        System.out.println("Welcome " + name + "! You will be cooking dinner tonight, what would you like? Enter 1 for Asian, or 2 for Western.");
        int cuisine = scanner.nextInt();
        ingredients(cuisine);
        System.out.println("\n Now that you have your list, you can go to the supermarket to buy the ingredients. You will be asked to estimate the price of each ingredient. \n Here is how the scoring system works:");
        System.out.println(points());
        System.out.println("\n Please enter 1 to proceed!");
        int proceed = scanner.nextInt();


        if (proceed == 1) {
            asianguess(cuisine, scanner);
            westernguess(cuisine, scanner);
        }

        System.out.println("Enter 1 to view your results.");
        proceed = scanner.nextInt();
        if(proceed==1) {
            System.out.println(score);
            System.out.println("You scored " + result(score) + " %");
            System.out.println(passorfail(score));
        }

    }

    public static void ingredients(int cuisine) {
        if (cuisine == 1) {
                System.out.println("You will be making sushi tonight. Here is your ingredients list:" + "\n 1 nori sheet" + "\n 50g fresh salmon" + "\n 50g sushi rice" + "\n 1 cucumber");
            }
        else if (cuisine == 2) {
           System.out.println("You will making spaghetti bolognese tonight. Here is your ingredients list:" + "\n 100 g minced beef" + "\n 1 jar of tomato sauce" + "\n 100g dried spaghetti" + "\n 1 onion");
            }
        //else if (cuisine != 1 || cuisine != 2) {
         //   System.out.println("Sorry, you must input either 1 or 2");
        //}
    }

    public static String points (){
        return "  3 points for a completely accurate estimate" + "\n  2 points for estimate <15% off from the actual price" + "\n  1 point for an estimate <50% off from the actual price, or if your estimate is a multiple of the actual price";

    }
    public static String ask(String food) {
        return "\n" + "How much do you think " + food + " costs?";
    }

    public static int pricecheck (int estimate, int real, String food) {
        if (estimate-real == 0){
            System.out.println("Correct! " + food + " costs " + real + " dollars!");
            score +=3;
            System.out.println("Your current score:");
            return score;
        }
        else if (real / estimate <= 1.15 && real / estimate >=0.85) {
            System.out.println("You were close! " + food + " costs " + real + " dollars!");
            score+=2;
            System.out.println("Your current score:");
            return score;
        }
        else if(real / estimate <=1.5 && real / estimate >=0.5 || real%estimate == 0){
            System.out.println("You were kind of close. " + food + " costs " + real + " dollars.");
            score+=1;
            System.out.println("Your current score:");
            return score;
        }
        System.out.println("Uhoh, you were not close. " + food + " costs " + real + " dollars.");
        System.out.println("Your current score:");
        return score;
    }

    public static void asianguess(int cuisine, Scanner scanner) {
        int nori = 150;
        int rice = 60;
        int salmon = 50;
        int cucumber = 5;

        if (cuisine == 1) {
            proceed("1 pack of nori", nori, scanner);
            proceed("1kg pack of japanese rice", rice, scanner);
            proceed("50g of salmon", salmon, scanner);
            proceed("1 cucumber", cucumber, scanner);

        }
    }

    public static void proceed (String food, int real, Scanner scanner) {
        System.out.println(ask(food));
        int estimate = scanner.nextInt();
        System.out.println(pricecheck(estimate, real, food));
    }

    public static void westernguess(int cuisine, Scanner scanner) {

        int beef = 50;
        int spaghetti = 40;
        int onion = 6;
        int tomato = 40;

        if (cuisine == 2) {
            proceed("50g of minced beef", beef, scanner);
            proceed("1 pack of dried spaghetti", spaghetti, scanner);
            proceed("1 white onion", onion, scanner);
            proceed("1 jar of tomato sauce", tomato, scanner);
        }
    }
   public static String score (){
     return "You scored" + score + "/12";
}

    public static Double result (int score) {
        return (double) score / 12 * 100;
    }

    public static String passorfail (int score){
        if(score/12 >=0.8){
            return "Congratulations! You successfully purchased all the ingredients required for dinner. Enjoy!";
        }
        return "Sorry, but you couldn't purchase all the ingredients required for dinner and now you are hungry. :( " ;
    }
}


// use * for the overall percentage
// use / for dividing the total score
// use % for multiple
// use - for ?
// logical operator x 1 done
// comparison operator x 2 done
// 10 if statements done
// 10 methods done