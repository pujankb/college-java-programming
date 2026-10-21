import java.util.Scanner;
public class StudentProfileGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Student's Full Name");
        String name = sc.nextLine();
        System.out.println("Enter Student's Age");
        int age = sc.nextInt();
        System.out.println("Enter Student's Grade Percentage:");
        double grade = sc.nextDouble();
        System.out.println("\n Generating Profile.....");
        System.out.println("=============================================================");
        System.out.println("          STUDENT'S ID CARD          ");
        System.out.println("=============================================================");
        System.out.println("Name          :" +name);
        System.out.println("Age          :"+age +" years old");
        System.out.println("Grade Percentage: "+grade + "%");
        System.out.println("=============================================================");

        sc.close();
    }
}
