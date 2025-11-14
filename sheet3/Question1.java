package sheet3;

public class Question1 {
    public static void main(String[] args) {
        rectangle rec1=new rectangle(4,40);
        rectangle rec2=new rectangle(3.5,35.9);
        System.out.println("rec1 width: "+rec1.getWidth());
        System.out.println("rec1 height: "+rec1.getHeight());
        System.out.println("rec1 area: "+rec1.getArea());
        System.out.println("rec1 parimeter: "+rec1.getParimeter());
        System.out.println("rec2 width: "+rec2.getWidth());
        System.out.println("rec2 height: "+rec2.getHeight());
        System.out.println("rec2 area: "+rec2.getArea());
        System.out.println("rec2 parimeter: "+rec2.getParimeter());
    }
}
class rectangle{
    private double width;
    private double height;
    public rectangle(){
        width=1;
        height=1;

    }
    public rectangle(double width,double height){
        this.width=(width > 0) ? width : 1;
        this.height=(width > 0) ? height : 1;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return height*width;
    }

    public double getParimeter() {
        return 2*(width+height);
    }
}