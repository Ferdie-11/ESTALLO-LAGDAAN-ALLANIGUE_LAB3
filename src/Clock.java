import java.util.Scanner;

public class Clock {
        // Converts seconds to minutes
    public static double secondsToMinutes(double seconds) {
        return seconds / 60;
    }
        // Converts seconds to hours
    public static double secondsToHours(double seconds) {
        return seconds / 3600;
    }
         // Converts minutes to seconds
    public static double minutesToSeconds(double minutes) {
        return minutes * 60;
    }
        // Converts minutes to hours
    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }
         // Converts hours to seconds
    public static double hoursToSeconds(double hours) {
        return hours * 3600;
    }
        // Converts hours to minutes
    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

	// Main method to execute the program
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); // Initialize the Scanner for user input
       boolean continueConversion = true; // control the conversion loop
        // Main loop for conversion
       while (continueConversion) {
        displayMenu(); // Display the options menu
        int choice = scanner.nextInt(); // Read user's choice  
         // Switch case for handling user's choice
        switch (choice) {
            case 1:
                // Convert seconds to minutes
                System.out.print("Enter seconds: ");
                double secondsToMin = scanner.nextDouble();
                System.out.println(secondsToMin + " seconds is " + secondsToMinutes(secondsToMin) + " minutes");
                break;
            case 2:
                // Convert seconds to hours
                System.out.print("Enter seconds: ");
                double secondsToHour = scanner.nextDouble();
                System.out.println(secondsToHour + " seconds is " + secondsToHours(secondsToHour) + " hours");
                break;
            case 3:
                // Convert minutes to seconds
                System.out.print("Enter minutes: ");
                double minutesToSec = scanner.nextDouble();
                System.out.println(minutesToSec + " minutes is " + minutesToSeconds(minutesToSec) + " seconds");
                break;
            case 4:
                // Convert minutes to hours
                System.out.print("Enter minutes: ");
                double minutesToHour = scanner.nextDouble();
                System.out.println(minutesToHour + " minutes is " + minutesToHours(minutesToHour) + " hours");
                break;
            case 5:
                // Convert hours to seconds
                System.out.print("Enter hours: ");
                double hoursToSec = scanner.nextDouble();
                System.out.println(hoursToSec + " hours is " + hoursToSeconds(hoursToSec) + " seconds");
                break;
            case 6:
                // Convert hours to minutes
                System.out.print("Enter hours: ");
                double hoursToMin = scanner.nextDouble();
                System.out.println(hoursToMin + " hours is " + hoursToMinutes(hoursToMin) + " minutes");
                break;
            default:
                // Handle invalid choice
                System.out.println("Invalid choice. Please choose a valid option.");
                break;
        }
        // Ask if user wants to perform another conversion
      System.out.print("Do you want to convert time? (Y/N): ");
      char continueChoice = scanner.next().charAt(0);
      if (continueChoice == 'N' || continueChoice == 'n') {
          continueConversion = false;
      }
  }
    scanner.close(); // Close the Program
}
     // Display menu of available conversion options
  public static void displayMenu(){
    System.out.println("[1] Seconds to Minutes");
    System.out.println("[2] Seconds to Hours");
    System.out.println("[3] Minutes to Seconds");
    System.out.println("[4] Minutes to Hours");
    System.out.println("[5] Hours to Seconds");
    System.out.println("[6] Hours to Minutes");
    System.out.println("Choose the conversion: ");

}


}





