import java.util.Scanner;

public class SmartThermostat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battery = 100; 
        int hour = 0;
        double temp;

        while (battery > 0) {
            hour ++;
            System.out.print("ENTER ROOM TEMPERATURE : ");
            temp = sc.nextDouble();
            if(temp < 18 || temp > 25) {
                battery -= 15;
                System.out.println("HVAC RUNNING");
            }
            else{
                battery -= 2;
                System.out.println("STANDBY MODE");
            }
            System.out.println("REMAINING BATTERY : " + battery + "%");
            System.out.println("====================================");
        }
        System.out.println("TOTAL HOURS SURVIVED : " + hour);
        sc.close();
    }
}
