package sheet1;

public class Question11 {
    public static void main(String[] args) {
        System.out.println("Sheet 1 - Question 11");
        //atlanta
        double atlX=33.7489954;
        double atlY=-84.3879824;
        //savannah
        double savX=32.0835407;
        double savY=-81.0998342;
        //charlotte
        double chrlX=35.2270869;
        double chrlY=-80.8431267;
        //orlando
        double orlX=28.5383355;
        double orlY=-81.3792365;
        //sides
        double atl_chrl=distance(atlX,atlY,chrlX,chrlY);//a-b
        double atl_orl=distance(atlX,atlY,orlX,orlY);//a-c
        double sav_chrl=distance(savX,savY,chrlX,chrlY);//d-b
        double sav_orl=distance(savX,savY,orlX,orlY);//d-c
        double chrl_orl=distance(chrlX,chrlY,orlX,orlY);//b-c imaginaryBase
        //area of triangle a
        double s1=(atl_chrl + atl_orl + chrl_orl)/2;
        double triangle1Area=Math.sqrt(s1*(s1 - atl_chrl)*(s1 - atl_orl)*(s1 - chrl_orl));
        //area of triangle b
        double s2=(sav_chrl + sav_orl + chrl_orl)/2;
        double triangle2Area=Math.sqrt(s2*(s2 - sav_chrl)*(s2 - sav_orl)*(s2 - chrl_orl));
        //final area
        double polygonsArea=triangle1Area+triangle2Area;
        System.out.printf("Approximate area: %.4f km²%n", polygonsArea);

    }
    static double distance(double x1,double y1,double x2,double y2){
        double radius=6371.01;
        x1=Math.toRadians(x1);
        y1=Math.toRadians(y1);
        x2=Math.toRadians(x2);
        y2=Math.toRadians(y2);
        double inacos=Math.sin(x1)*Math.sin(x2)+
                Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2);
        inacos = Math.min(1.0, Math.max(-1.0, inacos));
        return radius*Math.acos(inacos);
    }
}