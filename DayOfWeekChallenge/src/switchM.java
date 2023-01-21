public class switchM {
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("This day is Sunday");
                break;
            case 1:
                System.out.println("This day is Monday");
                break;
            case 2:
                System.out.println("This day is Tuesday" );
                break;
            case 3:
                System.out.println("This day is Wednesday");
                break;
            case 4:
                System.out.println("This day is Thursday");
                break;
            case 5:
                System.out.println("This day is Friday" );
                break;
            case 6:
                System.out.println("This day is Saturday" );
                break;
            default:
                System.out.println("Please enter the correct day ");
                break;
        }
    }
}
