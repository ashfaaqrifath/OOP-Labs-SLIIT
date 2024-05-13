package Model;

public class Bicycle {
    int gear;
    double speed;

    public Bicycle(int gear, double speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreak(double dec) {
//        this.speed = this.speed - dec;
        this.speed -= dec;
    }

    public void speedUp(double inc) {
//        this.speed = this.speed + inc;
        this.speed += inc;
    }

    public String toString() {
        return "The current speed is " + this.speed + " & gear is " +
                this.gear;
    }

}
