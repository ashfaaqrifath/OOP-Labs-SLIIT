import java.util.Scanner;

class test3 {
    
    public static float calculateMSpeed(double molar, double temp){
        final double r = 8.3144598;

        double calc = Math.sqrt((3 * r * temp / molar) * 10 * 10 * 10);

        float rootMean = (float) calc;

        return rootMean;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter molar mass in kg per mole: ");
        double molar = input.nextDouble();

        System.out.print("Enter temp in kelvin: ");
        double temp = input.nextDouble();

        float result = calculateMSpeed(molar, temp);
        System.out.println(result);

        double rounded = Math.round(result * 100.0) / 100.0;
        System.out.println(rounded);

        if(rounded > 0 || rounded < 500){
            System.out.println("Category of speed: slow");
        }

        else if(rounded > 501 || rounded < 1000){
            System.out.println("Category of speed: medium");
        }

        else if(rounded >= 1001){
            System.out.println("Category of speed: fast");
        }

        input.close();

    }
}
