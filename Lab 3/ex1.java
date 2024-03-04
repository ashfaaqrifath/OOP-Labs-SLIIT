class CurrencyConverter{
    public static void main(String[] args){
        final float USD = 365;
        final float EURO = 364.18f;
        final float POUND = 431.52f;

        float amount = Float.parseFloat(args[0]);

        System.out.println(amount+ " LKR = "+(amount/USD)+ " $");
        System.out.println(amount+ " LKR = "+(amount/EURO)+ " EURO");
        System.out.println(amount+ " LKR = "+(amount/POUND)+ " POUNDS");
    }
}