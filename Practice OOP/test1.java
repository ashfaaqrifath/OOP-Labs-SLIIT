import java.util.Scanner;

public class test1{

    public static double CalcSnailLaw(float indexB, int angleA, int angleB){

        double angleA_rad = Math.toRadians(angleA);
        double angleB_rad = Math.toRadians(angleB);

        double result = indexB * Math.sin(angleA_rad) / Math.sin(angleB_rad);

        return result;
    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index of refraction in material b: ");
        float indexB = scanner.nextFloat();

        System.out.print("Enter the angle of light relative to normal to the barrier in material a: ");
        int angleA = scanner.nextInt();

        System.out.print("Enter the angle of light relative to normal to the barrier in material b: ");
        int angleB = scanner.nextInt();

        scanner.close();


        double result1 = CalcSnailLaw(indexB, angleA, angleB);
        System.out.println("Index of refraction in material: " + result1);

        double roundedResult = Math.round(result1 * 100.0) / 100.0;
        System.out.println("Rounded answer: " + roundedResult);

        if(roundedResult > 1.02 && roundedResult < 1.03){
            System.out.println("Material is air");
        }

        else if(roundedResult > 1.03 && roundedResult <= 1.05){
            System.out.println("Material is water");
        }

        else if(roundedResult > 1.05 && roundedResult < 1.06){
            System.out.println("Material is crown glass");
        }

        else{
            System.out.println("Material is unknown");
        }
    }
}