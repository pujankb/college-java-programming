import java.util.Scanner;
public class FitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========Enter Fitness Data==========");
        System.out.println("Enter Member Name");
        String name = sc.nextLine();

        System.out.println("Enter Daily Steps Goal");
        int stepGoal = sc.nextInt();

        System.out.println("Enter Distance Walked (KM):");
        double distance = sc.nextDouble();
        
        System.out.println("Completed Hydration Goal (True/False): ");
        boolean hydration = sc.nextBoolean();

        System.out.println("\n ========== Fitness Report ==========");
        System.out.println("Name: " + name);
        System.out.println("Daily Step Goal: " + stepGoal);
        System.out.println("Distance Walked: " + distance + " KM");
        System.out.println("Hyderation Goal: " + hydration);
        System.out.println("=========================================");

        sc.close();
    }
}
