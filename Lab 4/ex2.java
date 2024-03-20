class ex2{
    
    public static void main(String[] args){
        
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        if(num1 < num2){
            System.out.println("Minimum is: " + num1);
        }
        else{
            System.out.println("Minimum is: " + num2);
        }
    }
}
