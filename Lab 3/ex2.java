import java.util.Scanner;

class ReadConsole{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your zodiac sign: ");
        String zodiac = scanner.next();

        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your lucky number: ");
        int luckyNum = scanner.nextInt();

        System.out.println("Hello, " + name);
        System.out.println("Your lucky number is " + luckyNum);
        System.out.println("Your weight is " +weight+ " kg");
        System.out.println("Your zodiac sign is " + zodiac);

        scanner.close();

    }
}