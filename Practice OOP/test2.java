public class test2{
    public static void main(String[] args){
        
        double start = Double.parseDouble(args[0]);
        double end = Double.parseDouble(args[1]);

        int count = 0;
        double sum = 0;

        for(double i = start; i <= end;i +=10 ){
            sum = sum + Math.atan(i);
            count++;
        }
        double avg = sum / count;

        System.out.println("Sum = " + sum + " / " + count + " = " + avg);
    }
}