import java.util.Scanner;

class ElevatorCapacity{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight of person in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter number of people: ");
        int number = input.nextInt();

        double totalWeight = weight * number;

        int maxPeople = (int) (1320 / weight);

        if(totalWeight <= 1320){
            System.out.println("All " +number+ " can fit in the elevator.");
        }
        else{
            System.out.println("Only " +maxPeople+ " can fit in the elevator.");
        }

        input.close();
    }
}