package Controller;

import Model.Rider;

public class RiderController {
    public Rider addRider(String Name, String Country, int Age, float Weight, float Height){
        Rider rider = new Rider(Name, Country, Age, Weight, Height);
        return rider;
    }

    public Rider.Records addRecords(Rider rider, int No_Of_Olympic_Medals, float TopSpeed, int No_National_Level_Records){
        Rider.Records records = rider.new Records(No_Of_Olympic_Medals, TopSpeed, No_National_Level_Records);
        return records;
    }
}
