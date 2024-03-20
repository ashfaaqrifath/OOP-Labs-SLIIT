class ex6 {
    
    public static void main(String[] args){

        int month = Integer.parseInt(args[0]);

        if(month >= 12 && month <= 2){
            System.out.println("Season is Winter");
        }

        else if(month >= 3 && month <= 5){
            System.out.println("Season is Spring");
        }
        
        else if(month >= 6 && month <= 8){
            System.out.println("Season is Summer");
        }

        else if(month >= 9 && month <= 11){
            System.out.println("Season is Autumn");
        }
    }
}
