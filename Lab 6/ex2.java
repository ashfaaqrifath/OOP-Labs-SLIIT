import java.util.Scanner;

class ex2{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 3; i++){

            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.print("Enter number: ");
            String number = input.nextLine();

            System.out.print("Enter job title: ");
            String job = input.nextLine();

            System.out.println(name);
            System.out.println(number);
            System.out.println(job);

            System.out.print("Do you want to continue: ");
            String option = input.nextLine();

            if(option.equalsIgnoreCase("n")){
                input.close();
            }
        }
    }
    
}
