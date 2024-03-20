import java.util.Scanner;

class moneyBalance{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account balance: ");
        int balance = input.nextInt();

        if(balance > 50000){
            int abalance = (balance / 100) * 8 + balance;
            System.out.println("Updated balance is " + abalance);
        }
        else if(balance > 25000 && balance <= 50000){
            int abalance = (balance / 100) * 5 + balance;
            System.out.println("Updated balance is " + abalance);
        }
        else if(balance > 10000 && balance <= 25000){
            int abalance = (balance / 100) * 2 + balance;
            System.out.println("Updated balance is " + abalance);
        }
        else{
            System.out.println("Updated balance is " + balance);
        }

        input.close();
    }
}