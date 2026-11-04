
import java.util.Scanner;

class SecurityPortal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int clearance;
        int attempts;
        boolean fingerprint;

        System.out.print("Enter base security clearance level: ");
        clearance = sc.nextInt();

        System.out.print("Enter number of login attempts: ");
        attempts = sc.nextInt();

        System.out.print("Have you passed manual fingerprint scan (true/false): ");
        fingerprint = sc.nextBoolean();

        String result = (clearance >= 3 && attempts <= 3 && fingerprint)
                ? "Access Granted!"
                : (clearance < 3 || attempts > 3)
                ? "Access Denied!"
                : (!fingerprint)
                ? "Fingerprint not verified."
                : "Security Check Failed!";

        System.out.println(result);
        System.out.println("Security checking completed.");

        sc.close();
    }
}
