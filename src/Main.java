import java.util.Scanner;

public class Main {



public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String[] count = {"a", "two", "three", "four", "five", "six",    "seven", "eight", "nine", "ten", "eleven", "twelve"};
    String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth"};
    String[] gifts = new String[12];
    for (int i = 0; i < 12; i++) {
        System.out.print("Gift for the " + days[i] + " day of Christmas: ");
        gifts[i] = input.nextLine();
    }
    for (int i = 0; i < 12; i++) {
        System.out.println("On the " + days[i] + " day of Christmas");
        System.out.println("My true love gave to me");
        for (int j = i; j >= 0; j--) {
            if (i == 0) {
                System.out.println(count[i] + " " + gifts[0]);
            } else if (j == 0){
                System.out.println("and " + count[0] + " " + gifts[0]);
            } else {
                System.out.println(count[j] + " " + gifts[j]);
            }
        }
    System.out.println();
    	}
	}
}