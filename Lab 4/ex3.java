class ex3 {
    
    public static void main(String[] args){

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int max = (num1 > num2 ) ? num1 : num2;

        System.out.println("Maximum is: " + max);
    }
}
