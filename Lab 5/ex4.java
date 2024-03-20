import java.util.Scanner;

class ex4{

        public static int calMean(int value){
            int mean = value / 3;
            System.out.println("Mean value: " + mean);

            return mean;
        }

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            int num = 0;
            int sum = 0;

            for(int i = 0; i < 3; i++){

                System.out.println("Enter number: ");
                num = input.nextInt();

                String terminate = input.next();

                if(terminate.equalsIgnoreCase("exit")){
                    input.close();
                }

                sum = num + sum;
            }
            
            calMean(sum);

    }
}