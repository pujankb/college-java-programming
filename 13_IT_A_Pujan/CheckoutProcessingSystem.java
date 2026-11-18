import java.util.Scanner;
public class CheckoutProcessingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== CHECKOUT TERMINAL =====");
        System.out.print("ENTER CUSTOMER NAME : ");
        String CustomerName = scanner.nextLine();

        System.out.print("ENTER CART SUBTOTAL : ");
        double subtotal = scanner.nextDouble();

        System.out.print("ENTER LOYALTY POINTS : ");
        int points = scanner.nextInt();

        System.out.print("ELITE VOUCHER (TRUE/FLASE) : ");
        boolean voucher = scanner.nextBoolean();

        double discountPercent = 0.0;

        if(subtotal > 200 || voucher == true) {
            if(points >= 500){
                discountPercent = 0.20;
                System.out.println("\nVIP STATUS DETECTED...20 % DISCOUNT APPLIED");
            } else {
                discountPercent = 0.10;
                System.out.println("\n10% DISCOUNT APPLIED");
            }
        } else {
            System.out.println("\nNO DISCOUNT QUALIFICATIONS MET");
        }
        double discountAmount = subtotal * discountPercent;
        subtotal -= discountAmount;
        if(subtotal > 150){
            points++;
            System.out.println("BONUS! YOU HAVE EARNED A LOYALTY POINT : ");
        }
        System.out.println("==============================================");
        System.out.println("     FINAL INVOICE     ");
        System.out.println("==============================================");
        System.out.println("CUSTOMER NAME : " + CustomerName);
        System.out.println("DISCOUNT HANDED : " + discountAmount);
        System.out.println("TOTAL AMOUNT DUE : " + subtotal);
        System.out.println("UPDATED POINTS : " + points);
        System.out.println("==============================================");

        scanner.close();
    }
}
