class ex5{
    
    public static void main(String[] args){

        genRandom();

    }

    public static void genRandom(){

        for(int i = 0; i < 5; i++){
            
            int num = (int) (Math.random() * 100) + 1;
            System.out.println(num);
        }

    }
}
