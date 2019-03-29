import java.io.BufferedReader;
import  java.io.IOException;
import java.io.InputStreamReader;

public class Enums {
        enum Season {
            WINTER, SPRING, SUMMER, AUTUMN
        }
        public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("What is the month now?");
        String input = br.readLine();

        switch (input.toLowerCase()) {
            case "january":
            case "february":
            case "december":
                System.out.println(Season.WINTER);
                break;
            case "march":
            case "april":
            case "may":
                System.out.println(Season.SPRING);
                break;
            case "june":
            case "july":
            case "august":
                System.out.println(Season.SUMMER);
                break;
            case "september":
            case "october":
            case "november":
                System.out.println(Season.AUTUMN);
                break;
            default:
                System.out.println("404. Month not Found");
                break;
        }
    }
}