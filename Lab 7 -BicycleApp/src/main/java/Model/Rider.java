package Model;

public class Rider {

    String Name;
    String Country;
    int Age;
    double Weight;
    double Height;

    public Rider(String Name, String Country, int Age, double Weight, double Height) {
        this.Name = Name;
        this.Country = Country;
        this.Age = Age;
        this.Weight = Weight;
        this.Height = Height;
    }

    public class Records{
        int No_Of_Olympic_Medals;
        double TopSpeed;
        int No_National_Level_Records;

        public Records(int no_Of_Olympic_Medals, double topSpeed, int no_National_Level_Records) {
            this.No_Of_Olympic_Medals = no_Of_Olympic_Medals;
            this.TopSpeed = topSpeed;
            this.No_National_Level_Records = no_National_Level_Records;
        }

        public String displayRecord(){
            return No_Of_Olympic_Medals +""+TopSpeed+" "+No_National_Level_Records;
        }
    }

    public double calBMI(double WeightM, double HeightM){

        class BMI{
            double WeightMetric;
            double HeightMetric;

            public BMI(double weightMetric, double heightMetric) {
                this.WeightMetric = weightMetric;
                this.HeightMetric = heightMetric;
            }

            double bmiMetric(){
                double bmi = WeightMetric/(HeightMetric*HeightMetric);
                return bmi;
            }
        }

        BMI bmi = new BMI(WeightM, HeightM);
        return bmi.bmiMetric();
    }
}
