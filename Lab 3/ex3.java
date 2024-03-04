import java.util.Scanner;

class DisplayDetails {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemname = scanner.nextLine();

        System.out.print("Enter unit price: ");
        int unitPrice = scanner.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        int total = unitPrice * quantity;
        System.out.print("Total price: " + total);

        scanner.close();
        
    }

}