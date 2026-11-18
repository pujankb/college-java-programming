import java.util.Scanner;

public class RideSharing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====RIDE SHARE PRICING KIOSK=====");
        System.out.print("ENTER RIDER NAME : ");
        String riderName = scanner.nextLine();
        
        System.out.print("ENTER BASE FARE : ");
        double fare = scanner.nextDouble();

        System.out.print("ENTER DISTANCE TO BE TRAVELLED : ");
        int distance = scanner.nextInt();

        System.out.print("PEAK TRAFFIC HOUR (TRUE/FALSE) : ");
        boolean peakHour = scanner.nextBoolean();

        if(peakHour && distance > 10) {
            fare += 10.0;
            System.out.println("\n[ALERT] SURGE PRICING APPLIED FOR LONG DISTANCE PEAK HOUR ");
        }
        else{
            System.out.println("\nSTANDARD RATES APPLIED");
        }
        System.out.println("================================================================");
        System.out.println("RIDER: " +riderName);
        System.out.println("FINAL BILL AMOUNT: " +fare);
        System.out.println("================================================================");
        scanner.close();
    }
}