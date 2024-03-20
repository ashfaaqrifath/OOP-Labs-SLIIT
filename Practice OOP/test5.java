public class test5{

    public static void main(String[] args){
        String msg = args[0];
        int reps = Integer.parseInt(args[1]);

        char temp = msg.charAt(1);

        int i = 0;

        while(i < reps){
            System.out.println(temp);
            i++;
        }

    }
}