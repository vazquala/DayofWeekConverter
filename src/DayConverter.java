import java.util.Scanner;

public class DayConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randomNumber = input.nextInt();
        String day;

        switch (randomNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid";
                break;
        }

        System.out.println(day);

        String dayAgain = switch (randomNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };

        System.out.println(dayAgain);
    }
}