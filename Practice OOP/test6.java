import java.util.Scanner;

public class test6 {
    
    public static float calculateCosmology(int p, float c){

        final double G = 6.67408;

        double calc = ((8 * Math.PI * G) / 3 * Math.pow(c, 2) * p);

        float cosmology = (float) calc;

        return cosmology;
    }


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter density: ");
        int density = input.nextInt();

        System.out.println("Enter distance: ");
        float distance = input.nextFloat();

        float result = calculateCosmology(density, distance);

        System.out.println(result);
    }
}
