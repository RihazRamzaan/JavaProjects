import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("1: Convert kgs to lbs");
        System.out.print("Choose an option(1 or 2) :");

        choice = sc.nextInt();

        System.out.print("Enter the weight to convert: ");
        weight = sc.nextDouble();

        if(choice ==1 && weight>0){
            newWeight = weight * 0.453592;
            System.out.println("Converted weight: " + newWeight + " kgs");

        }
        else if (choice ==2 && weight>0) {
            newWeight = weight * 2.20462;
            System.out.println("Converted weight: " + newWeight + " lbs");

        }
        else
            System.out.println("Invalid choice or weight");

        sc.close();
    }
}
