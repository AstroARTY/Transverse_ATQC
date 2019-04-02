import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Enums {
    enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        Season season;
        season = null;
        System.out.println("What is the month now?");
        String input = br.readLine();
        String month = input.toLowerCase();
        switch (month) {
            case "january":
            case "february":
            case "december":
                season = Season.WINTER;
                break;
            case "march":
            case "april":
            case "may":
                season = Season.SPRING;
                break;
            case "june":
            case "july":
            case "august":
                season = Season.SUMMER;
                break;
            case "september":
            case "october":
            case "november":
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("404. Month not Found");
                break;
        }
        if(season != null){
            System.out.println("Current season is " + season);
        }
    }
}