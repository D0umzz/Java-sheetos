package sheet3;

public class Question7 {
    public static void main(String[] args) {
        Fan fan1=new Fan(Fan.FAST,10,"yellow",true);
        Fan fan2=new Fan(Fan.MEDIUM,5,"blue",false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
class Fan{
    public static final int SLOW=1;
    public static final int MEDIUM=2;
    public static final int FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        on =false;
        radius =5;
        color ="blue";
    }
    public Fan(int speed,double radius,String color,boolean on){
        this();
        this.speed=(on)?speed:0;
        this.radius=(radius>=5)?radius:this.radius;
        this.color = (color != null&& !color.isEmpty()) ? color : this.color;
        this.on=on;
    }

    public void TurnOn() {
        if(!on) {
            on = true;
        }
        else System.out.println("its already on");
    }

    public void setRadius(double radius) {
        if (radius>0){
            this.radius = radius;
        }
        else radius=5;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        if(speed<=3&&speed>=1){
            this.speed = speed;
        }
        else speed=0;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan is ON | speed = " + speed + " | color = " + color + " | radius = " + radius;
        } else {
            return "Fan is OFF | color = " + color + " | radius = " + radius;
        }
    }


    public boolean getٍStatus() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}