import java.util.Scanner;

public class Clock {

    public static double secondsToMinutes(double seconds) {
        return seconds / 60;
    }
    
    public static double secondsToHours(double seconds) {
        return seconds / 3600;
    }
    
    public static double minutesToSeconds(double minutes) {
        return minutes * 60;
    }
    
    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }
    
    public static double hoursToSeconds(double hours) {
        return hours * 3600;
    }
    
    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

	//main method....
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       boolean continueConversion = true; 

       while (continueConversion) {
        displayMenu();
        int choice = scanner.nextInt();    
        
        switch (choice) {
            case 1:
                System.out.print("Enter seconds: ");
                double secondsToMin = scanner.nextDouble();
                System.out.println(secondsToMin + " seconds is " + secondsToMinutes(secondsToMin) + " minutes");
                break;
            case 2:
                System.out.print("Enter seconds: ");
                double secondsToHour = scanner.nextDouble();
                System.out.println(secondsToHour + " seconds is " + secondsToHours(secondsToHour) + " hours");
                break;
            case 3:
                System.out.print("Enter minutes: ");
                double minutesToSec = scanner.nextDouble();
                System.out.println(minutesToSec + " minutes is " + minutesToSeconds(minutesToSec) + " seconds");
                break;
            case 4:
                System.out.print("Enter minutes: ");
                double minutesToHour = scanner.nextDouble();
                System.out.println(minutesToHour + " minutes is " + minutesToHours(minutesToHour) + " hours");
                break;
            case 5:
                System.out.print("Enter hours: ");
                double hoursToSec = scanner.nextDouble();
                System.out.println(hoursToSec + " hours is " + hoursToSeconds(hoursToSec) + " seconds");
                break;
            case 6:
                System.out.print("Enter hours: ");
                double hoursToMin = scanner.nextDouble();
                System.out.println(hoursToMin + " hours is " + hoursToMinutes(hoursToMin) + " minutes");
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
                break;
        }

      System.out.print("Do you want to convert time? (Y/N): ");
      char continueChoice = scanner.next().charAt(0);
      if (continueChoice == 'N' || continueChoice == 'n') {
          continueConversion = false;
      }
  }
    scanner.close();
}
  

}





