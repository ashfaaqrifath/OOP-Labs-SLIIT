public class test4{
    
    public static void main(String[] args){

        String msg = args[0];
        int reps = Integer.parseInt(args[1]);

        String uppercaseString = msg.toUpperCase();

        int i = 0;

        while(i < reps){

            i++;
            System.out.println(uppercaseString);
        }

    }
}
