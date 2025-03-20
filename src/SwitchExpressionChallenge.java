public class SwitchExpressionChallenge {

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println("Day " + day + " corresponds to: " + dayOfTheWeek);
    }

    public static void printWeekDay(int day) {

        String[] days = {
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday"
        };

        String dayOfTheWeek = (day >= 0 && day < days.length) ? days[day] : "Invalid Day";

        System.out.println("Day " + day + " corresponds to: " + dayOfTheWeek);
    }

    public static void main(String[] args) {

        for  (int i = 0; i <= 7; i++) {
            printDayOfWeek(i);
        }

        System.out.println("\nUsing optimized array alternative:");
        for (int i = 0; i <= 7; i++) {
            printWeekDay(i);
        }


    }
}
