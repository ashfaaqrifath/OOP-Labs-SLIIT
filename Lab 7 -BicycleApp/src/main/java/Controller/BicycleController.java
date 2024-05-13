package Controller;

import Model.Bicycle;

public class BicycleController {
    public Bicycle addBicycle(int gear, double speed) {
        Bicycle bicycle = new Bicycle(gear, speed);
        return bicycle;
    }
}
