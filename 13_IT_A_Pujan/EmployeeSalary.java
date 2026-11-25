import java.util.Scanner;
public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF EMPLOYEES : ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++) {
            System.out.println("\n Employees " + i);
            System.out.print("ENTER HOURLY WAGE : ");
            double hourlyWage  = sc.nextDouble();
            System.out.print("ENTER HOURS WORKED : ");
            double hoursWorked = sc.nextDouble();
            double grossPay;
            if(hoursWorked > 160) {
                double regularPay = 160 * hourlyWage;
                double overtimeHours = hoursWorked - 160;
                double overtimePay = overtimeHours * hourlyWage * 1.5 ; 
                grossPay = regularPay + overtimePay;
            }
            else {
                grossPay = hoursWorked * hourlyWage;
            }
            System.out.println("GROSS SALARY = " + grossPay);
        }
        sc.close();
    }
}
