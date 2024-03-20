import java.util.Scanner;

class ex3{

    public static void main(String[] args){

        String[] vowels = {"a", "e", "i", "o", "u"};
        int num = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 letter word: ");
        String word = input.nextLine();

        for(int i = 0; i < 10; i++){

            char ch = word.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                num = num + 1;
            }
        }
        System.out.println(num);
    }
    
}
