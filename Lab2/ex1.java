class DistanceConverter{
    public static void main(String[] args){
        final int miles_in_marathon = 26;
        final int yards_in_marathon = 385;
        final double km_per_mile = 1.609;
        final double yards_per_mile = 1760.0;
    double kilometers = miles_in_marathon * km_per_mile + yards_in_marathon / yards_per_mile * km_per_mile;
        System.out.println(kilometers);
        
    }
}