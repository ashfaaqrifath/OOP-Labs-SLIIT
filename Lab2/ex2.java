class DistanceConverter{
    public static void main(String[] args){
        final int MILES_IN_MARATHON = 26;
        final int YARDS_IN_MARATHON = 385;
        final double KILOMETER_PER_MILE = 1.609;
        final double YARDS_PER_MILE = 1760.0;
    double kilometers = MILES_IN_MARATHON * KILOMETER_PER_MILE + YARDS_IN_MARATHON / YARDS_PER_MILE * KILOMETER_PER_MILE;
        System.out.println(kilometers);
        
    }
}