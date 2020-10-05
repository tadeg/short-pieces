public class DayOfTheWeek {
    
    // The switch statement vs. if then else statement

    public static void printDayOfTheWeek (int day) {

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printDayOfTheWeekAlt(int day) {

        int dayNr = 1;
        if (dayNr == 1) {
            System.out.println("Monday");
        } else if (dayNr == 2) {
            System.out.println("Tuesday");
        } else if (dayNr == 3) {
            System.out.println("Wednesday");
        } else if (dayNr == 4) {
            System.out.println("Thursday");
        } else if (dayNr == 5) {
            System.out.println("Friday");
        } else if (dayNr == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}

