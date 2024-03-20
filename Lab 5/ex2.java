import java.util.Scanner;

class ex2{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        if(year >= 1800 && year <= 3000){
            if((year % 400 == 0) || (year % 4 ==0) && (year % 100 != 0)){

                System.out.println("Leap year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }
        else{
            System.out.println("Invalid year");
        }

        input.close();
    }
    
}
