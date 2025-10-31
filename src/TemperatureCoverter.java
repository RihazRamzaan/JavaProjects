
import java.util.Scanner;

public class TemperatureCoverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print(" Enter the temperature: ");
        temp = sc.nextDouble();

        System.out.print(" Convert to Celsius or Fahrenheit (C or F): ");
        unit = sc.next().toUpperCase();

        newTemp = (unit.equals("C") ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32);

        System.out.printf("The converted temperature: %.1f°%s\n",newTemp, unit);


        sc.close();
    }
}
