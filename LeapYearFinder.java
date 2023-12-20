public class LeapYearFinder {

    public static void main(String[] args) {
        // Check if two command line arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide two command line arguments: startYear and endYear");
            return;
        }

        // Parse command line arguments as integers
        int startYear = Integer.parseInt(args[0]);
        int endYear = Integer.parseInt(args[1]);

        // Validate the range of years
        if (startYear > endYear) {
            System.out.println("Invalid range: startYear should be less than or equal to endYear");
            return;
        }

        System.out.println("Leap years between " + startYear + " and " + endYear + ":");

        // Iterate through the range of years and check for leap years
        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                System.out.println(year);
            }
        }
    }

    // Function to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, but not divisible by 100 unless it is divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
