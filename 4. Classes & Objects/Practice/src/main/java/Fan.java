/**
UML     |-------------------------------------|
        |              Fan                    |
        |-------------------------------------|
        | -SLOW: int                          |
        | -MEDIUM: int                        |
        | -FAST: int                          |
        | -speed: int                         |
        | -on: boolean                        |
        | -radius: double                     |
        | -color: String                      |
        +-------------------------------------|
        | +Fan()                              |
        | +getSpeed(): int                    |
        | +setSpeed(newSpeed: int): void      |
        | +isOn(): boolean                    |
        | +setOn(newOn: boolean): void        |
        | +getRadius(): double                |
        | +setRadius(newRadius: double): void |
        | +getColor(): String                 |
        | +setColor(newColor: String): void   |
        | +toString(): String                 |
        |-------------------------------------|
*/

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public void setSpeed(int speed) {
        if (speed > 0 && speed < 4) {
            this.speed = speed;
        }
    }
    public int getSpeed() {
        return speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String informationAboutFan() {
        if (isOn()) {
            return "Your fan is ON. Speed: " + getSpeed() + ", color: " + getColor() + " and radius: " + getRadius() + ".";
        }
        return "Your fan is OFF. Color: " + getColor() + " and radius: " + getRadius() + ".";
    }
    public static void main(String[] args) {
        Fan myFan1 = new Fan();
        Fan myFan2 = new Fan();

        myFan1.setSpeed(2);
        myFan1.setRadius(6);
        myFan1.setColor("Yellow");
        myFan1.setOn(true);
        System.out.println(myFan1.informationAboutFan());
        System.out.println(myFan2.informationAboutFan());
    }
}
