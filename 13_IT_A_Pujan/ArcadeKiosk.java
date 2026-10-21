import java.util.Scanner;
public class ArcadeKiosk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Gamer Tag: ");
        String gamerTag = sc.nextLine();

        System.out.println("Enter Base Score: ");
        int baseScore =     sc.nextInt();

        System.out.println("Enter Difficulty Multiplier: ");
        double multiplier = sc.nextDouble();
        
        double totalScore = baseScore * multiplier;
        int tickets = (int) totalScore;

        System.out.println("\n ========== Ticket Recipt ==========");
        System.out.println("Gamer Tag: " + gamerTag);
        System.out.println("\n Base Score: " + baseScore);
        System.out.println("\n Multiplier: " + multiplier);
        System.out.println("\n Ticket Earned: "+ tickets);
        System.out.println("\n ====================================");

        sc.close();
    }
}
