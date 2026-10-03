import java.util.Scanner;

public class Solarsystem2c {
     static double calculateTotalEnergy(double morningenergy,double eveningenergy) 
    {
        return morningenergy+eveningenergy;
    }
        public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter morning energy in kWh: ");
        double morningenergy = sc.nextDouble();
        System.out.print("Enter evening energy in kWh: ");
        double eveningenergy = sc.nextDouble();
        double totalEnergy = calculateTotalEnergy(morningenergy,eveningenergy);
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");
        sc.close();
    }
}