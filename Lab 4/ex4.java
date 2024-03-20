class ex4 {
    
    public static void main(String[] args){

        int demand = Integer.parseInt(args[0]);
        int setup = Integer.parseInt(args[1]);
        int holding = Integer.parseInt(args[2]);

        double eoq = Math.sqrt(2 * demand * setup / holding);

        double tbo = Math.sqrt(2 * setup / demand * holding);

        System.out.println(eoq);
        System.out.println(tbo);
    }
}